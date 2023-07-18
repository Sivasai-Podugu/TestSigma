// 2. Write a program for credit and debit using multithreading.

import java.util.ArrayList;


class DebitThread extends Thread{

    long amount;
    String name;
    Bank obj;

    DebitThread(long amount, String name, Bank obj){
        this.amount = amount;
        this.name = name;
        this.obj = obj;
        
    }

    public void run (){
        try{
            this.obj.debit(this.amount, this.name);
        }

        catch (BalanceInsufficient ex){
            System.out.println("Exception occured: "+ex);
        }
    }

}

class CreditThread extends Thread{

    long amount;
    String name;
    Bank obj;

    CreditThread(long amount, String name, Bank obj){
        this.amount = amount;
        this.name = name;
        this.obj = obj;
        
    }

    public void run (){
 
        this.obj.credit(this.amount, this.name);
        
        
    }

}

class Program2 {


    public static void main(String[] args) throws IdAlreadyPresent, BalanceInsufficient{
        ArrayList<Bank> accounts = new ArrayList<Bank>();

		

		
		//creation
		try{
			Bank.AccountType a1 = Bank.AccountType.Saving;
			Bank b1 = new Bank (1,a1, "Siva", 20000000L,accounts);
			b1.display();
			accounts.add(b1);

			Bank.AccountType a2= Bank.AccountType.Saving;
			Bank b2 = new Bank(2,a2, "Sunil", 15000000L,accounts);
			b2.display();

			accounts.add(b2);

            //retrival
            for(int i=0; i<accounts.size(); i++){
                accounts.get(i).display();
            }

            DebitThread d1 = new DebitThread(20000L, "Siva", b2);
            DebitThread d2 = new DebitThread(30000L, "Sunil", b1);

            CreditThread c1 = new CreditThread(30000L, "Siva", b1);
            CreditThread c2 = new CreditThread(20000L, "Sunil", b2);

            d1.start();
            d2.start();
            c1.start();
            c2.start();
			
		}

		catch (IdAlreadyPresent ex){
			System.out.println("Exception occured: " + ex); 
		}

		


    }
}