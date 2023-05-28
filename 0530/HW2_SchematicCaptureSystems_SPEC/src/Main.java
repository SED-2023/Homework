import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();
            ArrayList<Group> groupList = new ArrayList<>();

            while (line != null) {
                String command = line.replace("\t", "").replace(" ", "");
                switch (command) {
                    case "<Line/>":
                        BasicComponent lineComponent = new Line();
                        if (groupList.size() > 0) {
                            groupList.get(groupList.size() - 1).add(lineComponent);
                        } else {
                            lineComponent.draw();
                            System.out.println(" ");
                        }
                        break;
                    case "<Rectangle/>":
                        BasicComponent rectangle = new Rectangle();
                        if (groupList.size() > 0) {
                            groupList.get(groupList.size() - 1).add(rectangle);
                        } else {
                            rectangle.draw();
                            System.out.println(" ");
                        }
                        break;
                    case "<Text/>":
                        BasicComponent text = new Text();
                        if (groupList.size() > 0) {
                            groupList.get(groupList.size() - 1).add(text);
                        } else {
                            text.draw();
                            System.out.println(" ");
                        }
                        break;
                    case "<Group/>": // one-line group
                        BasicComponent singleGroup = new Group();
                        if (groupList.size() > 0) {
                            groupList.get(groupList.size() - 1).add(singleGroup);
                        } else {
                            singleGroup.draw();
                            System.out.println(" ");
                        }
                        break;
                    case "<Group>": //group start
                        Group group = new Group();
                        if (groupList.size() > 0) {
                            groupList.get(groupList.size() - 1).add(group);
                        }
                        groupList.add(group);
                        break;
                    case "</Group>": //group end
                        if (groupList.size() == 1) {
                            groupList.get(0).draw();
                            System.out.println(" ");
                        }
                        groupList.remove(groupList.size() - 1);
                        break;
                    default:
                        break;
                }
                line = fileReader.readLine();
            }
            fileReader.close();

        } catch (IOException ex) {
//            System.out.println("Input Error");
        }
    }
}
