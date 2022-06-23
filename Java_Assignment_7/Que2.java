package Java_Assignment_7;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Que2 {

	public static void main(String[] args) {

		Project p=new Project();
		Class c=p.getClass();
		Annotation an=c.getAnnotation(Info.class);
		Info i=(Info) an;
		
		System.out.println(i.authorID());
		System.out.println(i.authorName());
		System.out.println(i.supervisor());
		System.out.println(i.date());
		System.out.println(i.time());
		System.out.println(i.version());
		System.out.println(i.description());
		
	}

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	String authorID() default "Dhiraj@4496";
	String authorName() default "Dhiraj Gaikwad";
	String supervisor() default "Tera Baap";
	String date() default "03/03/2020";
	String time() default "19:21:33";
	String version() default "v1.4";
	String description() default "This project and class and methods are created belongs to dhiraj";
}

@Info
class Project{
	
}