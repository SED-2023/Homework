import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {

    protected ArrayList<Component> components= new ArrayList<Component>(0);

    public void newComponent(String[] input) {
        Component c;

        int ID = Integer.parseInt(input[1]);
        int size = Integer.parseInt(input[2]);
        int shrinkAbility = Integer.parseInt(input[3]);
        int stretchAbility = Integer.parseInt(input[4]);
        String content = input[5];

        if (input[0].equals("Text")) {
            c = new Text(ID, size, shrinkAbility, stretchAbility, content);
            components.add(c);
        }else if (input[0].equals("GraphicalElement")) {
            c = new GraphicalElement(ID, size, shrinkAbility, stretchAbility, content);
            components.add(c);
        }
    }
    public String changeSize(String[] input) {
        int ComponentID = Integer.parseInt(input[1]);
        int NewSize = Integer.parseInt(input[2]);

        String res = "";
        for (Component c: components) {

            if (c.getComponentID() == ComponentID) {
                res = c.changeSize(NewSize);
                break;
            }
        }
        if (res.equals("")) {
            res = "ComponentID not exists.";
        }
        return res;
    }

    public String[] require(String[] input) {
        String strategy = input[1];
        ArrayList<ArrayList<Component>> result;
        if (strategy.equals("TexComposition")) {
            result = new TexComposition().linebreak(components);
        }else if (strategy.equals("ArrayComposition")){
            result = new ArrayComposition().linebreak(components);
        }else {
            result = new SimpleComposition().linebreak(components);
        }
        return displayLayout(result);
    }

    private String[] displayLayout(ArrayList<ArrayList<Component>> result) {
        int numOfLines = result.size();
        String[] layout = new String[numOfLines];
        ArrayList<Component> componentList;
        String line;
        for (int i = 0; i < numOfLines; i++) {
            componentList = result.get(i);
            line = "";
            for (Component c: componentList) {
                line += String.format("[%d]%s ", c.getSize(), c.getContent());
            }
            layout[i] = line;
        }
        return layout;

    }

}
