import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Application app = new Application();
        ArrayList<String> outputString = new ArrayList<>();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[1];
                switch (command) {
                    case "add":
                        for (int i = 2; i < tokens.length; i++) {
                            app.addComponent(tokens[0], tokens[i]);
                        }
                        break;

                    case "display":
                        outputString.add(app.display(tokens[0]));
                        break;

                    default:
                        app.addTextView(tokens[0], line.replace(tokens[0] + " ", ""));
                        break;
                }
                line = fileReader.readLine();
            }
            fileReader.close();

            OutputParser OutputParser = new OutputParser();
            OutputParser.parse(outputString, args[0].replace("Input", "Output"));
        } catch (IOException ex) {
//            System.out.println("Input Error");
            System.out.println(ex.getMessage());
        }
    }
}
