import java.awt.Window;
import java.util.ArrayList;
import java.util.*;

public class Application {

    public  Motif styler_Motif= new Motif();
    public  PresentationManager styler_PM = new PresentationManager();
    String presentingStyle = "Motif";
//    public Widget widget_obj;
    public ArrayList<Button> buttonArrayList = new ArrayList<Button>();
    public ArrayList<ScrollBar> scrollBarArrayList = new ArrayList<ScrollBar>();
    public ArrayList<guiWindow> guiWindowArrayList = new ArrayList<guiWindow>();

    public void Styling(String style){//        Style styler;

        if (style.equals("PM")){
            presentingStyle = styler_PM.getStyle();
        }
        else{
            presentingStyle = styler_Motif.getStyle();
        }
    }
    public void setWidget(String type, String name){
        Button widget_button = new Button();
        ScrollBar widget_scrollbar = new ScrollBar();
        guiWindow widget_window = new guiWindow();
        int duplicate_flag = 0;
        switch(type){

            case "Button" :
                widget_button.setName(name);
                for(Button b: buttonArrayList){
                    if(b.name.equals(name)) {duplicate_flag = 1;}
                }
                if(duplicate_flag != 1){
                    buttonArrayList.add(widget_button);
                }
                break;
            case "ScrollBar" :
                widget_scrollbar.setName(name);
                for(ScrollBar s : scrollBarArrayList){
                    if(s.name.equals(name)) {duplicate_flag = 1;}
                }
                if(duplicate_flag != 1){
                    scrollBarArrayList.add(widget_scrollbar);
                }
                break;
            case "Window" :
                widget_window.setName(name);
                for(guiWindow w: guiWindowArrayList){
                    if(w.name.equals(name)) {duplicate_flag = 1;}
                }
                if(duplicate_flag != 1){
                    guiWindowArrayList.add(widget_window);
                }
                break;
            default :
                break;
        }

    }



    public void present(){
        if((guiWindowArrayList.size()+scrollBarArrayList.size()+buttonArrayList.size()) >= 1){
            for(guiWindow w: guiWindowArrayList){
                System.out.println(presentingStyle + w.type + " " + w.name);
            }
            for(ScrollBar s : scrollBarArrayList){
                System.out.println(presentingStyle + s.type + " " + s.name);
            }
            for(Button b: buttonArrayList){
                System.out.println(presentingStyle + b.type + " " + b.name);
            }
        }

    }

}
