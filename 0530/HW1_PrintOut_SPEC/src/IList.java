public interface IList {
    public String name = null;
    public String type = null;
    public void add(String item);
    public Iterator createIterator();
}
