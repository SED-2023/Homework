import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

    private Map<String, AbstractList> listMap;

    public Application(){
        listMap = new LinkedHashMap<>();
    }
    public void create(String name, String type){
        if ("List".equals(type)){
            AbstractList list = new List();
            listMap.put(name, list);
        } else if ("SkipList".equals(type)) {
            AbstractList skipList = new SkipList();
            listMap.put(name, skipList);
        }
    }

    public void add(String name, String value){
        for (Map.Entry<String, AbstractList> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                entry.getValue().add(value);
            }
        }
    }

    public void get(String name, Integer index){
        for (Map.Entry<String, AbstractList> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                if ("List".equals(entry.getValue())){
                    System.out.println(entry.getValue().get(index));
                } else {
                    System.out.println("SkipList do not have method get");
                }
            }
        }
    }

    public void getNode(String name, Integer index){
        for (Map.Entry<String, AbstractList> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                if ("SkipList".equals(entry.getValue())){
                    System.out.println(entry.getValue().getNode(index));
                } else {
                    System.out.println("List do not have method getNode");
                }
            }
        }
    }

    public void printOutList(String name){
        for (Map.Entry<String, AbstractList> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                Iterator iterator = entry.getValue().createIterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        }
    }

    public void length(String name){
        for (Map.Entry<String, AbstractList> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                if ("List".equals(entry.getValue())){
                    System.out.println(entry.getValue().length());
                } else {
                    System.out.println("SkipList can not access length");
                }
            }
        }
    }

    public void size(String name){
        for (Map.Entry<String, AbstractList> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                if ("SkipList".equals(entry.getValue())){
                    System.out.println(entry.getValue().size());
                } else {
                    System.out.println("List do not have method size");
                }
            }
        }
    }
}
