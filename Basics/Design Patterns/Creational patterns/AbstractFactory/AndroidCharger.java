package AbstractFactory;

public class AndroidCharger implements Charger{
    public void plugIn(){
        System.out.println("Charger Pluging in........." + 
        "\n...." + 
        "\n..." + 
        "\nAndroid Charger Connected.....\n\n");
        System.out.println("Charging the Android phone");
    }

    public void plugOut(){
        System.out.println("Charger Pluging out........." + 
                "\n...." + 
                "\n..." + 
                "\nAndroid Charger disconnected....\n\n");
    }
    
}
