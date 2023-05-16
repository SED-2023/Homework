import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Borrower extends User{

    int predefinedBorrowBookNumber;

    Map<Integer, Book> borrowedBooks = null;

    public Borrower (String name, int predefinedBorrowBookNumber) {
        this.name = name;
        this.predefinedBorrowBookNumber = predefinedBorrowBookNumber;
        this.borrowedBooks = new TreeMap<>();
    }
    @Override
    public void addBook(String userName, String author, String subject) {
        System.out.println("Borrower can not add book");
    }

    @Override
    public void removeBook(String userName, int bookId) {
        System.out.println("Borrower can not remove book");
    }

    @Override
    public void listBorrower(String userName, int bookId) {
        System.out.println("Borrower can not find borrower");
    }

    @Override
    public void findChecked(User user1, User user2) {
        if (user1.name.equals(user2.name)) {
            // TODO: sout need to sort by book id
            for (var entry: user2.borrowedBooks) {
                System.out.println("ID: " + entry.id + " Author: " + entry.author + " Subject: " + entry.subject);
            }
        }else {
            System.out.println("Borrower can not find books checked out by other users");
        }
    }

    @Override
    public void returnBook(String userName, int bookId) {
        System.out.println("Borrower can not return book");
    }

    @Override
    public void checkOut(String user1, String user2, ArrayList<Integer> borrowBookList) {

    }
}
