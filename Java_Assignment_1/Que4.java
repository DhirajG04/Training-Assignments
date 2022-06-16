package Java_Assignment_1;

import java.util.*;

public class Que4 {
	
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter subject 1 marks");
		int s1=sc.nextInt();
		
		System.out.println("Enter subject 2 marks");
		int s2=sc.nextInt();
		
		System.out.println("Enter subject 3 marks");
		int s3=sc.nextInt();
		
		
		if(s1>60 && s2>60 && s3>60) {
			System.out.println("Passed");
		}else if((s1>60 && s2>60) || (s2>60 && s3>60) || (s1>60 && s3>60)) {
			System.out.println("Promoted");
		}else if((s1>60 && s2<60 && s3<60) || (s2>60 && s3<60 && s1<60) || (s3>60 && s1<60 && s2<60)) {
			System.out.println("Failed");
		}
		
		
	}
	
}