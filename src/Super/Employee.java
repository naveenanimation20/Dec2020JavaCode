package Super;

public class Employee {
	
	public String name;
	protected int age;
	String empId;
	private double salary;
	
	public void m1() {
		System.out.println("m1");
	}
	
	private void m2() {
		System.out.println("m2 method");
	}
	
	protected void m3() {
		System.out.println("m3 method");
	}
	
	void m4() {
		System.out.println("m4 method");
	}
	

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "tom";
		e.salary = 12.33;
		e.age = 25;
		e.empId = "test123";
		
		e.m2();
		
		
	}

}
