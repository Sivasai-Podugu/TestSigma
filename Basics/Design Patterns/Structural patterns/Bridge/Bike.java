package Bridge;

public class Bike extends Vehicle {
    Bike(FuelType f){
        super(f);
    }

    public void manufacture(){
        System.out.println("\u001B[32m"+"Bike with fuel type of "+fuelType.getFuel()+" manufactured"+ "\u001B[0m");
    }
    
}
