package JavaSessions;

public class StaticKeyword {
	
	String name;
	static int age;
	
	public void test(){
		System.out.println("test method");
	}
	
	public static void getMail() {
		System.out.println("get mail method");
	}
	
	public static void main(String []a) {

		//1. how to call static vars and methods:
		//a. no need to create the object for static stuff:
		age = 25;
		getMail();
		
		//b. you can access static vars/methods by using the class name:
		StaticKeyword.age = 40;
		System.out.println(StaticKeyword.age);
		StaticKeyword.getMail();

		//how to access/call non static stuff:
		//have to create the object
		StaticKeyword obj = new StaticKeyword();
		obj.name = "Tom";
		obj.test();
		
		obj.age = 35;
		obj.getMail();
		
		
	}

}
