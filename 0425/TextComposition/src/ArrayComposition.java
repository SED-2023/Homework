import java.awt.*;
import java.util.ArrayList;

public class ArrayComposition implements LinebreakingStrategy {
    @Override
    public ArrayList<ArrayList<Component>> linebreak(ArrayList<Component> components) {
        int lineSize = 3;
        ArrayList<ArrayList<Component>> result =
                new ArrayList<ArrayList<Component> >(0);
        ArrayList<Component> oneLine = new ArrayList<Component>(0);

        for (int i = 0; i < components.size(); i++) {

            if (i % lineSize == 2) {
                // if reach lineSize, append oneLine into result
                oneLine.add(components.get(i));
                result.add(oneLine);
                oneLine = new ArrayList<Component>(0);
            }else {
                // else, add component to oneLine
                oneLine.add(components.get(i));
            }
        }
        if (oneLine.size() != 0) {
            result.add(oneLine);
        }
        return result;
    }
}
