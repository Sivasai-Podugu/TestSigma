/* 1. Girish started a new banking service, where he is facing difficulties with the storing of the account details. Help him
by writing a program to create add, delete, insert list of BankAccounts, each bank account should have following

details.
a. Unique Account Id (Integer)
b. Account Type (Enum : < Saving / Current >)
c. Account Holder name (String)
d. Account balance (variable that can store 20k million value) */

import java.util.ArrayList;
import java.util.Scanner;


class IdAlreadyPresent extends Exception{
	public IdAlreadyPresent(String mes){
		super(mes);
	}
}

class IdDoesNotExist extends Exception{
	public IdDoesNotExist(String mes){
		super(mes);
	}
}

class BalanceInsufficient extends Exception{
	public BalanceInsufficient(String mes){
		super(mes);
	}
}

class Bank {
	public enum AccountType {Saving, Current};

	int accountId;
	String holderName;
	AccountType at;
	long balance;

	Bank(int accountId, AccountType at, String holderName, long balance, ArrayList<Bank> arr) throws IdAlreadyPresent{

		for(int i=0; i<arr.size() ; i++){
			if(arr.get(i).accountId == accountId){
				throw new IdAlreadyPresent("Given Id is already present, please provide another id");

			}
		}

		this.accountId = accountId;
		this.at = at;
		this.holderName = holderName;
		this.balance = balance;
	}

	void display(){
		System.out.println(this.holderName+" has a " + this.at + " account with account id: " + this.accountId + " with a balance of " + this.balance);
	}

	void credit(long creditAmount, String name){
		System.out.println(name + " deposited " + creditAmount);
        this.balance = this.balance + creditAmount;
        System.out.println("Balance after deposit by "+ name+ ": " + this.balance);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

	void debit(long debitAmount, String name) throws BalanceInsufficient{
		if (this.balance >= debitAmount) {
            System.out.println(name + " withdrawn " + debitAmount);
            this.balance = this.balance - debitAmount ;
 
            System.out.println("Balance after debited by "+ name+": " + this.balance);
            try {
 
                Thread.sleep(1000);
            }
 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
        else {
 
            System.out.println(name
                               + " you can not withdraw "
                               + debitAmount);
            System.out.println("your balance is: " + balance);

			throw new BalanceInsufficient("You have insufficient balance to make this withdraw...");
        }
	}


}

class Program1{
	public static void main(String[] args) {

		ArrayList<Bank> accounts = new ArrayList<Bank>();

		Scanner sc = new Scanner(System.in);


		
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

			System.out.println("\n ------------------------\nBefore deletion: ");

			//retrival
			for(int i=0; i<accounts.size(); i++){
				accounts.get(i).display();
			}

			int id; 

			System.out.println("Enter account id you want to delete:");
			id = sc.nextInt();

			int flag = 0;

			//deletion
			for(int i=0; i<accounts.size(); i++){
				if(accounts.get(i).accountId == id){
					accounts.remove(accounts.get(i));
					flag =1;
				}
			}

			if(flag != 1){
				throw new IdDoesNotExist("Given account id does not exist");
			}

			System.out.println("After deletion: ");

			for(int i=0; i<accounts.size(); i++){
				accounts.get(i).display();
			}
			
		}

		catch (IdAlreadyPresent ex){
			System.out.println("Exception occured: " + ex); 
		}

		catch (IdDoesNotExist ex){
			System.out.println("Exception occured: "+ex);
		}

		sc.close();

	}
}