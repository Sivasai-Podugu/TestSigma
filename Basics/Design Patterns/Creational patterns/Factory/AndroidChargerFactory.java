package Factory;

public class AndroidChargerFactory extends ChargerFactory{

    public Charger createCharger(){
        return new AndroidCharger();
    }
    
}
