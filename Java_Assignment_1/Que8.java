package Java_Assignment_1;


public class Que8 {
	

    public static void main(String[] args) {
    	
    	int [] list= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    	
    	 bubbleSort(list); //Applying Bubble sort to sort the Array  
    	    System.out.println("After Bubble Sort: ");
    	    for (int i = 0; i < list.length; i++) {
    	      System.out.print(list[i] + " ");
    	    }
    	
    	    		
    }
    
    static void bubbleSort(int[] list) {
        int n = list.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
          for (int j = 1; j < (n - i); j++) {
            if (list[j - 1] > list[j]) {
              
              temp = list[j - 1];
              list[j - 1] = list[j];
              list[j] = temp;
            }
          }
        }
      }
	
}