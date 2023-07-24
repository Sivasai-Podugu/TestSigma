package Adapter;

public class PaymentAdapter implements PaymentGatewayA{
    private PaymentGatewayB paymentGatewayB;

    PaymentAdapter(PaymentGatewayB paymentGatewayB){
        this.paymentGatewayB = paymentGatewayB;
    }

    public void makePayment(float amount){

        double money = (double)amount;
        
        paymentGatewayB.doPayment(money);
    }

    
}
