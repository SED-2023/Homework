public abstract class Component {
    protected int componentID;
    protected int naturalSize;
    protected int shrinkAbility;
    protected int stretchAbility;
    protected String content;

    public int getComponentID() {
        return componentID;
    }

    public int getNaturalSize() {
        return naturalSize;
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
}
