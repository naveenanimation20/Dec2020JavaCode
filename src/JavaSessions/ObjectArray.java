package JavaSessions;

public class ObjectArray {

	public static void main(String[] args) {
		

		Object emp[] = new Object[5];
		
		emp[0] = "Anjum";
		emp[1] = 25;
		emp[2] = 70.12;
		emp[3] = 'F';
		emp[4] = true;
		
		System.out.println(emp[0]);
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
		}
		
		System.out.println("-------");
		
		for(Object e : emp) {
			System.out.println(e);
		}
		
		
		//
		int marks[] = new int[10];
		marks[0] = 100;
		marks[1] = 200;
		
		System.out.println(marks[0]);
		System.out.println(marks[2]);
		
		

		
		
	}

}
