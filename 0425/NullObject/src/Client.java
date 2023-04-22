import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static Map<String, AbstractObject> commandPerson(
            Map<String, AbstractObject> people,
            String name,
            String job,
            String weightStr,
            String heightStr) {
        AbstractObject person = createPerson(name, job, weightStr, heightStr);
        people.put(name, person);
        return people;
    }

    public static String commandJob(Map<String, AbstractObject> people, String name) {
        AbstractObject person = people.getOrDefault(name, new NullPerson(name));
        return person.getJob();
    }

    public static String commandWeightAverage(Map<String, AbstractObject> people, String[] tokens) {
        String[] nameList = Arrays.copyOfRange(tokens, 1, tokens.length);
        double average = Client.calculateWeightAverage(people, nameList);
        return Long.toString(Math.round(average));
    }

    public static String commandWeightSum(Map<String, AbstractObject> people, String[] tokens) {
        String[] nameListForWeightSum = Arrays.copyOfRange(tokens, 1, tokens.length);
        int sum = Client.calculateWeightSum(people, nameListForWeightSum);
        return Integer.toString(sum);
    }

    public static String commandHeightAverage(Map<String, AbstractObject> people, String[] tokens) {
        String[] nameListForHeightAverage = Arrays.copyOfRange(tokens, 1, tokens.length);
        double average = Client.calculateHeightAverage(people, nameListForHeightAverage);
        return Long.toString(Math.round(average));
    }

    public static String commandHeightSum(Map<String, AbstractObject> people, String[] tokens) {
        String[] nameListForHeightSum = Arrays.copyOfRange(tokens, 1, tokens.length);
        int sum = Client.calculateHeightSum(people, nameListForHeightSum);
        return Integer.toString(sum);
    }

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

    public static int calculateWeightSum(Map<String, AbstractObject> people, String[] nameList) {
        int sum = 0;
        for (String name : nameList) {
            AbstractObject person = people.getOrDefault(name, new NullPerson(name));
            sum += person.getWeight();
        }
        return sum;
    }

    public static double calculateWeightAverage(Map<String, AbstractObject> people, String[] nameList) {
        int sum = calculateWeightSum(people, nameList);
        int count = nameList.length;
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

    public static double calculateHeightAverage(Map<String, AbstractObject> people, String[] nameList) {
        int sum = calculateHeightSum(people, nameList);
        int count = nameList.length;
        return count == 0 ? 0 : (double) sum / count;
    }
}
