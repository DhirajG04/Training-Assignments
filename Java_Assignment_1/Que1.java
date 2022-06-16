package Java_Assignment_1;
import java.util.*;


public class Que1 {

    public static void main(String[] args) 
     {
    	int num;
    	System.out.println("Enter any number");
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	num=sc.nextInt();

    	int sum=0;
    	int number=num;
    	
    	while(num>0) 
    	{
    		int a=num%10;
    		sum= sum + (a*a*a);
    		num=num/10;
    	}
    	
    	if(number==sum)
    		System.out.println("Its Armstrong");
    	else
    		System.out.println("Its not Armstrong");
    }
}

