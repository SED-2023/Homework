import java.util.ArrayList;

public class UserSystem {
    private ArrayList<User> users = new ArrayList<>();

//    boolean isExist(String Id){
//        for (User ){
//            if (){
//                return
//            }
//            else{
//                return
//            }
//        }
//    }
    public void addUser(String type,String name, int preDefinedNumber) {
        if (type.equals("Staff")) {
            users.add(new Staff(name, type));
        } else {
            users.add(new Borrower(name, type, preDefinedNumber));
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

}
