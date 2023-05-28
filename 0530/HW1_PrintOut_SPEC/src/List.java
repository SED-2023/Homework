import java.util.ArrayList;

public class List implements AbstractList {
    private int length;
    private String name;
    private String type;
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
