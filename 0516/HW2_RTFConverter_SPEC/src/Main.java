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


                switch (line) {
                    case "Tex":
                        application.setFormat("Tex");
                        break;
                    case "TextWidget":
                        application.setFormat("TextWidget");
                        break;
                    default:
                        if (application.getFormat() == null) {
                            break;
                        }
                        outputString.add(application.convert(application.getFormat()));
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
