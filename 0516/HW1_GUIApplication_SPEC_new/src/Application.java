import java.util.ArrayList;

public class Application {

    //    public  Style style_obj;
    public ArrayList<Window> windows;
    public ArrayList<ScrollBar> scrollBars;
    public ArrayList<Button> buttons;
    private WidgetFactory factory;

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
        if (style.equal("Motif")) {
            factory = new MotifFactory();
        } else if (style.equal("PM")) {
            factory = new PMFactory();
        }

        // update all widgets
        for (int i = 0; i < windows.size(); i++) {
            String name = windows.get(i).name;
            windows.set(i, factory.createWindow(name));
        }
        for (int i = 0; i < scrollBars.size(); i++) {
            String name = scrollBars.get(i).name;
            scrollBars.set(i, factory.createScrollBar(name));
        }
        for (int i = 0; i < buttons.size(); i++) {
            String name = buttons.get(i).name;
            buttons.set(i, factory.createButton(name));
        }
    }

    public void present() {
        for (int i = 0; i < windows.size(); i++) {
            System.out.println(windows.get(i).display());
        }
        for (int i = 0; i < scrollbars.size(); i++) {
            System.out.println(scrollbars.get(i).display());
        }
        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i).display());
        }
    }

}
