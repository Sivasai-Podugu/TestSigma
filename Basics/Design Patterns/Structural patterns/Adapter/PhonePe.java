package Adapter;

public class PhonePe implements PaymentGatewayB {
    public void doPayment(double amount){
        System.out.println("\u001B[36m"+"Making payment of "+amount+" in PaymentGatewayB" +"\u001B[0m");
    }
    
}
