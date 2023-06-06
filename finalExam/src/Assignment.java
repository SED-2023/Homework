import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment {
    private Student author;
    private LinkedHashMap<String, Review> reviews;

    public Assignment(Student author) {
        this.author = author;
        this.reviews = new LinkedHashMap<>();
    }

    public void addReview(Review review) {
        // add review to reviews
        reviews.put(review.getStudentId(), review);
    }

    public void calculateScore(ArrayList<Criterion> criterionList, String homeworkId, String studentId, RankingStrategy rankingStrategy) {
        double sum = 0;
        double count = criterionList.size();
        for (Criterion c : criterionList) {
            ArrayList<Integer> scoreList = new ArrayList<>();
            //loop through all reviews
            for (Map.Entry<String, Review> entry : reviews.entrySet()) {
                String author = entry.getKey();
                Review review = entry.getValue();
                scoreList.add(review.getContent().get(c).getScore());
            }
            sum += rankingStrategy.calculate(scoreList);
        }
        System.out.printf("Assignment: %s, Student: %s, Score: %f\n", homeworkId, studentId, Math.round(sum / count));
    }

    public void findStrength(ArrayList<Criterion> criterionList, String homeworkId, String studentId, RankingStrategy rankingStrategy) {
        double maxScore = 0;
        String strength = "";
        for (Criterion c : criterionList) {
            ArrayList<Integer> scoreList = new ArrayList<>();
            for (Map.Entry<String, Review> entry : reviews.entrySet()) {
                String author = entry.getKey();
                Review review = entry.getValue();
                scoreList.add(review.getContent().get(c).getScore());
            }
            double calScore = rankingStrategy.calculate(scoreList);
            if (calScore > maxScore) {
                maxScore = calScore;
                strength = c.getName();
            } else if (calScore == maxScore) {
                strength += ' ' + c.getName(); // need a space
            }
        }
        System.out.printf("Assignment: %s, Student: %s, Strength:%s\n", homeworkId, studentId, strength);
    }

    public void findWeakness(ArrayList<Criterion> criterionList, String homeworkId, String studentId, RankingStrategy rankingStrategy) {
        double minScore = 0;
        String weakness = "";
        for (Criterion c : criterionList) {
            ArrayList<Integer> scoreList = new ArrayList<>();
            for (Map.Entry<String, Review> entry : reviews.entrySet()) {
                String author = entry.getKey();
                Review review = entry.getValue();
                scoreList.add(review.getContent().get(c).getScore());
            }
            double calScore = rankingStrategy.calculate(scoreList);
            if (calScore < minScore) {
                minScore = calScore;
                weakness = c.getName();
            } else if (calScore == minScore) {
                weakness += ' ' + c.getName(); // need a space
            }
        }
        System.out.printf("Assignment: %s, Student: %s, Weakness:%s\n", homeworkId, studentId, weakness);
    }

    // getter and setter
    public Student getAuthor() {
        return author;
    }

    public void setAuthor(Student author) {
        this.author = author;
    }

    public LinkedHashMap<String, Review> getReviews() {
        return reviews;
    }

    public void setReviews(LinkedHashMap<String, Review> reviews) {
        this.reviews = reviews;
    }
}
