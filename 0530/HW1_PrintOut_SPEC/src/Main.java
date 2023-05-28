import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Application application = new Application();
        ArrayList<String> outputString = new ArrayList<>();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "Create":
                        application.create(tokens[1], tokens[2]);
                        break;
                    case "Add":
                        application.add(tokens[1], tokens[2]);
                        break;
                    case "Length":
                        application.length();
                        break;
                    case "Size":
                        application.size();
                        break;
                    case "Get":
                        application.get();
                        break;
                    case "GetNode":
                        application.getNode();
                        break;
                    case "PrintOutList":
                        for (String string : application.printOutList(tokens[1])){
                            outputString.add(string);
                        }
                        break;
                    default:
                        break;
                }
                line = fileReader.readLine();
            }
            fileReader.close();

        } catch (IOException ex) {
            System.out.println("Input Error");
        }
        for (String line : outputString) {
            System.out.println(line);
        }
    }
}
