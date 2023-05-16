import java.util.ArrayList;

public class Borrower extends User{

    int predefinedBorrowBookNumber;

    ArrayList<Book> borrowedBooks = null;

    public Borrower (String name, int predefinedBorrowBookNumber) {
        this.name = name;
        this.predefinedBorrowBookNumber = predefinedBorrowBookNumber;
        this.borrowedBooks = new ArrayList<>();
    }
    @Override
    public void addBook(String userName, String author, String subject) {

    }

    @Override
    public void removeBook(String userName, int bookId) {

    }

    @Override
    public void listBorrower(String userName, int bookId) {

    }

    @Override
    public void findChecked(String userName, int bookId) {

    }

    @Override
    public void returnBook(String userName, int bookId) {

    }

    @Override
    public void checkOut(String user1, String user2, ArrayList<Integer> borrowBookList) {
        System.out.println("Borrower can not check out the books");
    }
}
