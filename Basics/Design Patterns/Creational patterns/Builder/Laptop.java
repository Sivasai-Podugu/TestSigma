package Builder;

public class Laptop {
    private String name;
    private String processor;
    private int ram;
    private String os;
    Laptop(String name, String processor, int ram, String os){
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.os = os;
    }

    @Override
    public String toString(){
        return "Mobile { name: " +name+"; processor: "+processor+"; ram: "+ram+"; os: "+os+" }"; 
    }
}
