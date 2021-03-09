package JavaSessions;

import java.util.ArrayList;

public class Teacher {
	
	//WAF: it will take college name (String) and return the faculty list (ArrayList<String>)
	
	public ArrayList<String> getCollegeFacultyList(String collegeName) {
		
		System.out.println("college name is: " + collegeName);
		ArrayList<String> facultyList = new ArrayList<String>();
		
		switch (collegeName) {
		case "IIMB":
			facultyList.add("Tom");
			facultyList.add("Steve");
			facultyList.add("Peter");
			break;
			
		case "SRM":
			facultyList.add("Sujan");
			facultyList.add("Nidhi");
			facultyList.add("Sunil");
			break;
			
		case "IITD":
			facultyList.add("Lisa");
			facultyList.add("Abhishek");
			facultyList.add("Divya");
			break;

		default:
			System.out.println("College name is not found...");
			break;
		}
		return facultyList;
		
	}
	
	

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		ArrayList<String> SRMList = t1.getCollegeFacultyList("SRM");
		System.out.println(SRMList);
		
		ArrayList<String> someList = t1.getCollegeFacultyList("NSIT");
		System.out.println(someList);

	}

}
