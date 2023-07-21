package AbstractFactory;

public class IOSSmartwatch implements Smartwatch {
    public void turnOn(){

        System.out.println("Turning on the smartwatch........." + 
        "\n...." + 
        "\n..." + 
        "\nIOS SmartWatch turned on.....\n\n");
        System.out.println("Using the IOS smartwatch");
    }
    public void turnOff(){
       System.out.println("IOS SmartWatch turning off........." + 
        "\n...." + 
        "\n..." + 
        "\n"+"IOS SmartWatch turned off.....");
    }
    
}
