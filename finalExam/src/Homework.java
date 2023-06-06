import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

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

    public void averageCriterion() {
        for (Map.Entry<String, Assignment> entry : assignments.entrySet()) {
//            String author = entry.getKey();
            Assignment assignment = entry.getValue();
            for (Criterion criterion : rubric.getCriterion()) {
                double sum = 0;
                double count = assignment.getReviews().size();
                for (Map.Entry<String, Review> reviewEntry : assignment.getReviews().entrySet()) {
                    Review review = reviewEntry.getValue();
                    sum += review.getContent().get(criterion).getScore();
                }
                System.out.printf("Assignment: %s, Criterion: %s, AvgScore: %f\n", id, criterion.getName(), Math.round(sum / count));
            }
        }
    }

    public void calculateScore(String homeworkId, String studentId, RankingStrategy rankingStrategy) {
        Assignment asg = assignments.get(studentId);
        asg.calculateScore(rubric.getCriterion(), homeworkId, studentId, rankingStrategy);
    }

    public void findStrength(String homeworkId, String studentId, RankingStrategy rankingStrategy) {
        Assignment asg = assignments.get(studentId);
        asg.findStrength(rubric.getCriterion(), homeworkId, studentId, rankingStrategy);
    }

    public void findWeakness(String homeworkId, String studentId, RankingStrategy rankingStrategy) {
        Assignment asg = assignments.get(studentId);
        asg.findWeakness(rubric.getCriterion(), homeworkId, studentId, rankingStrategy);
    }


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

    public ArrayList<Criterion> getCriterionList() { return rubric.getCriterion(); }

}
