package Java_Assignment_4;

import java.util.Scanner;

public class Que3 {

	static long id=12345;
	static double balance=10000;
	static double amount;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your login id");
		long user=sc.nextLong();

		if(user==id) {
				System.out.println("Enter Amount to Withdraw");
				amount=sc.nextInt();
					 
					if(amount>0 && amount<balance) 
					{
						 System.out.println("Account is debited by : "+amount);
						 
						 double updatedBalance=balance-amount;
						 System.out.println("Updated Balance : "+updatedBalance);
					 }
					else if(amount>balance || balance==0)
					{
						
						
						 System.out.println("bhai");
						/* try
						 {
								 throw new InsufficientBalanceException("InsufficientBalanceException : Low Balance");
								 
							}
						 catch(InsufficientBalanceException e1)
						 {
								
							 System.out.println(e1.getMessage());
						    }*/
						 
					 }
					else if(amount<0){
						 try
						 {
								 throw new IllegalBankTransactionException("IllegalBankTransactionException : Transaction not allowed");
								 
							}
						 catch(IllegalBankTransactionException e2) 
						 {
								
							 System.out.println(e2.getMessage());
						    }
					 }	 
		 }else{
			System.out.println("Incorrect login id!!!");
		}	
	}
}

class InsufficientBalanceException extends Exception {

	

	public InsufficientBalanceException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}

class IllegalBankTransactionException extends Exception {


	public IllegalBankTransactionException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}





