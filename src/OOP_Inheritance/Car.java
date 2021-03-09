package OOP_Inheritance;

public class Car extends Vehicle{

	public void start() {
		System.out.println("car --- start");
	}
	
	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}
	
	public int test(int i, String p) {
		System.out.println("value: " + i);
		return 300;
	}
	
	private void testing() {
		System.out.println("CAr -- testing");
	}
	
	public static void launch() {
		System.out.println("car -- launch");
	}
	

}
