package Java_Assignment_5;

public class Que4_a {

	public static void main(String[] args) {
		
		Pair p=new Pair();
		 p.setKey("1");
		 p.setValue("Hello");
		 
		 System.out.println(p.getKey()+" "+p.getValue());

	}

}

class Pair{
	 private String key;
	 private String value;
	
	 public Pair(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public Pair() {
		// TODO Auto-generated constructor stub
	}

	public String getKey() {
		return key;
	}

	public String setKey(String key) {
		return this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	 
	 
}