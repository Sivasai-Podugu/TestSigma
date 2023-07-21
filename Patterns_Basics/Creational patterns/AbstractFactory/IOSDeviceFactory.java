package AbstractFactory;

public class IOSDeviceFactory implements DeviceFactory{

    public Smartwatch createSmartwatch(){
        return new IOSSmartwatch();
    }

    public Charger createCharger(){
        return new IOSCharger();
    }
    
}
