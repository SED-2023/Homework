public abstract class IList {
    public String name;
    public String type;
    public abstract void add(String item);
    public abstract Iterator createIterator();
}
