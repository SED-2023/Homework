public class PMScrollBar implements ScrollBar{
    public String name;

    public PMScrollBar(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("PMScrollBar " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
