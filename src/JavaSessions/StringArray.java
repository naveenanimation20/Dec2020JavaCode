package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class StringArray {

	public static void main(String[] args) {

		String names[] = new String[4]; 
		names[0]= "Scahin"; 
		names[1]= "Kohli"; 
		names[2]= "Dhoni"; 
		names[3]= "Hardik"; 
		
		for(String e : names) {
			System.out.println(e);
		}
		//
		for(int i=0; i<names.length; i++ ) {
			System.out.println(names[i]);
		}
		
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");//0
		colorList.add("Blue");
		colorList.add("Black");
		colorList.add("Purple");
		colorList.add("White");//4
	
		for(int i= colorList.size()-1; i>=0; i--) {
			System.out.println(colorList.get(i));
		}

		
		
		
	}

}
