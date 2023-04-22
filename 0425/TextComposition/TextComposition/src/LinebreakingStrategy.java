import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public interface LinebreakingStrategy {
    public ArrayList<ArrayList<Component>> linebreak(ArrayList<Component> components);
}
