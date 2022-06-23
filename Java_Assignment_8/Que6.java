package Java_Assignment_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Que6 {

	public static void main(String[] args) {
	
		List<String> list=new ArrayList<>();
		list.add("accepted");
		list.add("king");
		list.add("hurryyyyyeeeee");
		list.add("billo");
	
		System.out.println(list);
		System.out.println();
		
		list.replaceAll(new MyOperator());
		
		System.out.println(list);

	}

}

class MyOperator implements UnaryOperator<String>{

	@Override
	public String apply(String t) {

		return t.toUpperCase();
	}
	
}


