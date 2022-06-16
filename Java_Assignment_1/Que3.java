package Java_Assignment_1;

import java.util.*;

public class Que3 {
	
	public static void main(String [] args) {
		
		double amount,rate,period;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		amount=sc.nextDouble();
		System.out.println("Enter Rate of Interest");
		rate=sc.nextDouble();
		System.out.println("Enter Period");
		period=sc.nextDouble();
		
		simpleInt(amount,rate,period);
		compoundInt(amount,rate,period);
		
		
	}
	 
	static void simpleInt(double amount,double rate, double period) {
		double simpleInt=(amount*rate*period)/100;
		
		System.out.println("Simple Interest : "+simpleInt);
	}
	
	static void compoundInt(double amount,double rate, double period) {
		double compoundInt = amount*Math.pow(1+(rate/100),period)-amount;
		
		System.out.println("Compound Interest : "+compoundInt);
		
	}

}
