package Decorator;

public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee c){
        coffee = c;
    }

    public double getCost(){
        return coffee.getCost()+5.0d;
    }

    public String getInfo(){
        return coffee.getInfo()+", Milk" ;
    }
    
}
