public class Application {
    private BookSystem bookSystem = new BookSystem();
    private UserSystem userSystem = new UserSystem();

    public void initAddBook(String author, String subject){
        bookSystem.addBook(author, subject);
    }
    public void initAddUser(String type, String name){
        userSystem.addUser(type, name);
    }

}
