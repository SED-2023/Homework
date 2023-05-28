import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Application application = new Application();
        ArrayList<String> outputString = new ArrayList<>();

//        try {
//            InputParser input = new InputParser();
//            BufferedReader fileReader = input.parse(args);
//            String line = fileReader.readLine();
//
//            while (line != null) {
//                String[] tokens = line.split(" ");
//                String command = tokens[0];
//                switch (command) {
//                    case "PM", "Motif":
//                        application.Styling(command);
//                        break;
//                    case "Button", "ScrollBar", "Window":
//                        application.setWidget(command, tokens[1]);
//                        break;
//                    case "Present":
//                        application.present();
//                        break;
//                    default:
//                        break;
//                }
//                line = fileReader.readLine();
//            }
//            fileReader.close();
//
//        } catch (IOException ex) {
////            System.out.println("Input Error");
//        }
        //print
        for (String line : outputString) {
            System.out.println(line);
        }
    }
}
