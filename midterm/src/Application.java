import java.util.ArrayList;
import java.util.Map;

public class Application {
    private Map<String, User> users;
    public BookSystem bookSystem;

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
        User u1 = users.get(user1);
        User u2 = users.get(user2);
        u1.findChecked(u1, u2);
    }


    public void listAuthor(String userName, String author) {
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        bookSystem.listAuthor(userName, author);
    }

    public void listSubject(String userName, String subject) {
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        bookSystem.listSubject(userName, subject);
    }

    public void listBorrower(String userName, int bookId) {
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        users.get(userName).listBorrower(userName, bookId);
    }

    public void returnBook(String userName, int bookId){
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        User user = users.get(userName);
        user.returnBook(userName, bookId);
    }

    public void checkOut(String user1, String user2, ArrayList<Integer> borrowBookList){
        if(!checkUserExist(user1)){
            System.out.println("Error");
            return;
        }
        if (!checkUserExist(user2)) {
            System.out.println("Error");
            return;
        }
        try {
            User staff = users.get(user1);
            User borrower = users.get(user2);

            if (borrower.type.equals("Staff")) {
                System.out.println("Error");
                return;
            }
            staff.checkOut(staff, borrower, borrowBookList);
        }
        catch(Exception e){
            System.out.println("Error");
            return;
        }
    }


}
