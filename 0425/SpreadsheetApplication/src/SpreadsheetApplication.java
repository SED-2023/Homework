import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SpreadsheetApplication {

    private LinkedHashMap<String, ApplicationDataObject> dataMap;
    private ArrayList<ChartObject> chartList;

    public SpreadsheetApplication() {
        // Initialize the spreadsheet, bar charts, pie charts, and data objects
        dataMap = new LinkedHashMap<>();
        chartList = new ArrayList<ChartObject>();
    }

    public void upsertData(String item, double value) {
        // Update the data
        object = new ApplicationDataObject(item, value);
        dataMap.put(item, object)
    }

    public void addChart(String chartType) {
        // Add a new chart of the specified type
        switch (chartType) {
            case "Spreadsheet" -> {
                ChartObject chart = new SpreadsheetObject();
                break;
            }
            case "PieChart" -> {
                ChartObject chart = new PieChartObject();
                break;
            }
            case "BarChart" -> {
                ChartObject chart = new BarChartObject();
                break;
            }
        }
        chartList.add(chart);

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