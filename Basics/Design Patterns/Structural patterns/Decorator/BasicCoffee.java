package Decorator;

public class BasicCoffee implements Coffee{
    public double getCost(){
        return 10.0d;
    }

    public String getInfo(){
        return "Basic Coffee";
    }
}
