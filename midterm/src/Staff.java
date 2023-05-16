import java.util.ArrayList;

public class Staff extends User{
    @Override
    public void addBook(String userName, String author, String subject) {
        bookSystem.addBook(author, subject);
    }

    @Override
    public void removeBook(String userName, int bookId) {
        bookSystem.removeBook(bookId);
    }

    @Override
    public void listBorrower(String userName, int bookId) {
        bookSystem.listBorrower(bookId);
    }

    @Override
    public void findChecked(User user1, User user2) {
        // TODO: sout need to sort by book id
        for (var entry: borrowedBooks) {
            System.out.println("ID: " + entry.id + " Author: " + entry.author + " Subject: " + entry.subject);
        }
    }

    @Override
    public void returnBook(String userName, int bookId) {

    }

    @Override
    public void checkOut(String user1, String user2, ArrayList<Integer> borrowBookList) {

    }
}
