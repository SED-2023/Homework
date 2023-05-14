import java.util.ArrayList;

public class Application {

    public  Style style_obj;
    public ArrayList<Widget> widget_objs;

    private void setStyle(String style){
        Style styler;
        if (style != "Motif"){
            styler = new PresentationManager();
        }
        else {
            styler = new Motif();
        }
    }
    private void setWidget(String type, String name){
        Widget tmp_widget;
        switch(type){
            case "Button" :
                tmp_widget = new Button();
                break;
            case "ScrollBar" :
                tmp_widget = new ScrollBar();
                break;
            case "Window" :
                tmp_widget = new Window();
                break;
            default :
                break;
        }
        if tmp_widget.setName(name);
        widget_objs.add(tmp_widget);
    }



    private present(){
        System.out.println(style_obj.type + widget_obj.type + " " + widget_obj.name);
    }

}
