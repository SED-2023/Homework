public class Book {

    private int id;

    private String author;

    private String subject;

    private boolean isAvailable;

    public Book(int id, String author, String subject) {
        this.id = id;
        this.author = author;
        this.subject = subject;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
