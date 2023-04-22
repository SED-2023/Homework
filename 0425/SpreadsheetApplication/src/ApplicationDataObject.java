import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ApplicationDataObject {
    private String item;
    private Double value;

    public ApplicationDataObject(String item, Double value) {
        // Initialize the data object
        this.item = item;
        this.value = value;
    }
    public Double getValue() {
        return value;
    }
    public String getItem() {
        return item;
    }
}
