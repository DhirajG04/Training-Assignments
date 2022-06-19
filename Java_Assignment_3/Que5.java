package Java_Assignment_3;

public class Que5 {
	
	public static void main(String[] args) {
		//Builder 1
		StringBuilder sb=new StringBuilder("StringBuilder");
		sb.append("is a peer class of String");
		sb.append("that provides much of");
		sb.append("the functionality of strings");
		
		System.out.println(sb);
		
		//Builder 2
		StringBuilder sb2=new StringBuilder("It is used to at the specified index position");
		sb2.insert(13," insert text");
		
		System.out.println(sb2);
		
		
		//Builder 3
				StringBuilder sb3=new StringBuilder("This method returns the reversed object on which it was called");
				sb3.reverse();
				
				System.out.println(sb3);
	}

}
