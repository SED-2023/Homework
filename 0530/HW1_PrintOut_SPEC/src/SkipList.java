import java.util.ArrayList;

public class SkipList extends IList {
    private ArrayList<SkipNode> nodes;

    public SkipList(String name, String type) {
        nodes = new ArrayList<>();
        this.name = name;
        this.type = "SkipList";
    }

    @Override
    public void add(String item) {
        SkipNode node = new SkipNode(item);
        nodes.add(node);
    }

    public SkipNode getNode(int index) {
        return nodes.get(index);
    }

    public int size() {
        return nodes.size();
    }

    @Override
    public Iterator createIterator() {
        return new SkipListIterator(this);
    }

}
