package JavaSessions;

import java.util.ArrayList;

public class Users {
	
	String name;
	int id;
	String deviceList[];
	ArrayList<String> orderHistoryList;
	
	
	public static void main(String[] args) {

		Users u1 = new Users();
		u1.name = "Naveen";
		u1.id = 1001;
		u1.deviceList = new String[3];
		u1.deviceList[0] = "Apple iPhone 12";
		u1.deviceList[1] = "Apple iPhone X";
		u1.deviceList[2] = "Samsung 10";

		u1.orderHistoryList = new ArrayList<String>();
		u1.orderHistoryList.add("Nike Shoes 2020");
		u1.orderHistoryList.add("Monitor 2019");
		u1.orderHistoryList.add("Tshirt 2020 Dec");
		
		
		System.out.println(u1.name + " " + u1.id);
		//System.out.println(u1.deviceList[0]);
		
		for(String e : u1.deviceList) {
			System.out.println(e);
		}
		
		for(String e : u1.orderHistoryList) {
			System.out.println(e);
		}
		
	}
	
	

}
