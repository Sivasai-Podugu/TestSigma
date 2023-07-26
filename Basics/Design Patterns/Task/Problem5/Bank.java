package Problem5;

public class Bank extends Client {
    private final int branchesInsured;
    Bank(String name, String address, String number, int branchesInsured){
        super(name,address,number);
        this.branchesInsured = branchesInsured;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    
}
