package Builder;

public class Client {
    public static void main(String[] args) {
        Laptop lb1 = new LaptopBuilder().setOs("Windows").setRam(16).setName("Asus").setProcessor("Intel").getLaptop();
        Laptop lb2 = new LaptopBuilder().setOs("IOS").setRam(16).getLaptop();
        Laptop lb3 = new LaptopBuilder().setOs("Windows").setName("Acer").setProcessor("Ryzen").getLaptop();

        System.out.println(lb1);
        System.out.println(lb2);
        System.out.println(lb3);
    }
    
}
