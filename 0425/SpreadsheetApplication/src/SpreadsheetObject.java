import java.util.*;

public class SpreadsheetObject {
    private ApplicationDataObject data;

    public SpreadsheetObject() {
        // Initialize the spreadsheet chart object
        data = new ApplicationDataObject();
    }

    public void setData(ApplicationDataObject newData) {
        // Update the data in the spreadsheet chart
        this.data = newData;
        System.out.println("Success");
    }

    public void display() {
        // Display the spreadsheet chart
        System.out.println("Bar Chart:");
        System.out.println();
    }
}
