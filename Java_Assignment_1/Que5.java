package Java_Assignment_1;

import java.util.*;

public class Que5 {
	
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Income");
		double income=sc.nextDouble();
			
		if(income<=180000 && income>0) {
			System.out.println("Nil");
		}else if(income>180000 && income<=300000) {
			double tax=income*0.1;
			System.out.println("Your Income Tax : "+tax);
		}else if(income>300000 && income<=500000) {
			double tax=income*0.2;
			System.out.println("Your Income Tax : "+tax);
		}else if(income>500000 && income<=1000000) {
			double tax=income*0.3;
			System.out.println("Your Income Tax : "+tax);
		}
		
	}
	
}