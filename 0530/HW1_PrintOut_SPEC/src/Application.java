import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

    private Map<String, List> listMap;
    private Map<String, SkipList> skipListMap;
    public Application(){
        listMap = new LinkedHashMap<>();
        skipListMap = new LinkedHashMap<>();
    }
    public void create(String name, String type){
        if ("List".equals(type)){
            List list = new List();
            listMap.put(name, list);
        } else if ("SkipList".equals(type)) {
            SkipList skipList = new SkipList();
            skipListMap.put(name, skipList);
        }
    }

    public void add(String name, String value){
        for (Map.Entry<String, List> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                entry.getValue().add(value);
            }
        }
        for (Map.Entry<String, SkipList> entry : skipListMap.entrySet()){
            if (name.equals(entry.getKey())){
                entry.getValue().add(value);
            }
        }
    }

    public String get(){
        return null;
    }

    public String getNode(){
        return null;
    }

    public ArrayList<String> printOutList(String name){
        ArrayList<String> strings = new ArrayList<>();
        for (Map.Entry<String, List> entry : listMap.entrySet()){
            if (name.equals(entry.getKey())){
                Iterator iterator = entry.getValue().getIterator();
                while (iterator.hasNext()){
                    strings.add(iterator.next());
                }
                return strings;
            }
        }
        for (Map.Entry<String, SkipList> entry : skipListMap.entrySet()){
            if (name.equals(entry.getKey())){
                Iterator iterator = entry.getValue().getIterator();
                while (iterator.hasNext()){
                    strings.add(iterator.next());
                }
                return strings;
            }
        }
        return null;
    }

    public Integer length(){
        return null;
    }

    public Integer size(){
        return null;
    }
}
