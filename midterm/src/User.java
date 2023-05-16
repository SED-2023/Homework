import java.util.ArrayList;

public abstract class User {
    String name;

    public abstract void addBook(String userName, String author, String subject);

    public abstract void removeBook(String userName, int bookId);

    public abstract void listBorrower(String userName, int bookId);

    public abstract void findChecked(String userName, int bookId);

    public abstract void returnBook(String userName, int bookId);

    public abstract void checkOut(String user1, String user2, ArrayList<Integer> borrowBookList);
}
