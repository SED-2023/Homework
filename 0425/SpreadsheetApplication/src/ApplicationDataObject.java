import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ApplicationDataObject {
    private Map<String, Double> data;

    public ApplicationDataObject() {
        // Initialize the data object
        data = new LinkedHashMap<>();
    }

    public void updateData(String item, double value) {
        // Update the value of an item in the data object
        data.put(item, value);
        System.out.println(data);
    }

    public double getData(String item) {
        // Get the value of an item in the data object
        return data.getOrDefault(item, 0.0);
    }

    public Set<String> getItems() {
        // Get a set of all item names in the data object
        return data.keySet();
    }
}
