import java.util.LinkedHashMap;
import java.util.Map;

public class Review {
    private String studentId;

    private String assignmentId;

    private LinkedHashMap<Criterion, Level> content;

    public Review(String studentId, String assignmentId, LinkedHashMap<Criterion, Level> content) {
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

    public LinkedHashMap<Criterion, Level> getContent() {
        return content;
    }

    public void setContent(LinkedHashMap<Criterion, Level> content) {
        this.content = content;
    }
}
