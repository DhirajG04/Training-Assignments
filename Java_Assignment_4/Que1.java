package Java_Assignment_4;

import java.util.Scanner;
public class Que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter second number");
		int second=sc.nextInt();
		
		try {
			
			System.out.println(first/second);
			
		}catch(ArithmeticException e) {
			System.out.println(e+" not possible");
		}
	}
}
