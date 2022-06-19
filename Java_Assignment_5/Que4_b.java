package Java_Assignment_5;

import java.util.Date;

public class Que4_b {

	public static void main(String[] args) {
		
		Pair2 pair=new Pair2();
		pair.setKey("Today");
		pair.setValue(new java.util.Date());
		 
		 System.out.println(pair.getKey()+" "+pair.getValue());

	}

}

class Pair2{
	 private String key;
	 private java.util.Date value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public java.util.Date getValue() {
		return value;
	}
	public void setValue(java.util.Date value) {
		this.value = value;
	}
	public Pair2(String key, Date value) {
		super();
		this.key = key;
		this.value = value;
	}
	public Pair2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	 
}