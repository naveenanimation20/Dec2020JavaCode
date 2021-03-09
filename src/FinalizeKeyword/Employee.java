package FinalizeKeyword;

public class Employee {

	@Override
	public void finalize() {
		System.out.println("this is emp class finalize method...");
	}

	public static void main(String[] args) {

		System.out.println("Emp class....");

		Person p = new Person();
		p = null;

		Employee e = new Employee();
		e = null;
		
		System.gc();

		System.out.println("Emp class is done.....");

	}

}
