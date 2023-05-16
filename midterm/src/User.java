import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public abstract class User {
    public String name;
    public int predefinedBorrowBookNumber;
    public String type;
    public Map<Integer, Book> borrowedBooks = new TreeMap<>();

    public abstract void addBook(BookSystem bookSystem, String author, String subject);

    public abstract void removeBook(BookSystem bookSystem, int bookId);

    public abstract void listBorrower(BookSystem bookSystem, int bookId);

    public abstract void findChecked(User user1, User user2);

    public abstract void returnBook(String userName, int bookId);

    public abstract void checkOut(User user1, User user2, ArrayList<Integer> borrowBookList, BookSystem  bookSystem);
}
