import java.util.ArrayList;

public class Group implements BasicComponent{

    private ArrayList<BasicComponent> components = new ArrayList<BasicComponent>();
    public Group(){

    }
    public void add(BasicComponent component){
        components.add(component);
    }

    public void draw(){
        System.out.printf("Group:{");
        for(BasicComponent component : components){
            component.draw();
            System.out.printf("%s", " ");
        }
        System.out.printf("}");

    }
}
