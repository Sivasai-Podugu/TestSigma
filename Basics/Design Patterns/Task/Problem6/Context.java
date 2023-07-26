package Problem6;



public class Context {

    private Payment payment ;

    void setStrategy(Payment payment){
        this.payment = payment;
    }
    
    int executeCredit(int amount, int balance){
        return payment.credit(amount,balance);
    }
    int executeDebit(int amount, int balance){
        return payment.debit(amount,balance);
    }
    
}