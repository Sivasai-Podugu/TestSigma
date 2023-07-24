package Bridge;

public abstract class Vehicle {
    protected FuelType fuelType;
    
    Vehicle(FuelType fuelType){
        this.fuelType = fuelType;
    }

    public abstract void manufacture(); 
}
