package Java_Assignment_5;

public class Que3 {

	public static void main(String[] args) {
		
		   int [] array= {11,22,33,44};
		   

		   System.out.println("Initial Array: ");
		   
		   for(int i=0;i<array.length;i++) {   
			   
			   System.out.println(array[i]);
		   }
		   
		   swap(array,0,2);
		   
		   System.out.println("Final Array: ");
		   
		   for(int i=0;i<array.length;i++) { 
			   
			   System.out.println(array[i]);
		   }
	}
	
	public static <T> void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
