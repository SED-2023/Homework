import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> outputString = new ArrayList<>();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "Draw":
                    case "Text":
                        Application.createDocument(tokens[0]);
                        break;

                    case "Present":
                        ArrayList<String> outputTemp = Application.present();
                        for(String o :outputTemp){
                            outputString.add(o);
                        }
                        break;

                    default:
                        break;
                }
                line = fileReader.readLine();
            }
            fileReader.close();

            OutputParser OutputParser = new OutputParser();
            OutputParser.parse(outputString, args[0].replace("Input", "Output"));
        } catch (IOException ex) {
//            System.out.println("Input Error");
        }
        //print
//        people.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
    }
}
