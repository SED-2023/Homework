import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

    private Map<String, IList> listMap;

    public Application(){
        listMap = new LinkedHashMap<>();
    }
    public void create(String name, String type){
        if ("List".equals(type)){
            IList list = new List(name, type);
            listMap.put(name, list);
        } else if ("SkipList".equals(type)) {
            IList skipList = new SkipList(name, type);
            listMap.put(name, skipList);
        }
    }

    public void add(String name, String value){
        for (Map.Entry<String, IList> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                entry.getValue().add(value);
            }
        }
    }

    public void get(String name, int index){
        if (listMap.containsKey(name)){
            IList iList = listMap.get(name);
            if ("List".equals(iList.type)){
                String str = ((List)iList).get(index);
                System.out.println(str);
            } else {
                System.out.println("SkipList do not have method get");
            }
        }
    }

    public void getNode(String name, int index){
        if (listMap.containsKey(name)){
            IList iList = listMap.get(name);
            if ("SkipList".equals(iList.type)){
                SkipNode skipNode = ((SkipList)iList).getNode(index);
                System.out.println(skipNode.get());
            } else {
                System.out.println("List do not have method getNode");
            }
        }
    }

    public void printOutList(String name){
        for (Map.Entry<String, IList> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                Iterator iterator = entry.getValue().createIterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        }
    }

    public void length(String name){
        if (listMap.containsKey(name)){
            IList iList = listMap.get(name);
            if ("List".equals(iList.type)){
                int str = ((List)iList).length;
                System.out.println(str);
            } else {
                System.out.println("SkipList can not access length");
            }
        }
    }

    public void size(String name){
        if (listMap.containsKey(name)){
            IList iList = listMap.get(name);
            if ("SkipList".equals(iList.type)){
                int str = ((SkipList)iList).size();
                System.out.println(str);
            } else {
                System.out.println("List can not access size");
            }
        }
    }
}
