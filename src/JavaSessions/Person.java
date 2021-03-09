package JavaSessions;

public class Person {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Suman";
		p1.age = 25;
		p1.city = "Pune";
		
		Person p2 = new Person();
		p2.name = "Harinder";
		p2.age = 27;
		p2.city = "London";
		
		Person p3 = new Person();
		p3.name = "Nidhi";
		p3.age = 28;
		p3.city = "NY";
		
		System.out.println(p1.name + " " + p1.age + " " + p1.city);
		System.out.println(p2.name + " " + p2.age + " " + p2.city);
		System.out.println(p3.name + " " + p3.age + " " + p3.city);

		p1 = p2;
		
		System.out.println(p1.name + " " + p1.age + " " + p1.city);
		System.out.println(p2.name + " " + p2.age + " " + p2.city);
		System.out.println(p3.name + " " + p3.age + " " + p3.city);
		
		p2 = p3;
		
		System.out.println(p1.name + " " + p1.age + " " + p1.city);
		System.out.println(p2.name + " " + p2.age + " " + p2.city);
		System.out.println(p3.name + " " + p3.age + " " + p3.city);
		
		p3 = p1;
		
		System.out.println(p1.name + " " + p1.age + " " + p1.city);
		System.out.println(p2.name + " " + p2.age + " " + p2.city);
		System.out.println(p3.name + " " + p3.age + " " + p3.city);
		
	}

}
