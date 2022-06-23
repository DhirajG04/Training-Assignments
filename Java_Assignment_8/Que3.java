package Java_Assignment_8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que3 {

	public static void main(String[] args) {
		
	//Supplier
		
		String str="Dhiraj";
		
        Supplier<String> s1 = () -> str.toUpperCase();
       
        System.out.println(s1.get());
        
        
     // Consumer 
        Consumer<Integer> show = a -> System.out.println(a);
 
        show.accept(10);

        
     //Predicate
        Predicate<Integer> number = i -> (i < 18); 
        
        // Calling Predicate method
        System.out.println(number.test(100)); 
        
        
     //Function
        Function<Integer, Double> oneFourth = a -> a / 2.0;
 
        oneFourth = oneFourth.andThen(a -> 3.5 * a);

        System.out.println(oneFourth.apply(14));
	
	}
}




