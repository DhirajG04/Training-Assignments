package Java_Assignment_1;
import java.util.*;

public class Que9 {
	

    public static void main(String[] args) {
    	
    	System.out.println("Enter no of students");
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	System.out.println("Enter no of subjects");
		int m=sc.nextInt();
	
		int [][] list= new int[n][m];
		
    			
    	for(int i=0;i<n;i++) {
    		System.out.println("Enter "+m+" subject marks with space");
    		for(int j=0;j<m;j++) {
    			
       		 list[i][j]=sc.nextInt();
       		 
    		}	
    	}
    	
    	for(int i=0;i<n;i++) {
    		int total=0;
			int avg=0;
    		System.out.println("For student : "+(i+1));
    		for(int j=0;j<m;j++) {
    			
    			total=total+list[i][j];
    			
    			avg=total/m;    			
    		}

    		System.out.println("Total marks : "+total);
    		System.out.println("Average mark : "+avg);
    		
    	}

    	    		
    }
    
}