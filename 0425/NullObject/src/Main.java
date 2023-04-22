import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, AbstractObject> people = new HashMap<>();
        ArrayList<String> outputString = new ArrayList<>();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "Person":
                        people = Client.commandPerson(people, tokens[1], tokens[2], tokens[3], tokens[4]);
                        break;

                    case "Job":
                        outputString.add(Client.commandJob(people, tokens[1]));
                        break;

                    case "WeightAverage":
                        outputString.add(Client.commandWeightAverage(people, tokens));
                        break;

                    case "WeightSum":
                        outputString.add(Client.commandWeightSum(people, tokens));
                        break;

                    case "HeightAverage":
                        outputString.add(Client.commandHeightAverage(people, tokens));
                        break;

                    case "HeightSum":
                        outputString.add(Client.commandHeightSum(people, tokens));
                        break;
                    default:
                        break;
                }
                line = fileReader.readLine();
            }
            fileReader.close();

            OutputParser OutputParser = new OutputParser();
            OutputParser.parse(outputString);
        } catch (IOException ex) {
//            System.out.println("Input Error");
        }
        //print
//        people.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
    }
}
