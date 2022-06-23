package Java_Assignment_6;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;

public class Que4 {

	public static void main(String[] args) {


	        LinkedList<LocalDate> list = new LinkedList<LocalDate>();

            list.add(LocalDate.of(2200,Month.MARCH,23));
            list.add(LocalDate.of(2104,Month.FEBRUARY,29));
            list.add(LocalDate.of(2901,Month.JANUARY,10));
            list.add(LocalDate.of(2040,Month.JULY,8));
            list.add(LocalDate.of(2603,Month.AUGUST,12));
	        
	        
	        
	        for (LocalDate i : list) {
	   
	            
	            if(i.isLeapYear())
                {
                    System.out.println("Your date of birth is "+i+" and it is  leap year");
                }
                else
                {
                    System.out.println("Your date of birth is "+i+" and it is not leap year");
                }
            
	        }
	        
	}
}

