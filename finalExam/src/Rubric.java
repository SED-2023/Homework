import java.lang.reflect.Array;
import java.util.ArrayList;

public class Rubric {
    private ArrayList<RubricItem> rubricItems = new ArrayList<>();

    private int criterionCount;

    private ArrayList<Criterion> criteria = new ArrayList<>();

    public Rubric() {
        this.rubricItems = new ArrayList<>();
        this.criteria = new ArrayList<>();
        this.criterionCount = 0;
    }

    public ArrayList<Criterion> getCriterion() {
        return criteria;
    }

    public ArrayList<RubricItem> getRubricItems() {
        return rubricItems;
    }

    public int getCriterionCount() {
        return criterionCount;
    }

    public void setRubricItems(ArrayList<RubricItem> rubricItems) {
        this.rubricItems = rubricItems;
    }

    public void setCriterionCount(int criterionCount) {
        this.criterionCount = criterionCount;
    }

    public void setCriteria(ArrayList<Criterion> criteria) {
        this.criteria = criteria;
    }

    public void addRubricItem(RubricItem rubricItem) {
        rubricItems.add(rubricItem);
    }

    public void addCriterion(Criterion criterion) {
        // if criterion is already in criteria, do nothing

        criteria.add(criterion);
        criterionCount += 1;
    }

    public void printRubric() {
        for (RubricItem rubricItem : rubricItems) {
            System.out.println("(" + rubricItem.getCriterion().getName() + "," + rubricItem.getLevel().getLevel() + ") " + rubricItem.getDescription());
        }
    }
}
