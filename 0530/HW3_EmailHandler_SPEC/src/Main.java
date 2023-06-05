import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            // define handlers
            Handler fan = new FanHandler(null);
            Handler complaint = new ComplaintHandler(fan);
            Handler spam = new SpamHandler(complaint);

            Handler emailHandler = spam;

            // Read the file line
            while  (line != null) {
                String[] tokens = line.split(" ");
                if (tokens.length != 1){
                    line = fileReader.readLine();
                    continue;
                }
                String emailType = tokens[0];
                Email mail = new Email(emailType);

                emailHandler.handle(mail);


                line = fileReader.readLine();
            };

            fileReader.close();

        } catch (IOException ex) {
//            System.out.println("Input Error");
        }
    }
}
