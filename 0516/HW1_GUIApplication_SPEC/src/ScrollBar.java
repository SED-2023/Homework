public class ScrollBar implements Widget{
//    public setType(input_type){type = input_type;}
    String type = "ScrollBar";
    String name = "";
    int priority = 0;
    @Override
    public void setName(String input_name){name = input_name;}
    @Override
    public  void setPriority(String name, int totalNum){
        int priority_weight = 0;
        if (name.equals("Window")){
            priority_weight = 3;
        }
        else if (name.equals("Scrollbar")){
            priority_weight = 2;
        }
        else if (name.equals("Button")){
            priority_weight = 1;
        }
        priority = priority_weight*(totalNum*10) + totalNum;
    }
    public int getPriority(){
        return priority;
    }
}