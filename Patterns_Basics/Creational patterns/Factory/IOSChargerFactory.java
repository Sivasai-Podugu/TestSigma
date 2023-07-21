package Factory;

public class IOSChargerFactory extends ChargerFactory{
    public Charger createCharger(){
        return new IOSCharger();
    }
    
}
