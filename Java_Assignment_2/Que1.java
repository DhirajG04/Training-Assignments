package Java_Assignment_2;


class Singleton {
    
    private static Singleton onlyObj = null;
 
    public String str;
 
    private Singleton()
    {
        str = "Am from Singleton class";
    }
 
    public static Singleton getInstance()
    {
        if (onlyObj == null)
            onlyObj = new Singleton();
 
        return onlyObj;
    }
}

public class Que1 {
	
    public static void main(String args[])
    {
        Singleton firstVar = Singleton.getInstance();
       
        Singleton secondVar = Singleton.getInstance();
       
 
        System.out.println("Hashcode of firstVar is "+ firstVar.hashCode());
        System.out.println("Hashcode of secondVar is "+ secondVar.hashCode());
        
 
        if (firstVar == secondVar) {
 
            System.out.println("Both sharing same object");
        }
 
        else {
            // Print statement
            System.out.println("Both using different object");
        }
    }

}


 

