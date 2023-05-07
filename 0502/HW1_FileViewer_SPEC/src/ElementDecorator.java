public abstract class ElementDecorator extends VisualComponent{

    public VisualComponent component;

    public ElementDecorator(VisualComponent component) {
        this.component = component;
    }

    public abstract String display();
}
