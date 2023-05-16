import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
    private Map<String, User> users;
    public BookSystem bookSystem;

    public Application(){
        users = new LinkedHashMap<>();
        bookSystem = new BookSystem();
    }

    public boolean checkUserExist(String name){
        boolean exist = false;
        for(Map.Entry<String, User> u: users.entrySet()){
            if(name.equals(u.getKey())){
                exist = true;
            }
        }
        return exist;
    }

    public void addUser(String userType, String userName, String predefinedBorrowBookNumber){
        if(checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        if(userType.equals("Staff")){
            User user = new Staff(userName);
            users.put(userName, user);
        }
        else if(userType.equals("Borrower")){
            User user = new Borrower(userName, Integer.parseInt(predefinedBorrowBookNumber));
            users.put(userName, user);
        }
    }

    public void initAddBook(String author, String subject){

        bookSystem.addBook(author, subject);
    }
    public void addBook(String userName, String author, String subject){
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        User user = users.get(userName);
        user.addBook(bookSystem, author, subject);
    }

    public void removeBook(String userName, int bookId){
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        User user = users.get(userName);
        user.removeBook(bookSystem, bookId);
    }

    public void findChecked(String user1, String user2){
        if(!checkUserExist(user1)||!checkUserExist(user2)){
            System.out.println("Error");
            return;
        }
        User u1 = users.get(user1);
        User u2 = users.get(user2);
        u1.findChecked(u2);
    }


    public void listAuthor(String userName, String author) {
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        bookSystem.listAuthor(author);
    }

    public void listSubject(String userName, String subject) {
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        bookSystem.listSubject(subject);
    }

    public void listBorrower(String userName, int bookId) {
        if(!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        users.get(userName).listBorrower(bookSystem, bookId);
    }

    public void returnBook(String userName, int bookId){
        if (!checkUserExist(userName)){
            System.out.println("Error");
            return;
        }
        User user = users.get(userName);
        user.returnBook(userName, bookId);
    }

    public void checkOut(String user1, String user2, ArrayList<String> borrowBookList){
        if(!checkUserExist(user1)){
            System.out.println("Error");
            return;
        }
        if (!checkUserExist(user2)) {
            System.out.println("Error");
            return;
        }

        User staff = users.get(user1);
        User borrower = users.get(user2);
//
//        if (borrower.type.equals("Staff")) {
//            System.out.println("Error");
//            return;
//        }
        ArrayList<Integer> borrowBookListInt = new ArrayList<Integer>();
        for(String stringValue : borrowBookList) {
            borrowBookListInt.add(Integer.parseInt(stringValue));
        }
        staff.checkOut(staff, borrower, borrowBookListInt,  bookSystem);


    }
}
