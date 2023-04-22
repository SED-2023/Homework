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

    public void upsertData(String[] input) {
        // Update the data
        String item = input[1];
        double value = Double.parseDouble(input[2]);
        ApplicationDataObject object = new ApplicationDataObject(item, value);
        dataMap.put(item, object);
    }

    public void addChart(String[] input) {
        // Add a new chart of the specified type
        String chartType = input[1];
        ChartObject chart = null;
        switch (chartType) {
            case "Spreadsheet" -> {
                chart = new SpreadsheetObject();
            }
            case "PieChart" -> {
                chart = new PieChartObject();
            }
            case "BarChart" -> {
                chart = new BarChartObject();
            }
        }
        chartList.add(chart);

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