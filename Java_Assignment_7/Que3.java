package Java_Assignment_7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Que3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		MyClass mc=new MyClass();
		
		Method m1=mc.getClass().getMethod("myMethod1");
		Method m2=mc.getClass().getMethod("myMethod2");
		Method m3=mc.getClass().getMethod("myMethod3");
		
		Execute e1=m1.getAnnotation(Execute.class);
		Execute e2=m2.getAnnotation(Execute.class);
		Execute e3=m3.getAnnotation(Execute.class);
		
	
		System.out.println(e1.sequence());
		System.out.println(e2.sequence());
		System.out.println(e3.sequence());
	}

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int sequence();
}


class MyClass{
	
	@Execute(sequence=2)
	public void myMethod1() {
	
	}
	
	@Execute(sequence=1)
	public void myMethod2() {
		
	}

	@Execute(sequence=3)
	public void myMethod3() {
		
	}
	
}