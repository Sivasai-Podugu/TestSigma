package Bridge;

public class Client {
    public static void main(String[] args) {
        FuelType gas = new Gasoline();
        FuelType ele = new Electric();

        Vehicle evCar = new Car(ele);
        Vehicle gasTruck = new Truck(gas);
        Vehicle evBike = new Bike(ele);
        Vehicle gasBike = new Bike(gas);

        evCar.manufacture();
        evBike.manufacture();
        gasTruck.manufacture();
        gasBike.manufacture();


    }
}
