import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> outputString = new ArrayList<>();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = null;

            // define handlers
            Handler fan = new FanHandler(null);
            Handler complaint = new ComplaintHandler(fan);
            Handler spam = new SpamHandler(complaint);

            Handler emailHandler = spam;

            // Read the file line
            do {
                line = fileReader.readLine();
                String[] tokens = line.split(" ");
                if (tokens.length != 1){
                    continue;
                }
                String emailType = tokens[0];
                Email mail = new Email(emailType);

                emailHandler.handle(mail);


                line = fileReader.readLine();
            } while  (line != null);

            fileReader.close();

        } catch (IOException ex) {
//            System.out.println("Input Error");
        }
    }
}
