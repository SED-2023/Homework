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
                    case "Draw":
                    case "Text":
                        application.createDocument(tokens[0]);
                        break;

                    case "Present":
                        ArrayList<String> outputTemp = application.present();
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

        } catch (IOException ex) {
//            System.out.println("Input Error");
        }
        //print
        for (String line : outputString) {
            System.out.println(line);
        }
    }
}
