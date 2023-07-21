package Prototype;
import java.util.ArrayList;
import java.util.List;
public class Prototype {
    public static void main(String[] args) {
        List<Laptop> laptopStore = new ArrayList<>();

        WindowsLaptop wl = new WindowsLaptop();
        wl.model = "Acer Aspire 7";
        wl.ram =8;

        laptopStore.add(wl);

        WindowsLaptop wlcopy = (WindowsLaptop) wl.clone();
        laptopStore.add(wlcopy);

        MacLaptop ml = new MacLaptop();
        ml.model = "M1 pro";
        ml.ram =32;

        laptopStore.add(ml);

        MacLaptop mlcopy = (MacLaptop) ml.clone();
        laptopStore.add(mlcopy);

        for (Laptop laptop : laptopStore) {
            System.out.println( "Laptop { model: " +laptop.model+"; ram: "+laptop.ram+"; os: "+laptop.os+" }");
            
        }

    }
    
}
