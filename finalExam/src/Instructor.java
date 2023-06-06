import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Instructor {
    private LinkedHashMap<String, Student> students = new LinkedHashMap<>();
    private ArrayList<Level> schoolStrategy = new ArrayList<>();
    private LinkedHashMap<String, Homework> homeworks = new LinkedHashMap<>();
    private RubricBuilder rubricBuilder;
    private LinkedHashMap<String, RankingStrategy> calculateStrategies = new LinkedHashMap<>();

    public void addStudent(ArrayList<String> ss) {
        for (String s : ss) {
            Student student = new Student();
            student.setId(s);
            students.put(s, student);
        }
    }

    public void setSchoolStrategy(ArrayList<String> level, ArrayList<String> score) {
        //TODO: assert level.size() == score.size()
        for (int i = 0; i < level.size(); i++) {
            Level lv = new Level(level.get(i), Integer.parseInt(score.get(i)));
            schoolStrategy.add(lv);
        }
    }

    public void averageCriterion(String homeworkID) {
        Homework hw = homeworks.get(homeworkID);
        hw.averageCriterion();
    }

    public void calculateScore(String homeworkID, String studentID, String rankingStrategy) {
        Homework hw = homeworks.get(homeworkID);
        Assignment assignment = hw.getAssignments().get(studentID);
        assignment.calculateScore(hw.getCriterionList(), homeworkID, studentID, calculateStrategies.get(rankingStrategy));
    }

    public void findStrength(String homeworkID, String studentID, String rankingStrategy) {
        Homework hw = homeworks.get(homeworkID);
        Assignment assignment = hw.getAssignments().get(studentID);
        assignment.findStrength(hw.getCriterionList(), homeworkID, studentID, calculateStrategies.get(rankingStrategy));
    }

    public void findWeakness(String homeworkID, String studentID, String rankingStrategy) {
        Homework hw = homeworks.get(homeworkID);
        Assignment assignment = hw.getAssignments().get(studentID);
        assignment.findWeakness(hw.getCriterionList(), homeworkID, studentID, calculateStrategies.get(rankingStrategy));
    }

    public void addHomework(String ID, ArrayList<ArrayList<String>> inputFileList){
        //corresponding command: designCriterion
        Homework hw = new Homework(ID);
        RubricBuilder rb = new RubricBuilder();

        for (ArrayList<String> row : inputFileList) {
            Criterion c = new Criterion(row.get(0));
            Level le = null;
            // iterate schoolStrategy to get level obj

            for (Level tempLev: schoolStrategy) {
                if (tempLev.getLevel().equals(row.get(1)) ){
                    le = tempLev;
                    break;
                }
            }

            String desc = row.get(2);
            rb = rb.addItem(c, le, desc);
        }

        Rubric r = rb.build();
        hw.setRubric(r);
        homeworks.put(ID, hw);
    }

    public void reviewAssignment(String homeworkID, String authorID, ArrayList<String> reviewerID, ArrayList<ArrayList<String>> inputFileList){
        Student student = students.get(authorID);
        Homework homework = homeworks.get(homeworkID);
        if (!homework.getAssignments().containsKey(authorID)) {
            Assignment newAssignment = new Assignment(students.get(authorID));
            homework.getAssignments().put(authorID, newAssignment);
        }
        Assignment assignment = homework.getAssignments().get(authorID);
        student.reviewAssignment(homework, assignment, reviewerID, inputFileList, schoolStrategy);
        //        for(String s: reviewerID){
//            Student student = students.get(s);
//            Homework homework = homeworks.get(homeworkID);
//            // if assignment not exist, create it
//            if (!homework.getAssignments().containsKey(authorID)) {
//                Assignment newAssignment = new Assignment(students.get(authorID));
//                homework.getAssignments().put(authorID, newAssignment);
//            }
//            Assignment assignment = homework.getAssignments().get(authorID);
//
//            student.reviewAssignment(homework, assignment, reviewerID, inputFileList, schoolStrategy);
//        }
    }

    public void printRubric(String homeworkID){
        homeworks.get(homeworkID).getRubric().printRubric();
    }
}
