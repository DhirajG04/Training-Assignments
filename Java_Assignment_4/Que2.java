package Java_Assignment_4;

import java.util.Scanner;
public class Que2{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter second number");
		int second=sc.nextInt();
		
		try {
			
				if(second==0) {
				throw new UnsupportedOperationException("UnsupportedOperationException : Invalid operation");
				}
				
				System.out.println(first/second);
				
		}catch(UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
	}
}
