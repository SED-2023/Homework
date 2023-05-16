import java.util.ArrayList;

public abstract class User {
    String name;

    public abstract void addBook(String userName, String author, String subject);

    public abstract void removeBook(String userName, int bookId);

    public abstract void listBorrower(String userName, int bookId);

    public abstract void findChecked(User user1, User user2);

    public abstract void returnBook(String userName, int bookId);

    public abstract void checkOut(Staff user1, Borrower user2, ArrayList<Integer> borrowBookList);
}
