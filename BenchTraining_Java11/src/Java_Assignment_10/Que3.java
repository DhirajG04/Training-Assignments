package Java_Assignment_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Que3 {

	public static void main(String[] args) {
		
		String str="A quick brown fox jumps over a lazy dog";
		
		String[] newStr=str.split(" ");
		
		ArrayList<String> list=new ArrayList<>(Arrays.asList(newStr));
		
		String[] array=list.toArray(String[]::new);
		
		System.out.println(Arrays.toString(array));

	}

}
