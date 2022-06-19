package Java_Assignment_2;

import java.util.Scanner;

public class Que6 {
	public static void main(String[] args) {
		FilePersistence fp=new FilePersistence();
		DatabasePersistence dp=new DatabasePersistence();
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose any one option");
		System.out.println("1 \n2");
		int choice=sc.nextInt();
		
		if(choice==1) {
			fp.persist();
		}else {
			dp.persist();
		}
		
		
	}
}

 abstract class Persistence{
	abstract void persist();
}

 class FilePersistence extends Persistence{
	 @Override
	 void persist(){
		 System.out.println("Saved");
	 }	
 }
 
 class DatabasePersistence extends Persistence{
	 @Override
	 void persist(){
		 System.out.println("Saved");
	 }	
 }


