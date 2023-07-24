
package Bridge;

public class Truck extends Vehicle {
    Truck(FuelType f){
        super(f);
    }

    public void manufacture(){
        System.out.println("\u001B[34m"+"Truck with fuel type of "+fuelType.getFuel()+" manufactured"+ "\u001B[0m");
    }
    
}
