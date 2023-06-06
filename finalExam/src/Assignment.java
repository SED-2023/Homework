import java.util.LinkedHashMap;

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

    public void calculateScore(String homeworkId, String studentId, String rankingStrategy) {
        // TODO: 琳
    }

    public void findStrength(String homeworkId, String studentId, String rankingStrategy) {
        // TODO: 琳
    }

    public void findWeakness(String homeworkId, String studentId, String rankingStrategy) {
        // TODO: 琳
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
