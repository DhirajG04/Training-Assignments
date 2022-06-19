package Java_Assignment_3;


public class Que3 {

	public static void main(String args[]){  
		
		String str="Java String pool refers to collection of Strings which are stored in heap memory";  
		
//		//sub question a
//		str=str.toLowerCase();
//		System.out.println(str);
//		
//		//sub question b
//		str=str.toUpperCase();
//		System.out.println(str);
//		
//		//sub question c
//		str=str.replace('A', '$');
//		System.out.println(str);
//		
//		
//		//sub question d
//		String word="collection";
//		boolean result=str.contains(word);
//		System.out.println(result);
		
		//sub question e and f
		String str2="Java String pool refers to collection of Strings which are stored in heap memory";  
		//f.1
		boolean result1=str2.equalsIgnoreCase(str);
		System.out.println(result1);
		//f.2
		boolean result2=str2.equalsIgnoreCase(str);
		System.out.println(result2);
		//f.3
		System.out.println(str==str2);
		//f.4
		System.out.println(str.compareTo(str2));//0 mean true, +ve if str>str2, -ve for str<str2 
	}
}