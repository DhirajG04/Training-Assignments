package Java_Assignment_6;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Que1 {

	public static void main(String[] args) {
		
		TreeMap <Long, Contact> tm=new TreeMap <Long, Contact>(Collections.reverseOrder());
		
		tm.put(9898989898l, new Contact("akshay","akshay@123","male"));
		tm.put(7878787878l, new Contact("vish","vish@123","male"));
		tm.put(8787878787l, new Contact("kuhu","kuhu@123","female"));
		tm.put(9494949494l, new Contact("raju","raju@123","male"));
		tm.put(8989898989l, new Contact("chutki","chutki@123","female"));
		
		Set<Map.Entry<Long, Contact>> input = tm.entrySet();

   
         for (Map.Entry<Long, Contact> entry : input) {
          System.out.println(entry.getKey());
          
	     }
         
         for (Map.Entry<Long, Contact> entry : input) {
             
             System.out.println();
             System.out.println(entry.getValue());
             
   	     }
         
         for (Map.Entry<Long, Contact> entry : input) {
            System.out.println();
            	System.out.println(entry.getKey()+" "+entry.getValue());
   	     }
	}
}

class Contact{
	
	
	private String name;
	private String email;
	private String gender;
	
	public Contact(String name, String email, String gender) {
		super();
		
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
}