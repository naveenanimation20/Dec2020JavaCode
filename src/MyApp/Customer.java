package MyApp;

import Super.Employee;

public class Customer {

	public static void main(String[] args) {

		Registeration reg = new Registeration("Tom", "Peter", "tom@gmail.com", "99999", "SFO, CA");
		
		Registeration.registerUser(reg);
		
		Registeration reg1 = new Registeration("shivender", "singh", "test@gmail.com");
		
		Registeration.registerUser(reg1);
		
		
		System.out.println(reg1.getAddress());
		reg1.setAddress("Kanpur, India");
		System.out.println(reg1.getAddress());
		
		Registeration.registerUser(reg1);
		
		


		
	}

}
