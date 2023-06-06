import java.util.LinkedHashMap;

public class Homework {
    private String id;
    private int lowerBound = 3;

    private int upperBound = 5;

    private Rubric rubric;

    private RankingStrategy strategy;

    private LinkedHashMap<String, Assignment> assignments;

    public Homework(String id) {
        this.id = id;
        this.rubric = null;
        this.strategy = new MeanRankingStrategy();
        this.assignments = new LinkedHashMap<>();
    }

    public void averageCriterion(String homeworkId) {

    }

//    public void calculateScore(String homeworkId, String studentId, RankingStrategy rankingStrategy) {
//        Assignment asg = assignments.get(studentId);
//        asg.calculateScore(homeworkId, studentId, rankingStrategy);
//    }
//
//    public void findStrength(String homeworkId, String studentId, RankingStrategy rankingStrategy) {
//        Assignment asg = assignments.get(studentId);
//        asg.findStrength(homeworkId, studentId, rankingStrategy);
//    }
//
//    public void findWeakness(String homeworkId, String studentId, RankingStrategy rankingStrategy) {
//        Assignment asg = assignments.get(studentId);
//        asg.findWeakness(homeworkId, studentId, rankingStrategy);
//    }



    // getter setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public Rubric getRubric() {
        return rubric;
    }

    public void setRubric(Rubric rubric) {
        this.rubric = rubric;
    }

    public RankingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RankingStrategy strategy) {
        this.strategy = strategy;
    }

    public LinkedHashMap<String, Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(LinkedHashMap<String, Assignment> assignments) {
        this.assignments = assignments;
    }
}
