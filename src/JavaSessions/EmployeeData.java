package JavaSessions;

import java.util.ArrayList;

public class EmployeeData {
	
	public String getCompName() {
		return "IBM";
	}
	
	public int getEmpCount() {
		return 1000;
	}
	
	public Object[] getCompInfo() {
		//return name and count
		Object comp[] = new Object[2];
		comp[0] = "IBM";
		comp[1] = 1000;
		
		return comp;
	}
	
	public ArrayList<String> getEmployeList() {
		System.out.println("get emp list...");
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Vivek");
		empList.add("Namita");
		empList.add("Sarath");

		return empList;
		
	}
	

	public static void main(String[] args) {
		
		EmployeeData obj = new EmployeeData();
		
		Object compData[] = obj.getCompInfo();
		for(Object e : compData) {
			System.out.println(e);
		}
		
		ArrayList<String> eList = obj.getEmployeList();
		System.out.println(eList.size());
		System.out.println(eList);
		

	}

}
