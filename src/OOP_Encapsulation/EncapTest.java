package OOP_Encapsulation;

public class EncapTest {

	public static void main(String[] args) {

		EncapConcept obj = new EncapConcept();
		obj.name = "Peter";
		obj.id = 122;

		
		obj.setSalary(1000);
		
		int sal = obj.getSalary();
		System.out.println(sal);
		
	}

}
