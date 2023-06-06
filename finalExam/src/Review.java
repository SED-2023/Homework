import java.util.Map;

public class Review {
    private String studentId;

    private String assignmentId;

    private Map<Criterion, Level> content;

    public Review(String studentId, String assignmentId, Map<Criterion, Level> content) {
        this.studentId = studentId;
        this.assignmentId = assignmentId;
        this.content = content;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Map<Criterion, Level> getContent() {
        return content;
    }

    public void setContent(Map<Criterion, Level> content) {
        this.content = content;
    }
}
