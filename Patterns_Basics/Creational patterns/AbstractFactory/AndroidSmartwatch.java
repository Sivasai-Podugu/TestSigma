package AbstractFactory;

public class AndroidSmartwatch implements Smartwatch{
    public void turnOn(){

        System.out.println("Turning on the smartwatch........." + 
        "\n...." + 
        "\n..." + 
        "\nAndroid SmartWatch turned on.....\n\n");
        System.out.println("Using the andorid smartwatch");
    }
    public void turnOff(){
       System.out.println("Android SmartWatch turning off........." + 
        "\n...." + 
        "\n..." + 
        "\n"+"Android SmartWatch turned off.....");
    }
    
}
