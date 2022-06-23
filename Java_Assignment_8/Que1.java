package Java_Assignment_8;

public class Que1 {

	public static void main(String[] args) {
		Add addition=(a,b) -> a+b;
		System.out.println(addition.add(2, 2));
		
		Sub subtraction=(a,b) -> a-b;
		System.out.println(subtraction.sub(2, 2));
		
		Multi multiply=(a,b) -> a*b;
		System.out.println(multiply.mul(2, 2));
		
		Div division=(a,b) -> a/b;
		System.out.println(division.div(2, 2));
		
		
	}

}

interface Add{
	int add(int a, int b);
}

interface Sub{
	int sub(int a, int b);
}

interface Multi{
	int mul(int a, int b);
}

interface Div{
	int div(int a, int b);
}


