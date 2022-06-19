package Java_Assignment_3;

public class Que4 {
	
	public static void main(String[] args) {
		//buffer 1
		StringBuffer sb=new StringBuffer("StringBuffer");
		sb.append("is a peer class of String");
		sb.append("that provides much of");
		sb.append("the functionality of strings");
		
		System.out.println(sb);
		
		//buffer 2
		StringBuffer sb2=new StringBuffer("It is used to at the specified index position");
		sb2.insert(13," insert text");
		
		System.out.println(sb2);
		
		
		//buffer 3
				StringBuffer sb3=new StringBuffer("This method returns the reversed object on which it was called");
				sb3.reverse();
				
				System.out.println(sb3);
	}

}
