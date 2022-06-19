package Java_Assignment_2;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
			
		Manager m1=new Manager();
		m1.income(salary);
		
		Labour l1=new Labour();
		l1.income(salary);
		
//		Employee e1=new Employee();
//		e1=new Manager();
//		e1=new Labour();
		//System.out.println("Total Salary of Employee : "+(e1.total+e2.total));
		
	}
	
}

 class Employee{
	 void income(double salary) {
		 
		 System.out.println("Total Salary of Employee : ");
			
	 }	
}
 
 class Manager extends Employee{
	@Override
	void income(double salary) {
		 double incentives=salary*0.75;
		 double total=salary+incentives;
		System.out.println("Manager Salary : "+total);
	 }	

 }
 
 class Labour extends Employee{
	 @Override
	 void income(double salary) {
		 double overtime=salary*0.05;
		 double total=salary+overtime;
		System.out.println("Labour Salary : "+total);
	 }	

 }
 
 