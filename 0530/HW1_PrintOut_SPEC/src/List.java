import java.util.ArrayList;

public class List {
    private ArrayList<String> data;

    public List() {
        data = new ArrayList<>();
    }

    public void add(String item) {
        data.add(item);
    }

    public int length() {
        return data.size();
    }

    public Iterator getIterator() {
        return new ListIterator();
    }

    // ListIterator implementation
    private class ListIterator implements Iterator {
        private int index;

        public boolean hasNext() {
            return index < data.size();
        }

        public Object next() {
            if (hasNext()) {
                return data.get(index++);
            }
            return null;
        }
    }
}
