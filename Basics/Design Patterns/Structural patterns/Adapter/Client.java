package Adapter;

public class Client {
    public static void main(String[] args) {
        PaymentGatewayB pgb = new PhonePe();
        PaymentGatewayA adapter = new PaymentAdapter(pgb);
        adapter.makePayment(499.00f); 
    }
    
}
