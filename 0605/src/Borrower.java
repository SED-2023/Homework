public class Borrower extends User{
    private int preDefinedNumber;
    public Borrower(String name, String type, int preDefinedNumber){
//        this.name = name;
//        this.type = type;
        super(name, type);
        this.preDefinedNumber = preDefinedNumber;
    }

    public void setPreDefinedNumber(int preDefinedNumber) {
        this.preDefinedNumber = preDefinedNumber;
    }

    public int getPreDefinedNumber() {
        return preDefinedNumber;
    }
}
