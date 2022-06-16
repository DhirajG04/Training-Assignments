package Java_Assignment_1;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) 
    {
   	int first,last;
   	
   	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
   	
   		System.out.println("Enter first number");
   		first=sc.nextInt();
   		
   		System.out.println("Enter last number");
   		last=sc.nextInt();
   		
   		for(int i=first;i<=last;i++) {
   			int num=i;
   			int number=0;
   			
   			while(num>0) {
   				
   				int a=num%10;
   				number=number+(a*a*a);
   				num=num/10;
   			}
   			
   			if(number==i) {
   	
   				System.out.println(number);
   			}
   		}


   }

}
