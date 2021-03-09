package JavaSessions;

public class Employee {
	
	String name;
	int age;
	int empId;
	double salary;
	

	public static void main(String[] args) {

		//object of the class: new keyword
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		e1.empId = 101;
		e1.salary = 34.55;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.empId + " " + e1.salary);
		
		Employee e2 = new Employee();
		e2.name = "Peter";
		e2.age = 30;
		
		System.out.println(e2.name + " " + e2.age + " " + e2.empId + " " + e2.salary);

		Employee e3 = new Employee();
		System.out.println(e3.name + " " + e3.age + " " + e3.empId + " " + e3.salary);

	
	
	
	
	
	}

}
