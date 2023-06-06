import java.util.ArrayList;

public class RubricBuilder {
    private Rubric rubric;

    public RubricBuilder() {
        this.rubric = new Rubric();
    }

    public RubricBuilder addItem(Criterion c, Level le, String desc) {
        // check if criterion c is in rubic.getCriterion()
        // if not, add it
        // if it is, do nothing
        for (Criterion criterion : rubric.getCriterion()) {
            if (criterion.getName().equals(c.getName())) {
                break;
            }else {
                rubric.addCriterion(c);

            }
        }

        RubricItem rbi = new RubricItem(le, c, desc);
        rubric.addRubricItem(rbi);
        return this;
    }

    public Rubric build() {
        return this.rubric;
    }
}
