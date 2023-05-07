import java.util.ArrayList;
import java.util.HashMap;

public class Application {
    Map<String, VisualComponent> textViews = new HashMap<>();

    public void addTextView(String name, String text) {
        textViews.put(name, new TextView(text));
    }

    public void addComponent(String textViewName, String elementName) {
        VisualComponent component = textViews.get(textViewName);
        if (elementName == "scrollBar") {
            textViews.put(textViewName, new ScrollBar(component));
        } else if (elementName == "thickBlackBorder") {
            textViews.put(textViewName,  new thickBlackBorder(component));
        }
    }

    public ArrayList<String> display(String name) {
        ArrayList<String> outputString = new ArrayList<>();
        textViews.forEach((k, v) -> outputString.add(v.display()));
        return outputString;
    }
}
