import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Borrower extends User{

    public int predefinedBorrowBookNumber;

    public String type = "Borrower";

    public Map<Integer, Book> borrowedBooks = new TreeMap<>();

    public Borrower (String name, int predefinedBorrowBookNumber) {
        this.name = name;
        this.predefinedBorrowBookNumber = predefinedBorrowBookNumber;
        this.borrowedBooks = new TreeMap<>();
    }
    @Override
    public void addBook(BookSystem bookSystem, String author, String subject) {
        System.out.println("Borrower can not add book");
    }

    @Override
    public void removeBook(BookSystem bookSystem, int bookId) {
        System.out.println("Borrower can not remove book");
    }

    @Override
    public void listBorrower(BookSystem bookSystem, int bookId) {
        System.out.println("Borrower can not find borrower");
    }

    @Override
    public void findChecked(User user1, User user2) {
        if (user1.name.equals(user2.name)) {
            if (user2.borrowedBooks.size() == 0) {
                return;
            }
            // TODO: sout need to sort by book id
            for(Map.Entry<Integer, Book> u: user2.borrowedBooks.entrySet()){

                System.out.println("ID: " + u.getValue().id + " Author: " + u.getValue().author + " Subject: " + u.getValue().subject);
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
    public void checkOut(User user1, User user2, ArrayList<Integer> borrowBookList, BookSystem bookSystem) {
        System.out.println("Borrower can not check out the books");
    }
}
