package JavaSessions;

public class Students {
	
	String name;
	int rollNumber;
	String standard;
	boolean isActive;
	String city;
	
	//const.... will help you to create the object on the basis of given template variables
	//const... can be overloaded with the same name and diff values
	//const... name will remain as same as the class name
	
	public Students() { //default const... 0 param
		System.out.println("default const...");
	}
	
	public Students(int a) { // 1 param const..
		System.out.println("one param " + a);
	}
	
	public Students(String a) { // 1 param const..
		System.out.println("one param " + a);
	}
	
	//methods vs const:
	//a method may or may not return a value but const.. will never return a value
	//method will be called by object bu const.. will be called when you create the object
	//method can have any name...but const... will be same as the class name
	
	public int getTesting() {
		return 10;
	}
	

	public static void main(String[] args) {

		Students obj = new Students("testing");
		Students obj1 = new Students();
		Students obj2 = new Students(100);

		
		
		
		
	}

}
