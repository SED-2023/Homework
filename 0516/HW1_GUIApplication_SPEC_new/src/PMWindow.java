public class PMWindow implements Window{
    public String name;

    public PMWindow(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("PMWindow " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
