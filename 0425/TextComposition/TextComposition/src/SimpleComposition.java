
import java.util.ArrayList;

public class SimpleComposition implements LinebreakingStrategy{
    @Override
    public ArrayList<ArrayList<Component>> linebreak(ArrayList<Component> components) {
        ArrayList<ArrayList<Component>> result =
                new ArrayList<ArrayList<Component> >(0);

        for (int i = 0; i < components.size(); i++) {
            ArrayList<Component> oneline = new ArrayList<Component>(0);
            oneline.add(components.get(i));
            result.add(oneline)
        }


        return result;
    }
}
