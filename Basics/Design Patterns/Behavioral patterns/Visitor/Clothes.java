package Visitor;

public class Clothes implements Item{
    private double weight;
    Clothes(double weight){
        this.weight = weight;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public double getWeight(){
        return weight;
    }
    
}
