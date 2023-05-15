public class MotifFactory implements WidgetFactory{
    @Override
    public Button createButton(String name) {
        return new MotifButton(name);
    }

    @Override
    public ScrollBar createScrollBar(String name) {
        return new MotifScrollBar(name);
    }

    @Override
    public Window createWindow(String name) {
        return new MotifWindow(name);
    }
}
