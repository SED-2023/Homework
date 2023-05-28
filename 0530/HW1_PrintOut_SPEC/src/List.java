import java.util.ArrayList;

public class List implements AbstractList {
    public int length;
    public String name;
    public String type;
    private ArrayList<String> arr;

    public List(String name, String type) {
        arr = new ArrayList<>();
        this.name = name;
        this.type = type;
    }

    @Override
    public void add(String item) {
        arr.add(item);
    }

    public String get(int index) {
        return arr.get(index);
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this);
    }

}
