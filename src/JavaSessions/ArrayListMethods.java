package JavaSessions;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<String>();
		
		lang.add("JAVA");//0
		lang.add("Python");//1
		lang.add("C#");//2
		lang.add("Ruby");//3
		
		System.out.println(lang);
		
		lang.set(2, "JAVASCRIPT");
		
		System.out.println(lang);
		
		lang.add(null);
		lang.add("Ruby");

		
		System.out.println(lang);
		
		System.out.println(lang.size());
		
		lang.remove(3);
		System.out.println(lang);
		System.out.println(lang.get(3));

		
	}	
	

}
