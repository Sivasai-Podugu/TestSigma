package Visitor;
import java.util.List;

public class ShippingCostCalculator implements Visitor{
    private double totalShippingCost=0.0;

    public void visit(Mobile mobile){
        double shippingCost = mobile.getWeight() * 2.0;
        totalShippingCost += shippingCost;
    }

    public void visit(Laptop laptop){
        double shippingCost = laptop.getWeight() * 1.0;
        totalShippingCost += shippingCost;
    }

    public void visit(Clothes clothes){
        double shippingCost = clothes.getWeight() * 0.5;
        totalShippingCost += shippingCost;
    }

    public double getTotalCost(){
        return totalShippingCost;
    }

    public void executeVisit(List<Item> cart){
        for (Item item : cart) {
            item.accept(this);
        }
        System.out.println("Total Shipping cost: "+this.totalShippingCost);

        
    }
    
}
