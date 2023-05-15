import java.util.ArrayList;

public interface Widget {
    public String type = "";
//    public setType(input_type);
    public String name = "";
    public int priority = 0;
    public void setName(String input_name);
    public void setPriority(String name, int totalNum);
    public int getPriority();

}