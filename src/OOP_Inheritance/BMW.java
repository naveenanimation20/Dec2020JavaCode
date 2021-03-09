package OOP_Inheritance;

public class BMW extends Car {

	//method overriding: 
	//when we have a method in parent class and the same method in child class
	//with same name
	//with same number of parameters
	
	@Override
	public void start() {
		System.out.println("BMW --- start");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	@Override
	public int test(int i, String p) {
		System.out.println("value: " + i);
		return 500;
	}
	
	private void testing() {
		System.out.println("CAr -- testing");
	}
	
	public static void launch() {
		System.out.println("car -- launch");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}


}
