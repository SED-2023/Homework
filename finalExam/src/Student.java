import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;

    public Student(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void reviewAssignment(Homework homework, Assignment assignment,  List<String> review) {
        //check numebr of reviewers
        int reviewNumebers = review.size();

//        if (assignment.getAuthor() )
        if (reviewNumebers < homework.getLowerBound() || reviewNumebers > homework.getUpperBound()) {
            System.out.println("Assignment should be reviewed by 3-5 students"); //TODO: check 3-5 is constant
            return;
        }



    }
}
