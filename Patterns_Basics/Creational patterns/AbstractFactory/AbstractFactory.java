package AbstractFactory;

public class AbstractFactory {
    static Application configure(){
        DeviceFactory df;

        double r = Math.random() * (1 - 0+ 1) + 0  ;
        if((int)r == 1){ //1 == IOS
            // System.out.println("IOS");
            df = new IOSDeviceFactory();
        }
        else{
            // System.out.println("Android");
            df = new AndroidDeviceFactory();
        }
        return new Application(df);
    }

    public static void main(String[] args) {
        Application app = configure();
        app.useFeatures();
    }

    
}
