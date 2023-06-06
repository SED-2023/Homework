public class RubricItem {
    private Level level;

    private Criterion criterion;

    private String Description;

    public RubricItem(Level level, Criterion criterion, String description) {
        this.level = level;
        this.criterion = criterion;
        this.Description = description;
    }

    public Level getLevel() {
        return level;
    }

    public Criterion getCriterion() {
        return criterion;
    }

    public String getDescription() {
        return Description;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
