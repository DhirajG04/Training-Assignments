package Java_Assignment_3;

import java.util.Scanner;
public class Que2 {

	public static void main(String args[]){  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.next();  
		
		System.out.println("Enter second string");
		String s2=sc.next();  
		
		String s=s1.concat(s2);
		
		System.out.println(s);
	}
}