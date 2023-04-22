import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new HashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("")) {
            String[] tokens = line.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Person":
                    String name = tokens[1];
                    String job = tokens[2];
                    int weight = Integer.parseInt(tokens[3]);
                    int height = Integer.parseInt(tokens[4]);
                    Person person = new Person(name, job, weight, height);
                    people.put(name, person);
                    break;
                case "Job":
                    name = tokens[1];
                    person = people.getOrDefault(name, new NullPerson());
                    System.out.println(person.getJob());
                    break;
                case "WeightAverage":
                    String name1 = tokens[1];
                    String name2 = tokens[2];
                    double average = WeightAverage(people, name1, name2);
                    if (Double.isNaN(average)) {
                        System.out.println("Unknown");
                    } else {
                        System.out.println((int) average);
                    }
                    break;
                case "WeightSum":
                    name1 = tokens[1];
                    name2 = tokens[2];
                    int sum = WeightSum(people, name1, name2);
                    if (sum == -1) {
                        System.out.println("Unknown");
                    } else {
                        System.out.println(sum);
                    }
                    break;
                case "HeightAverage":
                    name1 = tokens[1];
                    name2 = tokens[2];
                    average = HeightAverage(people, name1, name2);
                    if (Double.isNaN(average)) {
                        System.out.println("Unknown");
                    } else {
                        System.out.println((int) average);
                    }
                    break;
                case "HeightSum":
                    name1 = tokens[1];
                    name2 = tokens[2];
                    sum = HeightSum(people, name1, name2);
                    if (sum == -1) {
                        System.out.println("Unknown");
                    } else {
                        System.out.println(sum);
                    }
                    break;
                default:
                    break;
            }
            if (scanner.hasNextLine()) {
                line = scanner.nextLine();
            } else {
                scanner.close();
            }
        }}

    public static double WeightAverage(Map<String, Person> people, String name1, String name2) {
        int count = 0;
        int sum = 0;
        for (Person person : people.values()) {
            if (person.getName().equals(name1) || person.getName().equals(name2)) {
                if (person.getWeight() < 0) {
                    return Double.NaN;
                }
                sum += person.getWeight();
                count++;
            }
        }
        return count == 0 ? Double.NaN : sum / (double) count;
    }

    public static int WeightSum(Map<String, Person> people, String name1, String name2) {
        int sum = 0;
        boolean found1 = false;
        boolean found2 = false;
        for (Person person : people.values()) {
            if (person.getName().equals(name1)) {
                if (person.getWeight() < 0) {
                    return -1;
                }
                sum += person.getWeight();
                found1 = true;
            }
            if (person.getName().equals(name2)) {
                if (person.getWeight() < 0) {
                    return -1;
                }
                sum += person.getWeight();
                found2 = true;
            }
        }
        return found1 && found2 ? sum : -1;
    }

    public static double HeightAverage(Map<String, Person> people, String name1, String name2) {
        int count = 0;
        int sum = 0;
        for (Person person : people.values()) {
            if (person.getName().equals(name1) || person.getName().equals(name2)) {
                if (person.getHeight() < 0) {
                    return Double.NaN;
                }
                sum += person.getHeight();
                count++;
            }
        }
        return count == 0 ? Double.NaN : sum / (double) count;
    }

    public static int HeightSum(Map<String, Person> people, String name1, String name2) {
        int sum = 0;
        boolean found1 = false;
        boolean found2 = false;
        for (Person person : people.values()) {
            if (person.getName().equals(name1)) {
                if (person.getHeight() < 0) {
                    return -1;
                }
                sum += person.getHeight();
                found1 = true;
            }
            if (person.getName().equals(name2)) {
                if (person.getHeight() < 0) {
                    return -1;
                }
                sum += person.getHeight();
                found2 = true;
            }
        }
        return found1 && found2 ? sum : -1;
    }
}
