package Visitor;

import java.util.List;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>(); 

        Item laptop = new Laptop(2000.0d);
        Item mobile = new Mobile(220.0d);
        Item clothes =  new Clothes(2500.0d);

        cart.add(laptop);
        cart.add(mobile);
        cart.add(clothes);

        ShippingCostCalculator scc = new ShippingCostCalculator();
        scc.executeVisit(cart);
    }
    
}
