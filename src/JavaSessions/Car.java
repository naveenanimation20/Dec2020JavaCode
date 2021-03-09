package JavaSessions;

public class Car {
	
	String name;
	String model;
	String color;
	int price;
	boolean isAvilable;
	boolean isAutomatic;
	
	

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.model = "520d";
		c1.price = 75;
		c1.isAvilable = true;
		c1.isAutomatic = true;
		c1.color = "Black";
		System.out.println(c1.name + " " + c1.model + " " + c1.price + " " + c1.color);
		
		
		
	}

}
