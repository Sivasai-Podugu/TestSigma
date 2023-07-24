package Builder;

public class LaptopBuilder {
    private String name;
    private String processor;
    private int ram;
    private String os;

    public LaptopBuilder setName(String name){
        this.name = name;
        return this;
    }
    public LaptopBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    public LaptopBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public LaptopBuilder setOs(String os){
        this.os = os;
        return this;
    }
    public Laptop getLaptop(){
        return new Laptop(name,processor, ram,os);
    }
}
