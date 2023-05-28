import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Main {
    public static void main(String[] args) {
        try {
            InputParser input = new InputParser();
            NodeList childList = input.xmlParse(args);
            //loop childList
            for (int index = 0; index < childList.getLength(); index++) {
                Node node = childList.item(index);
                String componentType = node.getNodeName();
                if (componentType.equals("#text")) {
                    continue;
                }
//                System.out.println(componentType);
                switch (componentType) {
                    case "Line":
                        BasicComponent lineComponent  = new Line();
                        lineComponent.draw();
                        break;
                    case "Rectangle":
                        BasicComponent rectangle = new Rectangle();
                        rectangle.draw();
                        break;
                    case "Text":
                        BasicComponent text = new Text();
                        text.draw();
                        break;
                    case "Group":
                        BasicComponent group = new Group();
                        group.add();
                    default:
                        break;
            }
//            BufferedReader fileReader = input.parse(args);
//            String line = fileReader.readLine();

//            while (line != null) {
//                String[] tokens = line.split(" ");
//                String command = tokens[0];
//                switch (command) {
//                    case "<Line/>":
//                        BasicComponent lineComponent  = new Line();
//                        lineComponent.draw();
//                        break;
//                    case "<Rectangle/>":
//                        BasicComponent rectangle = new Rectangle();
//                        rectangle.draw();
//                        break;
//                    case "<Text/>":
//                        BasicComponent textBox = new Text();
//                        text.draw();
//                        break;
//                    case "<Group>":
//                        BasicComponent group = new Group();
//                        group.add();

//                    case "Button", "ScrollBar", "Window":
//                        application.setWidget(command, tokens[1]);
//                        break;
//                    case "Present":
//                        application.present();
//                        break;
//                    default:
//                        break;
//                }
//                line = fileReader.readLine();
//            }
//            fileReader.close();

        } catch (Exception e) {
//            System.out.println("Input Error");
        }
    }
}
