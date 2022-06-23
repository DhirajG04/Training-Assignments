package Java_Assignment_8;

import java.util.HashMap;
import java.util.Map.Entry;

public class Que7 {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(10,"ball");
		hm.put(20,"doll");
		hm.put(30,"mall");
		
		for(Entry<Integer, String> str : hm.entrySet()) {
			
			sb.append(str);
		}
		
		System.out.println(sb);
		

	}

}
