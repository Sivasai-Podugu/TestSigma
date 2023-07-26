package Problem5;

public class Restuarent extends Client {
    private final int noOfBranches;
    Restuarent(String name, String address, String number, int noOfBranches){
        super(name,address,number);
        this.noOfBranches = noOfBranches;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
