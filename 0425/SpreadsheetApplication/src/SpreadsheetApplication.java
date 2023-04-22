import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SpreadsheetApplication {

    public SpreadsheetApplication() {
        // Initialize the spreadsheet, bar charts, pie charts, and data objects
        LinkedHashMap<String, ApplicationDataObject> dataMap = new LinkedHashMap<>();
        ArrayList<ChartObject> chartList = new ArrayList<ChartObject>();
    }

    public void addData(String item, double value) {
        // Update the data
        object = new ApplicationDataObject(item, value);
    }

    public void addChart(String chartType) {
        // Add a new chart of the specified type
        switch (chartType) {
            case "Spreadsheet" -> {
                SpreadsheetObject spreadsheet = new SpreadsheetObject();
            }
            case "PieChart" -> {
                PieChartObject pieChart = new PieChartObject();
            }
            case "BarChart" -> {
                BarChartObject barChart = new BarChartObject();
            }
        }
    }

    public void changeValue(String chartType, String item, double value) {
        // Change the value of an item in DataObject
        data.updateData(item, value);
    }

    public void displayCharts(String charType) {
        // Display the charts in addChart order
        switch (charType) {
            case "Spreadsheet" -> {
                spreadsheet.display();
            }
            case "BarChart" -> {
                barCharts.display();
            }
            case  "PieChart" -> {
                pieCharts.display();
            }
        }
    }


}