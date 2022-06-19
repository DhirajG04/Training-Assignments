package Java_Assignment_2;

public class Que4 {
	public static void main(String[] args) {
		Sample s1=new Sample();
		s1.test();
	}
}

 abstract class Demo{
	abstract void test();
}

 abstract class Demo2{
		
 }
 
class Sample extends Demo{
	@Override
	void test(){
		System.out.println("This is overrided method test");
	}
}

