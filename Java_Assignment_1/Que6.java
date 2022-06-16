package Java_Assignment_1;
import java.util.*;

public class Que6 {
	

    public static void main(String[] args) {
    	
    	String username="pushpa";
    	String password="12345";
    	int count=0;
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	
    	do{
    		System.out.println("Enter Username");
    		String name=sc.next();
    	
    		System.out.println("Enter Password");
    		String pass=sc.next();
    	
    		if(name.equals(username) && pass.equals(password)) {
    		System.out.println("Welcome "+name);
    		break;
    		}
    		
    		if((!name.equals(username)) || (!pass.equals(password))) {
    		System.out.println("Incorrect login credentials");
    		count++;
    		}
    	
    		
    	}while(count<3);
    		if(count==3){
    			System.out.println("Contact Admin");
    		}
    		
    	   	    		
    }
    
}