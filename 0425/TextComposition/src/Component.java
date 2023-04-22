public abstract class Component {
    protected int componentID;
    protected int size;
    protected int shrinkAbility;
    protected int stretchAbility;
    protected String content;

    public int getComponentID() {
        return componentID;
    }

    public int getSize() {
        return size;
    }

    public int getShrinkAbility() {
        return shrinkAbility;
    }

    public int getStretchAbility() {
        return stretchAbility;
    }

    public String getContent() {
        return content;
    }

    public String changeSize(int newSize){
        if (newSize < shrinkAbility || newSize > stretchAbility){
            return String.format("component %d failed to change size", componentID);
        }else{
            size = newSize;
            return String.format("component %d size changed to %d", componentID, newSize);
        }
    }
    public String display(){
        return String.format("[%d]%s", size, content);
    }
}
