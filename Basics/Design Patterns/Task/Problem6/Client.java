package Problem6;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Context c= new Context();
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("Siva", 65000);
        System.out.println(account.name+" currently holding "+account.balance+ " in his bank account");
        System.out.println("Enter which payment you want to use (GPay | Paytm| PhonePe):");
        String s = sc.nextLine();
        if(s.equals("GPay") ){
            c.setStrategy(new GPay());
        }
        else if(s.equals("PhonePe")) {
            c.setStrategy(new PhonePe());
        }
        else if(s.equals("Paytm")) {
            c.setStrategy(new Paytm());
        }

        else{
            System.out.println("Undefined Payment....");
        }
        if(s.equals("PhonePe") || s.equals("GPay") || s.equals("Paytm")){
            System.out.println("Enter which operation you want to use (debit | credit):");
            String op = sc.nextLine();
            System.out.println("Enter amount:");
            int amount = sc.nextInt();
            if(op.equals("debit")){
                account.balance = c.executeCredit(amount, account.balance);

            }
            else if(op.equals("credit")){
                account.balance = c.executeDebit(amount, account.balance);
            }
            System.out.println("Now, "+account.name+" currently holding "+account.balance+ " in his bank account");
        }
            
        sc.close();
    }
}