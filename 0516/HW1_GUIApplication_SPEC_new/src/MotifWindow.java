public class MotifWindow implements Window{
    public String name;

    public MotifWindow(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("MotifWindow " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
