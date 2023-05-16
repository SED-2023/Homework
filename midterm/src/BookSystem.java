import java.util.Map;

public class BookSystem {
    private int lastBookId;
    private Map<Integer, Book> books;

    public void addBook(String userName, String author, String subject) {
        Book book = new Book(lastBookId, subject, author);
        books.put(lastBookId, book);
        lastBookId++;
    }

    public void removeBook(String userName, int bookId) {

    }

    public void listAuthor(String userName, String author) {

    }

    public void listSubject(String userName, String subject) {

    }

    public void listBorrower(String userName, int bookId) {

    }

    public boolean checkBookExist(int bookId) {
        return false;
    }


}
