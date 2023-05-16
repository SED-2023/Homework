import java.util.LinkedHashMap;
import java.util.Map;

public class BookSystem {
    private int lastBookId = 0;
    private Map<Integer, Book> books = new LinkedHashMap<>();

    public void addBook(String author, String subject) {
        Book book = new Book(lastBookId, subject, author);
        books.put(lastBookId, book);
        lastBookId++;
    }

    public Book getBook(int bookId) {
        return books.get(bookId);
    }

    public void removeBook(int bookId) {
        books.remove(bookId);
    }

    public void listAuthor(String author) {
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.author.equals(author))
                System.out.println("ID: " + book.id + " Author: " + book.author + " Subject: " + book.subject);
        }
    }

    public void listSubject(String subject) {
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.subject.equals(subject))
                System.out.println("ID: " + book.id + " Author: " + book.author + " Subject: " + book.subject);
        }
    }

    public void listBorrower(int bookId) {
        Book book = books.get(bookId);
        System.out.println("User:" + book.lastCheckoutUser);
    }

    public boolean checkBookExist(int bookId) {
        return books.containsKey(bookId);
    }
}
