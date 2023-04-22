import java.util.ArrayList;

public class TexComposition implements LinebreakingStrategy{
    @Override
    public ArrayList<ArrayList<Component>> linebreak(ArrayList<Component> components) {
        ArrayList<ArrayList<Component>> result =
                new ArrayList<ArrayList<Component> >(0);
        ArrayList<Component> oneLine = new ArrayList<Component>(0);

        for (int i = 0; i < components.size(); i++) {

            if (components.get(i).getContent().equals("ParagraphEnd")) {
                // if component.getComponent() is same as "ParagraphEnd", append oneLine into result
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
