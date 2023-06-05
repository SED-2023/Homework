public class Book {
    public int id;
    public String subject;
    public String author;
    public boolean isCheckedOut;
    public String lastCheckoutUser;
    public Book(int id, String subject, String author) {
        this.id = id;
        this.subject = subject;
        this.author = author;
        this.isCheckedOut = false;
        this.lastCheckoutUser = "";
    }
}
