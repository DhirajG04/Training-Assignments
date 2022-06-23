package Java_Assignment_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Que5 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		
		Consumer<String> con=(s)->{
				sb.append(s.charAt(0));
				};

		List<String> list=new ArrayList<>();
			list.add("Accepted");
			list.add("king");
			list.add("hurryyyyyeeeee");
			list.add("billo");
		
		for(Iterator iterator =list.iterator(); iterator.hasNext();) {
			String str=(String) iterator.next();
			con.accept(str);
		}
		
		System.out.println(sb);
		
		
	}

}
