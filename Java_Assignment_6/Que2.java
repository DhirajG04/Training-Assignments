package Java_Assignment_6;

import java.util.HashSet;

public class Que2 {

public static void main(String[] args) {
		
	HashSet <Product> hs=new HashSet <Product>(); 
		
		hs.add(new Product(11,"Pen"));
		hs.add(new Product(12,"Mouse"));
		hs.add(new Product(13,"Book"));
		hs.add(new Product(14,"Earbud"));
		hs.add(new Product(15,"Bottle"));
		hs.add(new Product(16,"Paper"));
		hs.add(new Product(17,"Tablet"));
		hs.add(new Product(18,"Pen-Drive"));
		hs.add(new Product(19,"Charger"));
		hs.add(new Product(20,"Laptop"));
		hs.add(new Product(20,"Laptop"));
		hs.add(new Product(16,"Paper"));
	
		
		for(Product p : hs) {
			System.out.println(p);
		}
		

//		System.out.println(hs);
		
 }

}

class Product{
	
	private int Id;
	private String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
	    //System.out.println("In hashcode");
	    return this.getId();
	}
 
	@Override
	public boolean equals(Object obj) {
		Product p = null;
	    if(obj instanceof Product){
	        p = (Product) obj;
	    }
	   // System.out.println("In equals");
	    if(this.getId() == p.getId()){
	        return true;
	    } else {
	        return false;
	    }
	 }   
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Id=" + Id + ", name=" + name;
	}
	
	
}