import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Main {

    private static BasicComponent switchComponents(String componentType, Node node) {
        if (componentType.equals("#text")) return null;
        switch (componentType) {
            case "Line":
                BasicComponent lineComponent = new Line();
                lineComponent.draw();
                System.out.println();
                return lineComponent;
            case "Rectangle":
                BasicComponent rectangle = new Rectangle();
                rectangle.draw();
                System.out.println();
                return rectangle;
            case "Text":
                BasicComponent text = new Text();
                text.draw();
                System.out.println();
                return text;
            case "Group":
                BasicComponent group = new Group();
                NodeList groupChildList = node.getChildNodes();
//                System.out.println(chileComponentType);
                for (int index = 0; index < groupChildList.getLength(); index++) {
                    Node childNode = groupChildList.item(index);
                    String chileComponentType = node.getNodeName();
//                    System.out.println(chileComponentType);
                    BasicComponent bc = switchComponents(chileComponentType, childNode);
                    ((Group) group).add(bc);
                }
//                group.draw();
                return group;
            default:
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            InputParser input = new InputParser();
            NodeList childList = input.xmlParse(args);
            //loop childList
            for (int index = 0; index < childList.getLength(); index++) {
                Node node = childList.item(index);
                String componentType = node.getNodeName();
                switchComponents(componentType, node);
//                System.out.println(componentType);
//                switch (componentType) {
//                    case "Line":
//                        BasicComponent lineComponent = new Line();
//                        lineComponent.draw();
//                        System.out.println();
//                        break;
//                    case "Rectangle":
//                        BasicComponent rectangle = new Rectangle();
//                        rectangle.draw();
//                        System.out.println();
//                        break;
//                    case "Text":
//                        BasicComponent text = new Text();
//                        text.draw();
//                        System.out.println();
//                        break;
//                    case "Group":
//                        BasicComponent group = new Group();
//                        NodeList groupChildList = node.getChildNodes();
//
////                        group.add();
//                    default:
//                        break;
//                }
            }
        } catch (Exception e) {
//            System.out.println("Input Error");
        }
    }
}
