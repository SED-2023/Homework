public class PMButton implements Button {

    public String name;

    public PMButton(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("PMButton " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
