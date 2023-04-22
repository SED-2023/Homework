public class GraphicalElement extends Component {
    protected int componentID;
    protected int size;
    protected int shrinkAbility;
    protected int stretchAbility;
    protected String content;
    public GraphicalElement(int ID, int size, int shrinkAbility, int stretchAbility, String content){
        this.componentID = ID;
        this.size = size;
        this.shrinkAbility = shrinkAbility;
        this.stretchAbility = stretchAbility;
        this.content = content;
    }
}
