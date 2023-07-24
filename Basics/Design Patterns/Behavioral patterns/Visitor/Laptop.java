package Visitor;

public class Laptop implements Item{
    private double weight;
    Laptop(double weight){
        this.weight = weight;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public double getWeight(){
        return weight;
    }
    
}
