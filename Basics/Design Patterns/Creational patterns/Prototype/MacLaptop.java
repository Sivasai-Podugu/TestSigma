package Prototype;

public class MacLaptop extends Laptop {

    MacLaptop(){
        os = "IOS" ;
    }

    MacLaptop(MacLaptop ml){
        super(ml);
        this.os = ml.os;
    }

    public Laptop clone(){
        return new MacLaptop(this);
    }
    
}
