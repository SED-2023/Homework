import java.io.BufferedReader;
import java.io.IOException;

public class Main {
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

                    }
                    case "addChart" -> {

                    }
                    case "change" -> {

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
