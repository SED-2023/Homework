import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SpreadsheetApplication {
    private final SpreadsheetObject spreadsheet;
    private final BarChartObject barCharts;
    private final PieChartObject pieCharts;
    private final ApplicationDataObject data;

    public SpreadsheetApplication() {
        // Initialize the spreadsheet, bar charts, pie charts, and data objects
        spreadsheet = new SpreadsheetObject();
        barCharts = new BarChartObject();
        pieCharts = new PieChartObject();
        data = new ApplicationDataObject();
    }

    public void updateData(String item, double value) {
        // Update the data
        spreadsheet.setData(data);
        barCharts.setData(data);
        pieCharts.setData(data);
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

    public static void main(String[] args) throws IOException {
        // Create a new instance of the spreadsheet application
        SpreadsheetApplication app = new SpreadsheetApplication();

        // Read input file and update data object
        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            while (line != null) {
                String[] tokens = line.split(" ");
                switch (tokens[0]) {
                    case "data" -> {
                        // Update data object with new value
                        String item = tokens[1];
                        double value = Double.parseDouble(tokens[2]);
                        app.data.updateData(item, value);
                        // Update the data
                        app.updateData(item, value);
                    }
                    case "addChart" -> {
                        // Add a new chart of the specified type
                        String chartType = tokens[1];
                        app.displayCharts(chartType);
                    }
                    case "change" -> {
                        // Change the value of an item in the specified chart
                        String chartType = tokens[1];
                        String item = tokens[2];
                        double value = Double.parseDouble(tokens[3]);
                        app.changeValue(chartType, item, value);
                    }
                }
                line = fileReader.readLine();
            }
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
        }
    }
}