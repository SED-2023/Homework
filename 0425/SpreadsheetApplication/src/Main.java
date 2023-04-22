import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a new instance of the spreadsheet application
        SpreadsheetApplication app = new SpreadsheetApplication();
        ArrayList<String> outputString = new ArrayList<>();

        // Read input file and update data object
        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            while (line != null) {
                String[] tokens = line.split(" ");
                switch (tokens[0]) {
                    case "data":{
                        app.upsertData(tokens);
                        break;
                    }
                    case "addChart":{
                        app.addChart(tokens);
                        break;
                    }
                    case "change":{
                        String log = String.format("%s %s %s %s",tokens[1], tokens[0], tokens[2], tokens[3]);
                        System.out.println(log);
                        String[] tokensFixed = {tokens[0], tokens[2], tokens[3]};
                        app.upsertData(tokensFixed);
                        ArrayList<ArrayList<String>> list = app.displayCharts();
                        for(ArrayList<String> chart: list){
                            for(String dataLine: chart) {
                                System.out.println(dataLine);
                            }
                        }
                        break;
                    }
                }
                line = fileReader.readLine();
            }
            fileReader.close();
            OutputParser OutputParser = new OutputParser();
            OutputParser.parse(outputString, args[0].replace("Input", "Output"));
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
        }
    }
}
