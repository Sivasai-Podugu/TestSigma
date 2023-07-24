package Prototype;

public class WindowsLaptop extends Laptop{
    WindowsLaptop(){
        os = "Windows" ;
    }

    WindowsLaptop(WindowsLaptop wl){
        super(wl);
        this.os = wl.os;
    }

    public Laptop clone(){
        return new WindowsLaptop(this);
    }
    
}
