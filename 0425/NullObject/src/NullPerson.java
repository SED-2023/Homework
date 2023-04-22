public final class NullPerson implements AbstractObject {
    private String name = "Unknown";
    private final String job = "Unknown";
    private int weight = 0;
    private int height = 0;

    public NullPerson(String name){
        this.name = name;
    }

    @Override
    public String getPerson() {
        return "Unknown";
    }

    @Override
    public String getJob() {
        return "Unknown";
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int weightAverage() {
        return 0;
    }

    @Override
    public int weightSum() {
        return 0;
    }

    @Override
    public int heightAverage() {
        return 0;
    }

    @Override
    public int heightSum() {
        return 0;
    }
}
