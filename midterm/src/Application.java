import java.util.ArrayList;
import java.util.Map;

public class Application {
    private Map<String, User> users;

    public boolean checkUserExist(String name){
        boolean exist = false;
        for(Map.Entry<String, User> u: users.entrySet()){
            if(name.equals(u.getKey())){
                exist = true;
            }
        }
        return exist;
    }

    public void addUser(String userType, String userName){
        if(checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        if(userType == "Staff"){
            User user = new Staff();
        }
        else if(userType == "Borrower"){
            User user = new Borrower();
        }
        users.put(userName, user);
    }

    public void addBook(String userName, String author, String subject){
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        User user = users.get(userName);
        user.addBook(userName, author, subject);
    }

    public void removeBook(String userName, int bookId){
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        User user = users.get(userName);
        user.removeBook(userName, bookId);
    }

    public void findChecked(String user1, String user2){
        if(!checkUserExist(user1)||!checkUserExist(user2)){
            System.out.println("Error");
            return;
        }
        User user = users.get(user1);
        user.findChecked(user2,);
    }


    public void listAuthor(String userName, String author) {
        bookSystem.listAuthor(userName, author);
    }

    public void listSubject(String userName, String subject) {
        bookSystem.listSubject(userName, subject);
    }

    public void listBorrower(String userName, int bookId) {
        users.get(userName).listBorrower(userName, bookId);
    }
}
