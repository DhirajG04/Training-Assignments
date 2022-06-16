package Java_Assignment_1;

import java.util.*;

public class Que7 {
	

    public static void main(String[] args) {
    	
    	int [] list= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    	int i;
    	
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	
    	System.out.print("Enter number you want to search");
    		int num = sc.nextInt();
    		 boolean flag=false;
        
    		for(i = 0; i < list.length; i++){
    			
    			if(list[i] == num){
            	flag=true;
            	break;
    			}

    		}
    		if(flag) {
    			System.out.println("Number "+num+" found at "+ i +" position");
    			
    		}else{
            	System.out.println("Number not found");
            }
    		
    }
	
}