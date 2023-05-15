import java.util.ArrayList;
import java.util.*;

public class Application {

    public  Style style_obj;
    public Widget widget_obj;
    public ArrayList<Widget> widget_ArrayList = new ArrayList<Widget>();

    public void setStyle(String style){
        Style styler;
        if (style != "Motif"){
            styler = new PresentationManager();
        }
        else {
            styler = new Motif();
        }
    }
    public void setWidget(String type, String name){
        switch(type){
            case "Button" :
                widget_obj = new Button();
                break;
            case "ScrollBar" :
                widget_obj = new ScrollBar();
                break;
            case "Window" :
                widget_obj = new Window();
                break;
            default :
                break;
        }
        if (name.equals("Button") || name.equals("Scrollbar") || name.equals("Window")){
            widget_obj.setName(name);
            widget_obj.setPriority(name, (widget_ArrayList.size()+1));
        }
        widget_ArrayList.add(widget_obj);
    }



    public void present(){

        for(Widget widget : widget_ArrayList){
            System.out.println(style_obj.style + widget.type + " " + widget.name);
        }
    }

}
