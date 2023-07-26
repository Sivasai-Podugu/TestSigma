package Problem5;

public class Company extends Client {
    private final int noOfEmployees;
    Company(String name, String address, String number, int noOfEmployees){
        super(name,address,number);
        this.noOfEmployees = noOfEmployees;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    
}
