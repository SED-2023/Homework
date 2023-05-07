public class ScrollBar extends ElementDecorator{

    public String type = "scrollBar";

    public ScrollBar(VisualComponent component) {
        super(component);
    }

    @Override
    public String display() {
        return " " + this.type;
    }
}
