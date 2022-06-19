package Java_Assignment_2;

import java.util.Scanner;

public class Que3 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose your account type");
		System.out.println("1:Saving \n 2:Current");
		int choice=sc.nextInt();
		
		System.out.println("Enter Amount");
		
		double amount=sc.nextDouble();
		//double salary=sc.nextDouble();
		
		if(choice == 1) {
			Saving s1=new Saving();
			s1.account(amount);
		}else if(choice==2) {
			Current c1=new Current();
			c1.account(amount);
		}else {
			System.out.println("No such account exist!!!");
		}
			
	}	

 }
 
class Bank{
	void account(double amount) {
		System.out.println("Final Amount : ");
	}
}
 
class Saving{	
	void account(double amount) {
		
		double fixedDeposit=amount;
		System.out.println("Fixed Deposit Amount : "+fixedDeposit);
	}
}

class Current{
	void account(double amount) {
		
		double cashCredit=amount;
		System.out.println("Final Amount : "+cashCredit);
	}
}