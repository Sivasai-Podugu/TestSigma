package Prototype;

public abstract class Laptop {
    public String model;
    public int ram;
    public String os;
    // public String processor;

    public Laptop(){}

    public Laptop(Laptop l){
        this.model = l.model;
        this.ram = l.ram;
        // this.processor = l.processor;
    }

    public abstract Laptop clone();

}


