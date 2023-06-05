import java.util.ArrayList;

public class BookSystem {
    private ArrayList<Book> books;

    private int nextId = 0;

    public BookSystem(){
        books = new ArrayList<>();
    }

    public void addBook(String author, String subject){
        Book book = new Book(nextId, author, subject);
        books.add(book);

    }

    public void removeBook(String bookId){
        int id = Integer.parseInt(bookId);
        for(Book book: books){
            if(book.getId() == id){
                books.remove(book);
                return;
            }
        }
    }

    public Book getBookById(int id){
        for(Book book: books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public Book getBookByAuthor(String author) {
        for(Book book: books){
            if(book.getAuthor().equals(author)){
                return book;
            }
        }
        return null;
    }

    public Book getBookBySubject(String subject) {
        for(Book book: books){
            if(book.getSubject().equals(subject)){
                return book;
            }
        }
        return null;
    }
}
