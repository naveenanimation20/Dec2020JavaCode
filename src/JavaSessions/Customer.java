package JavaSessions;

public class Customer {

	String name;
	String city;
	int custId;
	String orderId;
	boolean isActive;

	public Customer(String name, String city, int custId, boolean isActive) {
		this.name = name;
		this.city = city;
		this.custId = custId;
		this.isActive = isActive;
	}

	public Customer(String name, String city) {
		this.name = name;
		this.city = city;
	}
	

	public Customer(String name, int custId) {
		this.name = name;
		this.custId = custId;
	}

	public Customer(String name, String city, int custId, String orderId, boolean isActive) {
		this.name = name;
		this.city = city;
		this.custId = custId;
		this.orderId = orderId;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		Customer c1 = new Customer("Arun", 101);
		System.out.println(c1.name + " " + c1.custId + " " + c1.city + " " + c1.isActive + " " + c1.orderId);

		Customer c2 = new Customer("Tom", "London", 102, "111", true);
		System.out.println(c2.name + " " + c2.custId + " " + c2.city + " " + c2.isActive + " " + c2.orderId);

		
		
		
	}

}
