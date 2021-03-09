package SuperKeyword;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		
		BMW b1 = new BMW("BMW 520d", 80);
		
		System.out.println(b1.name + " : " + b1.price);
		
		Car c = new Car();
		System.out.println(c.name + ": " + c.price);
		
		
	}

}
