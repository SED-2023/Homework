import java.util.ArrayList;

public class UserSystem {
    ArrayList<User> users;
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
    void addUser(String type,String name, int preDefinedNumber) {
        if (type.equals("Staff")) {
            users.add(new Staff(name, type));
        } else {
            users.add(new Borrower(name, type, preDefinedNumber));
        }
    }
}
