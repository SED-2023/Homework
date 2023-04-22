public class Text extends Component {
    protected int componentID;
    protected int size;
    protected int shrinkAbility;
    protected int stretchAbility;
    protected String content;
    public Text(int ID, int size, int shrinkAbility, int stretchAbility, String content){
        this.componentID = ID;
        this.size = size;
        this.shrinkAbility = shrinkAbility;
        this.stretchAbility = stretchAbility;
        this.content = content;
    }
}
