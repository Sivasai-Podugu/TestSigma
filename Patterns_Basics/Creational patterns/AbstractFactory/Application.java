package AbstractFactory;

/**
 * Application
 */
public class Application {

    private Charger ch;
    private Smartwatch sw;

    Application(DeviceFactory df){
        ch = df.createCharger();
        sw = df.createSmartwatch();
    }

    void useFeatures(){
        ch.plugIn();
        ch.plugOut();
        sw.turnOn();
        sw.turnOff();
    }
}