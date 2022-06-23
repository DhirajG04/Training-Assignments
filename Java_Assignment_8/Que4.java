package Java_Assignment_8;

import java.util.ArrayList;
import java.util.List;

public class Que4 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
				list.add("Accepted");
				list.add("king");
				list.add("hurryyyyyeeeee");
				list.add("billo");
			
		
		list.removeIf(l-> (l.length()%2!=0));
		
		for(String s :list) {
			System.out.println(s);
		}
	}

}
