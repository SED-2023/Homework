import java.util.ArrayList;

public class Application {

    //    public  Style style_obj;
    public ArrayList<Window> windows = new ArrayList<>();
    public ArrayList<ScrollBar> scrollBars = new ArrayList<>();
    public ArrayList<Button> buttons = new ArrayList<>();
    private WidgetFactory factory = new MotifFactory();

    public void addWindow(String name) {
        windows.add(factory.createWindow(name));
    }

    public void addScrollBar(String name) {
        scrollBars.add(factory.createScrollBar(name));
    }

    public void addButton(String name) {
        buttons.add(factory.createButton(name));
    }

    public void setStyle(String style) {
        if (style.equals("Motif")) {
            this.factory = new MotifFactory();
        } else if (style.equals("PM")) {
            this.factory = new PMFactory();
        }

        // update all widgets
        for (int i = 0; i < windows.size(); i++) {
            String name = windows.get(i).getName();
            windows.set(i, factory.createWindow(name));
        }
        for (int i = 0; i < scrollBars.size(); i++) {
            String name = scrollBars.get(i).getName();
            scrollBars.set(i, factory.createScrollBar(name));
        }
        for (int i = 0; i < buttons.size(); i++) {
            String name = buttons.get(i).getName();
            buttons.set(i, factory.createButton(name));
        }
    }

    public void present() {
        for (int i = 0; i < windows.size(); i++) {
            windows.get(i).display();
        }
        for (int i = 0; i < scrollBars.size(); i++) {
            scrollBars.get(i).display();
        }
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).display();
        }
    }

}
