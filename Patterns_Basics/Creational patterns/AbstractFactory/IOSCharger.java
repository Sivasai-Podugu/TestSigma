package AbstractFactory;
import java.lang.System;

public class IOSCharger implements Charger{
    public void plugIn(){
        System.out.println("Charger Pluging in........." + 
                "\n...." + 
                "\n..." + 
                "\nIOS Charger Connected.....\n\n");
                System.out.println("Charging the Iphone");
    }

    public void plugOut(){
        System.out.println("Charger Pluging out........." + 
                "\n...." + 
                "\n..." + 
                "\nIOS Charger disconnected....\n\n");
    }
}