package Java_Assignment_10;

public class Que1 {

	public static void main(String[] args) {
		
		var amount=10000;
		var rate=5;
		var time=5;
		
		SimpleInterest si=(var a, var r,var t) -> (amount*rate*time)/100;
		
		System.out.println(si.interest(amount, rate, time));

	}

}

interface SimpleInterest{
	int interest(int a, int r, int t );
}