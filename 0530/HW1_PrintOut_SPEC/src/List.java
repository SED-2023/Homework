import java.util.ArrayList;

public class List {
    private int index;
    private ArrayList<String> data;

    public List() {
        data = new ArrayList<>();
        this.index = 0;
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

        public boolean hasNext() {
            return index < data.size();
        }

        public String getObject() {
            if (hasNext()) {
                return data.get(index++);
            }
            return null;
        }
    }
}
