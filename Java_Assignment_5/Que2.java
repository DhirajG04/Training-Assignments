package Java_Assignment_5;

import java.util.HashMap;
import java.util.Map;

public class Que2 {

	public static void main(String[] args) {
		
		 HashMap<Integer,Double> map=new HashMap<Integer,Double>();  
		   map.put(1,100.10);
		   map.put(2,200.20);
		   map.put(3,300.30);
		   map.put(4,400.40);
		   map.put(5,500.50);
		   map.put(6,600.60);
		   map.put(7,700.70);
		   map.put(8,800.80);
		   map.put(9,900.90);
		   map.put(10,1000.00);
		   
		        
		  for(Map.Entry m : map.entrySet()){ 
			  
		    System.out.println(m.getKey()+" "+m.getValue());    
		   
		  }  
	}

}
