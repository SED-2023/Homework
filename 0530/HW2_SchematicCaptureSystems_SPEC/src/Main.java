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
                        BasicComponent lineComponent = new Line();
                        lineComponent.draw();
                        System.out.println();
                        break;
                    case "Rectangle":
                        BasicComponent rectangle = new Rectangle();
                        rectangle.draw();
                        System.out.println();
                        break;
                    case "Text":
                        BasicComponent text = new Text();
                        text.draw();
                        System.out.println();
                        break;
                    case "Group":
                        BasicComponent group = new Group();
//                        group.add();
                    default:
                        break;
                }
            }
        } catch (Exception e) {
//            System.out.println("Input Error");
        }
    }
}
