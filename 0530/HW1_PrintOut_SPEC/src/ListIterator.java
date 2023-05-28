public class ListIterator implements Iterator{
    private List list;
    public int currentIndex;

    public ListIterator(List l){
        list = l;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.length;
    }

    @Override
    public String next() {
        String s = list.get(currentIndex);
        currentIndex++;
        return s;
    }
}
