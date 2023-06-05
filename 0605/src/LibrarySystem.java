import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) throws IOException {
        Application application = new Application();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            // add init books
            String line = fileReader.readLine();
            int numOfBooks = Integer.parseInt(line);
            for (int i = 0; i < numOfBooks; i++) {
                line = fileReader.readLine();
                String[] tokens = line.split(" ");
                application.initAddBook(tokens[0], tokens[1]);
            }
            // add init users
            line = fileReader.readLine();
            int numOfUsers = Integer.parseInt(line);
            for (int i = 0; i < numOfUsers; i++) {
                line = fileReader.readLine();
                String[] tokens = line.split(" ");
                if (tokens[0].equals("Staff") && tokens.length == 2)
                    application.initAddUser(tokens[0], tokens[1], "0");
                else if (tokens[0].equals("Borrower") && tokens.length == 3)
                    application.initAddUser(tokens[0], tokens[1], tokens[2]);
                else {
                    System.out.println("Error");
                }
            }
            // do functions
            line = fileReader.readLine();
            while (line != null) {
                String[] tokens = line.split(" ");
                String user = tokens[0];
                String command = tokens[1];
                switch (command) {
                    case "addBook":
                        line = fileReader.readLine();
                        tokens = line.split(" ");
                        application.addBook(user, tokens[0], tokens[1]);
                        break;
                    case "removeBook":
                        application.removeBook(user, Integer.parseInt(tokens[2]));
                        break;
                    case "checkout":
                        String user2 = tokens[2];
                        line = fileReader.readLine();
                        tokens = line.split(" ");

                        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(tokens));
                        application.checkOut(user, user2, stringList);
                        break;
                    case "returnBook":
                        application.returnBook(user, Integer.parseInt(tokens[2]));
                        break;
                    case "listAuthor":
                        application.listAuthor(user, tokens[2]);
                        break;
                    case "listSubject":
                        application.listSubject(user, tokens[2]);
                        break;
                    case "findChecked":
                        application.findChecked(user, tokens[2]);
                        break;
                    case "listBorrower":
                        application.listBorrower(user, Integer.parseInt(tokens[2]));
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
