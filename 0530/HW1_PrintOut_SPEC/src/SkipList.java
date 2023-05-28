import java.util.ArrayList;

public class SkipList {
    private ArrayList<SkipNode> nodes;

    public SkipList() {
        nodes = new ArrayList<>();
    }

    public void create(String item) {
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
        private int index;

        public boolean hasNext() {
            return index < nodes.size();
        }

        public Object next() {
            if (hasNext()) {
                return nodes.get(index++).getData();
            }
            return null;
        }
    }
}
