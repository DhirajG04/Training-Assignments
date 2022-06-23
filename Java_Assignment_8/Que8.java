package Java_Assignment_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Que8 {

	public static void main(String[] args) {
		

	List<Integer> list=new ArrayList<>();
		list.add(70);
		list.add(30);
		list.add(70);
		list.add(34);
		list.add(97);

		Consumer<Integer> con =(i)->System.out.println(i);
	
		for(Iterator iterator =list.iterator(); iterator.hasNext();) {
			Integer integer=(Integer) iterator.next();
			con.accept(integer);
		}
		
		Thread t=new Thread();
		t.run();


	}

}
