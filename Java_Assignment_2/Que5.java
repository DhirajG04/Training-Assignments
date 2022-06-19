package Java_Assignment_2;

public class Que5 {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.draw();
		Cube c1=new Cube();
		c1.draw();
		Line l1=new Line();
		l1.draw();
	}
}

 abstract class Shape{
	abstract void draw();
}

 class Rectangle extends Shape{
	 @Override
	 void draw(){
		 System.out.println("Draw Rectangle");
	 }	
 }
 
 class Cube extends Shape{
	 @Override
	 void draw(){
		 System.out.println("Draw Cube");
	 }	
 }
 
 
class Line extends Shape{
	@Override
	void draw(){
		System.out.println("Draw Line");
	}
}

