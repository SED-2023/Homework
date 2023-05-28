public class SkipListIterator implements Iterator{
    private SkipList list;
    public int currentIndex;

    public SkipListIterator(SkipList l){
        list = l;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public String next() {
        SkipNode node = list.getNode(currentIndex);
        currentIndex++;
        return node.get();
    }
}
