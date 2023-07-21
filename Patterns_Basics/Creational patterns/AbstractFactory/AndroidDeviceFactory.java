package AbstractFactory;

public class AndroidDeviceFactory implements DeviceFactory {

    public Smartwatch createSmartwatch(){
        return new AndroidSmartwatch();
    }

    public Charger createCharger(){
        return new AndroidCharger();
    }
    
}
