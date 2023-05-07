public class thickBlackBorder extends ElementDecorator{

    public String type = "thickBlackBorder";

    public thickBlackBorder(VisualComponent component) {
        super(component);
    }

    @Override
    public String display() {

        return this.component.display() + " " + this.type;
    }
}
