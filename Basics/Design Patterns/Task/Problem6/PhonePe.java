package Problem6;

public class PhonePe implements Payment{    

    @Override
    public int credit(int amount,int balance) {
        
        System.out.println("\u001B[34m"+"Amount Credited via PhonePe..."+ "\u001B[0m");
        return amount+balance;

    }

    @Override
    public int debit(int amount,int balance) {
        if(amount> balance){
            System.out.println("\u001B[36m"+"Insufficient Balance..."+ "\u001B[0m");
            return balance;
            
        }
        else{
            System.out.println("\u001B[36m"+"Amount Debited via Gpay"+ "\u001B[0m");
            return (balance - amount);
           
        }
    }
}
