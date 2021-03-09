package OOP_Encapsulation;

public class EncapConcept {
	
	public String name;
	private int salary;
	private int age;
	public int id;
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public static void main(String[] args) {
		
		EncapConcept obj = new EncapConcept();
		obj.name = "Tom";
		obj.salary = 100;
		obj.age = 25;
		obj.id = 10;
		
		System.out.println(obj.name);
		System.out.println(obj.salary);
		
		

	}

}
