package Java_Assignment_9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Streams {

	public static void main(String[] args) {
		
	//// Class Fruit
		
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("apple",80,200,"red"));
        fruitList.add(new Fruit("banana",110,50,"yellow"));
        fruitList.add(new Fruit("papaya",90,90,"orange"));
        fruitList.add(new Fruit("mango",180,120,"red"));
        fruitList.add(new Fruit("grapes",70,30,"green"));
        
        //que1
        		List<Fruit> listOfFruit=fruitList.stream()
        				.filter(f -> f.calories<100)
        				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
        				.collect(Collectors.toList());
        
        		System.out.println(listOfFruit);
        
        //que2
        		List<Fruit> listOfFruit1=fruitList.stream()
                .sorted(Comparator.comparing(Fruit::getColour))
                .collect(Collectors.toList());
                
                System.out.println(listOfFruit1);
                
        //que3
                List<Fruit> listOfFruit2=fruitList.stream()
                        .filter(f -> f.colour=="red")
                        .sorted(Comparator.comparing(Fruit::getPrice))
                        .collect(Collectors.toList());
                        
                        System.out.println(listOfFruit2);
                        System.out.println(" ");
                        
     ///// CLass news
        List<News> newsList = new ArrayList<>();
        newsList.add(new News(1,"AK","BK","good"));
        newsList.add(new News(2,"CK","DK","nice budget"));
        newsList.add(new News(3,"EK","FK","very nice"));
        newsList.add(new News(4,"GK","HK","very good"));
        newsList.add(new News(5,"IK","JK","bad"));
        
        //que5
        	long listOfNews=newsList.stream()
        			.filter(f -> f.comment.contains("budget"))
        			.count();
        		 
        	System.out.println(listOfNews);
        
     ///// CLass Trader
        List<Trader> traderList = new ArrayList<>();
        traderList.add(new Trader("Avi","Pune"));
        traderList.add(new Trader("Ravi","Mumbai"));
        traderList.add(new Trader("Kavi","Pune"));
        traderList.add(new Trader("Savi","Indore"));
        
        //que9
        List<Trader> listOfTrader=traderList.stream()
        		.distinct()
        		.collect(Collectors.toList());
        
        System.out.println(listOfTrader);

        
        //que 10
        List<Trader> listOfTrader1=traderList.stream()
        		.filter(t -> t.city=="Pune")
        		.sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        
        System.out.println(listOfTrader1);
        
      //que 11
        String listOfTrader2=traderList.stream()
        		.sorted(Comparator.comparing(Trader::getName))
        		.map(l -> l.toString())
                .collect(Collectors.joining("**"));
        
        System.out.println(listOfTrader2);
        
        
     
      //que 12
        List<Trader> listOfTrader3=traderList.stream()
        		.filter(t -> t.city=="Indore")
        		.sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        
        System.out.println(listOfTrader3);
        System.out.println(" ");
        
        
      
    ///// CLass Transaction
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction(new Trader("Avi","Pune"),2012,10000));
        transactionList.add(new Transaction(new Trader("Ravi","Mumbai"),2011,1000));
        transactionList.add(new Transaction(new Trader("Kavi","Pune"),2011,18000));
        transactionList.add(new Transaction(new Trader("Savi","Delhi"),2020,70000));
        
      //que 8
        List<Transaction> listOfTransaction=transactionList.stream()
        		.filter(t -> t.year==2011)
        		.sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        
        System.out.println(listOfTransaction);
        
      //que 14
        int max = transactionList.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .get()
                .getValue();

        List<Transaction> listOfTransaction1 = transactionList
                .stream()
                .filter(m -> m.getValue() == max)
                .collect(Collectors.toList());
        
        System.out.println(listOfTransaction1);

	
      //que 15
        int min = transactionList.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .get()
                .getValue();

        List<Transaction> listOfTransaction2 = transactionList
                .stream()
                .filter(m -> m.getValue() == min)
                .collect(Collectors.toList());
        
        System.out.println(listOfTransaction2);
   
      //que 13
        List<Transaction> listOfTransaction3=transactionList.stream()
        		.filter(t -> t.trader.city=="Delhi")
        		.collect(Collectors.toList());
        
        System.out.println(listOfTransaction3);
        
	}
}
 
class Fruit{
	String name;
	int calories;
	int price;
	String colour;
	
	
	public Fruit(String name, int calories, int price, String colour) {

		this.name = name;
		this.calories = calories;
		this.price = price;
		this.colour = colour;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCalories() {
		return calories;
	}



	public void setCalories(int calories) {
		this.calories = calories;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", colour=" + colour + "]";
	}
	
	
}

class News{
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	
	
	
	public int getNewsId() {
		return newsId;
	}



	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}



	public String getPostedByUser() {
		return postedByUser;
	}



	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}



	public String getCommentByUser() {
		return commentByUser;
	}



	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
	
}


class Trader{
	String name;
	String city;
	
	
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
		
}


class Transaction{
	Trader trader;
	int year;
	int value;
	
	
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	
	
	public Trader getTrader() {
		return trader;
	}



	public void setTrader(Trader trader) {
		this.trader = trader;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	
}










