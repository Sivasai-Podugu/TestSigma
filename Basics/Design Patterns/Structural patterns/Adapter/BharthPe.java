package Adapter;

public class BharthPe implements PaymentGatewayA{
    public void makePayment(float amount){
        System.out.println("\u001B[36m"+"Making payment of "+amount+" in PaymentGatewayA" +"\u001B[0m");
    }
    
}
