package Java_Assignment_7;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


public class Que1 {


	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	
		Document d=new Document();
		
//		Class c=d.getClass();
//		
//		Test an=(Test) c.getAnnotation(Test.class);
//		
//		System.out.println(an.type());
		
		Method m1=d.getClass().getMethod("show");
		Test t=m1.getAnnotation(Test.class);
		
	
		System.out.println(t.type());
		
	}

}

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String type() default "test-case"; 
}


class Document{
	@Test
	public void show() {
		
	}
	
}