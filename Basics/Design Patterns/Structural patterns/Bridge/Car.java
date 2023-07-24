package Bridge;

public class Car extends Vehicle {
    Car(FuelType f){
        super(f);
    }

    public void manufacture(){

        System.out.println("\u001B[31m"+"Car with fuel type of "+fuelType.getFuel()+" manufactured"+ "\u001B[0m");
    }
    
}
