public class Transaction {
    private User user;
    private Book book;
    private String action;

    public Transaction(User user, Book book, String action) {
        this.user = user;
        this.book = book;
        this.action = action;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public String getAction() {
        return action;
    }
}
