package Problem5;

public abstract class Client {
     final String name;
     final String address;
     final String number;

    Client(String name, String address, String number){
        this.name = name;
        this.address = address;
        this.number = number;

    }
    public abstract void accept(Visitor visitor);
    
}
