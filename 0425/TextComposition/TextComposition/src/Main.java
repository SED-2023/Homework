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
            String outputLine = "";
            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "Text":
                    case "GraphicalElement":{
                        client.newComponent(tokens);
                        break;
                    }
                    case "ChangeSize":{
                        outputLine = client.changeSize(tokens);
                        System.out.println(outputLine);
                        break;
                    }
                    case "Require":{
                        String[] list =client.require(tokens);
                        for(String str: list){
                            System.out.println(str);
                        }
                        break;
                    }
                }
                line = fileReader.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Input Error");
        }

    }
}