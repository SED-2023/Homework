import java.util.ArrayList;

public class SkipList {
    private int index;
    private ArrayList<SkipNode> nodes;

    public SkipList() {
        nodes = new ArrayList<>();
        this.index = 0;
    }

    public void add(String item) {
        SkipNode node = new SkipNode(item);
        nodes.add(node);
    }

    public int size() {
        return nodes.size();
    }

    public Iterator getIterator() {
        return new SkipListIterator();
    }

    // SkipListIterator implementation
    private class SkipListIterator implements Iterator {

        public boolean hasNext() {
            return index < nodes.size();
        }

        public String getObject() {
            if (hasNext()) {
                return nodes.get(index++).getData();
            }
            return null;
        }
    }
}
