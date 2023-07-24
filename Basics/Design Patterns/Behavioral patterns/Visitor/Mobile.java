package Visitor;

public class Mobile implements Item{
    private double weight;
    Mobile(double weight){
        this.weight = weight;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public double getWeight(){
        return weight;
    }
    
}
