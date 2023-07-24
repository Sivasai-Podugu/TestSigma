package Factory;
/**
 * Factory
 */


public class Factory {
    private static ChargerFactory cf;

    public static void main(String[] args) {
        double random = Math.random() * (1 - 0+ 1) + 0  ; 
        provideCharger((int)random);  
        runBusinessLogic();
    }

    static void provideCharger(int r){
        if((int)r == 1){ //1 == IOS
            // System.out.println("IOS");
            cf = new IOSChargerFactory();
        }
        else{
            // System.out.println("Android");
            cf = new AndroidChargerFactory();
        }

    }

    static void runBusinessLogic(){
        cf.useCharger();

    }

    
}