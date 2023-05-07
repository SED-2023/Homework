import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Application {
    Map<String, VisualComponent> textViews = new HashMap<>();

    public void addTextView(String name, String text) {
        textViews.put(name, new TextView(name, text));
    }

    public void addComponent(String textViewName, String elementName) {
        VisualComponent component = textViews.get(textViewName);
        if (elementName == "scrollBar") {
            textViews.put(textViewName, new ScrollBar(component));
        } else if (elementName == "thickBlackBorder") {
            textViews.put(textViewName,  new thickBlackBorder(component));
        }
    }

    public String display(String name) {
        VisualComponent component = textViews.get(name);
        return component.display();
    }
}
