public class TextView extends VisualComponent{

    public String name;
    public String text;

    public TextView(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String display() {
        return this.text;
    }
}
