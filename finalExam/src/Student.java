import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void reviewAssignment(Homework homework, Assignment assignment,  ArrayList<String> studentIds, ArrayList<ArrayList<String>> review, ArrayList<Level> schoolStrategy) {
        //check numebr of reviewers


        if (studentIds.size() != review.size()) {
            return;
        }

        int reviewNumebers = studentIds.size();


        //if reviewer and student are the same
        if (studentIds.contains(this.id)) {
            System.out.println("Cannot review one's own assignment.");
            return;
        }

//        if (assignment.getAuthor() )
        if (reviewNumebers < homework.getLowerBound() || reviewNumebers > homework.getUpperBound()) {
            System.out.println("Assignment should be reviewed by 3-5 students."); //TODO: check 3-5 is constant
            return;
        }



        String output = ""; // for level
        ArrayList<Criterion> criteria = homework.getRubric().getCriterion();
        for (int i = 0; i < reviewNumebers; i++) {
            output = "";


            // prepare review content
            LinkedHashMap<Criterion, Level> content = new LinkedHashMap<>();
            String studentId = studentIds.get(i);
            List<String> studentReview = review.get(i);

            int j = 0;
            for (Criterion c: criteria) {
                String reviewContent = studentReview.get(j);
                j++;
                Level currentLevel = null;

                // iterate schoolStrategy, find the level that match the reviewContent
                for (Level l: schoolStrategy) {
                    if (l.getLevel().equals(reviewContent)) {
                        currentLevel = l;
                        break;
                    }
                }
                if (currentLevel == null) {
                    continue;
                }
                content.put(c, currentLevel);

                // concat level string to output
                output += " ";
                output += reviewContent;


            }

            // get assignmentId from homework.getAssignments(), match if string is same
            String assignmentId = null;
            for (Map.Entry<String, Assignment> entry: homework.getAssignments().entrySet()) {
                if (entry.getValue().equals(assignment)) {
                    assignmentId = entry.getKey();
                    break;
                }
            }

            Review rw = new Review(studentId, assignmentId, content);
            assignment.addReview(rw);



            System.out.printf("%s-%s was reviewed by %s. Level:%s%n", homework.getId(), assignment.getAuthor().getId(), assignment.getReviews().get(studentId).getStudentId(), output);

        }



    }
}
