import java.util.*;

public class BarChartObject {
    private ApplicationDataObject data;

    public BarChartObject() {
        // Initialize the bar chart object
        data = new ApplicationDataObject();
    }

    public void setData(ApplicationDataObject newData) {
        // Update the data in the bar chart
        this.data = newData;
    }

    public void display() {
        // Display the bar chart
        System.out.println("Bar Chart:");
        System.out.println();
    }
}