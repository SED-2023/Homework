import java.util.ArrayList;

public class Application {
    private Map<String, User> users;

    public boolean checkUserExist(String name){
        boolean exist = false;
        for(User u: users){
            if(name.equals(u.name)){
                exist = true;
            }
        }
        return exist;
    }

    public void addUser(String userType, String userName){
        if(checkUserExist(name)){
            System.out.println("Error");
            return;
        }
        user = new User(userType, userName);
        users.put(type, user);
        return;
    }

    public void addBook(String userName, String author, String subject){
        if(checkUserExist(name)){
            System.out.println("Error");
            return;
        }
        users.get(userName)
    }
}
