public class Borrower extends User{
    String name;
    String type;

    int preDefinedNumber;
    public Borrower(String name, String type, int preDefinedNumber){
        this.name = name;
        this.type = type;
        this.preDefinedNumber = preDefinedNumber;
    }
}
