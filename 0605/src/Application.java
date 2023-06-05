public class Application {
    private BookSystem bookSystem = new BookSystem();
    private UserSystem userSystem = new UserSystem();

    public void initAddBook(String author, String subject){
        bookSystem.initAddBook(author, subject);
    }

}
