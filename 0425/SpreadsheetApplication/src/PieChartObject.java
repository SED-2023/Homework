import java.util.*;

public class PieChartObject {
    private ApplicationDataObject data;

    public PieChartObject() {
        // Initialize the pie chart object
        data = new ApplicationDataObject();
    }

    public void setData(ApplicationDataObject newData) {
        // Update the data in the pie chart
        this.data = newData;
    }

    public void display() {
        // Display the pie chart
        System.out.println("Pie Chart:");
        System.out.println();
    }
}
