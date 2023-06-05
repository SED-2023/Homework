import java.util.ArrayList;

public class List extends IList {
    private ArrayList<String> arr;
    public int length = 0;

    public List(String name, String type) {
        arr = new ArrayList<>();
        this.name = name;
        this.type = "List";
    }

    @Override
    public void add(String item) {
        arr.add(item);
        length++;
    }

    public String get(int index) {
        return arr.get(index);
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this);
    }
}
