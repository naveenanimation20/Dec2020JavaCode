package JavaSessions;

public class Student {

	// WAF - pass the student name (String) and it will return student marks(int)

	public int getStudentMarks(String studentName) {

		System.out.println("student name is : " + studentName);

		if (studentName.equals("Dhivya")) {
			return 90;
		}
		else if (studentName.equals("Harinder")) {
			return 95;
		}
		else if (studentName.equals("Naveen")) {
			return 10;
		}
		else {
			System.out.println("Student name is not found....404 error....");
			return -1;
		}
		
	}
	
	public int getStMarks(String studentName) {
		System.out.println("student name is : " + studentName);
		int marks = -1;

		if (studentName.equals("Dhivya")) {
			marks = 90;
		}
		else if (studentName.equals("Harinder")) {
			marks = 95;
		}
		else if (studentName.equals("Naveen")) {
			marks = 10;
		}
		else {
			System.out.println("Student name is not found....404 error....");
		}
		
		return marks;
	}
	

	public static void main(String[] args) {
		Student st = new Student();
		int m1 = st.getStudentMarks("Dhivya");
		System.out.println(m1);
//		
//		int m2 = st.getStudentMarks("Tom");
//		System.out.println(m2);
		
		int m3 = st.getStMarks("Tom");
		System.out.println(m3);
	}

}
