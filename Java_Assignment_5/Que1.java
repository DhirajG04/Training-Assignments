package Java_Assignment_5;

import java.util.HashSet;

public class Que1 {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.displayDetails();
	
	}

}

class Employee{
	private int id;
	private String name;
	private double salary;
	private String department;
	
	public Employee(int id, String name, double salary, String department) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id +  ", name=" + name + ", salary=" + salary + ", department=" + department + "]\n";
	}
	
	void displayDetails() {
		HashSet<Employee> emp = new HashSet<Employee>();
        emp.add(new Employee(111, "Devi",45000,"Animation"));
        emp.add(new Employee(222, "Ankush",34560,"Music"));
        emp.add(new Employee(333, "Vishal",132500,"IOT"));
        emp.add(new Employee(444, "Jadoo",23400,"Drama"));
        

        System.out.println(emp);
	}
	
}