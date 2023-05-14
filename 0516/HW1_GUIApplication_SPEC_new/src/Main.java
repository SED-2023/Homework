import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Application application = new Application();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "ScrollBar":
                        application.addScrollBar(tokens[1]);
                        break;
                    case "Window":
                        application.addWindow(tokens[1]);
                        break;
                    case "Button":
                        application.addButton(tokens[1]);
                        break;
                    case "Present":
                        application.present();
                        break;

                    case "Motif":
                    case "PM":
                        application.setStyle(tokens[0]);
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
    }
}
