import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();
            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "Text":
                    case "GraphicalElement":{
                        client.newComponent(tokens);
                    }
                    case "ChangeSize":{
                        client.changeSize(tokens);
                    }
                    case "Require":{
                        client.require(tokens);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Input Error");
        }

    }
}