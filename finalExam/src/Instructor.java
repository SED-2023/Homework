import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Instructor {
    private LinkedHashMap<String, Student> students;
    private ArrayList<Level> schoolStrategy;
    private LinkedHashMap<String, Homework> homeworks;
    private RubricBuilder rubricBuilder;
    private LinkedHashMap<String, RankingStrategy> calculateStrategies;

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

    public void addHomework() {

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
}
