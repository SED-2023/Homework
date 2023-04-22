public class Person implements AbstractObject{
    private final String name;
    private final String job;
    private int weight;
    private int height;

    public Person(String name, String job, int weight, int height){
        this.name = name;
        this.job = job;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getjob() {
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

}