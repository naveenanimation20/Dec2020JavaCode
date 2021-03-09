package SuperKeyword;

public class BMW extends Car{
	
	String name;
	int price;
	
	public BMW() {
		super();//should be the first statement
		System.out.println("BMW -- default const....");
	}
	
	public BMW(String name, int price) {
		super(name, price);
		this.name = name;
		this.price = price;
	}
	
	
	
	
	

}
