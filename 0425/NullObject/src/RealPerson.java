public class RealPerson implements AbstractObject {
    private final String name;
    private final String job;
    private int weight;
    private int height;

    public RealPerson(String name, String job, int weight, int height) {
        this.name = name;
        this.job = job;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String getPerson() {
        return name;
    }

    @Override
    public String getJob() {
        return job;
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
    public int heightSum(){
        return 0;
    }
}