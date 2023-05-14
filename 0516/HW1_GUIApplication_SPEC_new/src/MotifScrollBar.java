public class MotifScrollBar implements ScrollBar{

    public String name;
    public MotifScrollBar(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("MotifScrollBar " + this.name);
    }
}
