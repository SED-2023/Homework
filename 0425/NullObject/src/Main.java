import java.io.*;
import java.util.*;

public class Main {
    public static AbstractObject createPerson(String name, String job, String weightStr, String heightStr) {
        AbstractObject person;
        try {
            int weight = Integer.parseInt(weightStr);
            int height = Integer.parseInt(heightStr);
            weight = weight < 0 ? 0 : weight;
            height = height < 0 ? 0 : height;
            person = new RealPerson(name, job, weight, height);
        } catch (NumberFormatException e) {
            person = new NullPerson(name);
        }
        return person;
    }


    public static void main(String[] args) throws IOException {
        Map<String, AbstractObject> people = new HashMap<>();
        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            String line = fileReader.readLine();

            while (line != null) {
//                System.out.println(line);
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "Person":
                        AbstractObject person = createPerson(tokens[1], tokens[2], tokens[3], tokens[4]);
                        people.put(tokens[1], person);
                        break;

                    case "Job":
                        String name = tokens[1];
                        person = people.getOrDefault(name, new NullPerson(name));
                        System.out.println(person.getJob());
                        break;

                    case "WeightAverage":
                        String[] nameList = Arrays.copyOfRange(tokens, 1, tokens.length);
                        double average = calculateWeightAverage(people, nameList);
                        System.out.println(Math.round(average));
                        break;

                    case "WeightSum":
                        String[] nameListForWeightSum = Arrays.copyOfRange(tokens, 1, tokens.length);
                        int sum = calculateWeightSum(people, nameListForWeightSum);
                        System.out.println(sum);
                        break;

                    case "HeightAverage":
                        String[] nameListForHeightAverage = Arrays.copyOfRange(tokens, 1, tokens.length);
                        average = calculateHeightAverage(people, nameListForHeightAverage);
                        System.out.println(Math.round(average));
                        break;

                    case "HeightSum":
                        String[] nameListForHeightSum = Arrays.copyOfRange(tokens, 1, tokens.length);
                        sum = calculateHeightSum(people, nameListForHeightSum);
                        System.out.println(sum);
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
//        people.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
    }

    public static double calculateWeightAverage(Map<String, AbstractObject> people, String[] nameList) {
        int count = 0;
        int sum = 0;
        for (String name : nameList) {
            AbstractObject person = people.getOrDefault(name, new NullPerson(name));
            sum += person.getWeight();
            count++;
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public static int calculateWeightSum(Map<String, AbstractObject> people, String[] nameList) {
        int sum = 0;
        for (String name : nameList) {
            AbstractObject person = people.getOrDefault(name, new NullPerson(name));
            sum += person.getWeight();
        }
        return sum;
    }

    public static double calculateHeightAverage(Map<String, AbstractObject> people, String[] nameList) {
        int count = 0;
        int sum = 0;
        for (String name : nameList) {
            AbstractObject person = people.getOrDefault(name, new NullPerson(name));
            sum += person.getHeight();
            count++;
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public static int calculateHeightSum(Map<String, AbstractObject> people, String[] nameList) {
        int sum = 0;
        for (String name : nameList) {
            AbstractObject person = people.getOrDefault(name, new NullPerson(name));
            sum += person.getHeight();
        }
        return sum;
    }
}
