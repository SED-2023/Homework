public class Application {
    private BookSystem bookSystem = new BookSystem();
    private UserSystem userSystem = new UserSystem();

    public void initAddBook(String author, String subject){
        bookSystem.addBook(author, subject);
    }
    public void initAddUser(String type, String name, int predefinedBorrowedBooks){
        userSystem.addUser(type, name, predefinedBorrowedBooks);
    }
//    public addBook(User user, String author, String subject){
//
//    }
}
