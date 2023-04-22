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

            if (i % lineSize == 0) {
                // if reach lineSize, append oneLine into result
                result.add(oneLine);
                oneLine.clear();
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
