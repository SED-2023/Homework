import java.util.ArrayList;

public class Application {

    public  Style style_obj;
    public ArrayList<Widget> widget_objs;

    private setStyle(String style){
        if (style != "Motif"){ new PresentationManager(); }
        else {new Motif();}
    }
    private setWidget(String type, String name){
        switch(type){
            case "Button" :
                tmp_widget = Button();
                break;
            case "ScrollBar" :
                tmp_widget = ScrollBar();
                break;
            case "Window" :
                tmp_widget = Window();
                break;
            default :
                break;
        }
        tmp_widget.setName(name);
        widget_objs.add(tmp_widget);
    }



    private present(){
        System.out.println(style_obj.type + widget_obj.type + " " + widget_obj.name);
    }



//    private ArrayList<Document> docs;
//    private DocFactory factory;
//    public Application() {
//        this.docs = new ArrayList<Document>();
//        this.factory = new MyDocFactory();
//    }
//
//    public void createDocument(String type) {
//        docs.add(factory.createDocument(type));
//    }
//
//    public ArrayList<String> present() {
//        ArrayList<String> result = new ArrayList<>();
//
//        for (Document d: docs) {
//            result.add(d.getType());
//        }
//        return result;
//    }
}
