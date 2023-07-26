package Problem5;

public class Resident extends Client{
    private final int familySize;
    Resident(String name, String address, String number, int familySize){
        super(name,address,number);
        this.familySize = familySize;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    
}
