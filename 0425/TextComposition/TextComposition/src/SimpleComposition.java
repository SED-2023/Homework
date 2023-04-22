import java.util.ArrayList;

public class SimpleComposition implements LinebreakingStrategy{
    @Override
    public ArrayList<ArrayList<Component>> linebreak(ArrayList<Component> components) {
        ArrayList<ArrayList<Component>> result =
                new ArrayList<ArrayList<Component> >(0);

        for (int i = 0; i < components.size(); i++) {
            ArrayList<Component> oneLine = new ArrayList<Component>(0);
            oneLine.add(components.get(i));
            result.add(oneLine);
        }
        return result;
    }
}
