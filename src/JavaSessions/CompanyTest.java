package JavaSessions;


public class CompanyTest {

	public static void main(String[] args) {

		Company comp = new Company("IBM", 1000);
		
		System.out.println(comp.name + " " + comp.empCount);
		
		String info = comp.getCompInfo();
		System.out.println(info);
		
		Company comp1 = new Company("Facbook", 10000, "FB", "Palo Alto", "Mark");
		
		System.out.println(comp1.name + " " + comp1.ceoName);
		
		//diff bw arguments and parameters?
		
	}

}
