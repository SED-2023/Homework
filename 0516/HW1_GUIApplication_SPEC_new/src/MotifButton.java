public class MotifButton implements Button{

    public String name;

    public MotifButton(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("MotifButton " + this.name);
    }
}
