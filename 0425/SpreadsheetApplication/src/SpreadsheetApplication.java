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
        ChartObject chart;
        switch (chartType) {
            case "Spreadsheet" -> {
                chart = new SpreadsheetObject();
            }
            case "PieChart" -> {
                chart = new PieChartObject();
            }
            case "BarChart": {
                chart = new BarChartObject();
            }
        }
        chartList.add(chart);

    }

    public ArrayList<ArrayList<String>> displayCharts() {
        // Display the charts in addChart order
        ArrayList<ArrayList<String>> outlines = new ArrayList<>();
        for(ChartObject chart: chartList){
            outlines.add(chart.display());
        }
        return outlines;
    }


}