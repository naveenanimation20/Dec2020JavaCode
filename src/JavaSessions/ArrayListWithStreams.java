package JavaSessions;

import java.util.ArrayList;

public class ArrayListWithStreams {

	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<String>();

		lang.add("JAVA");// 0
		lang.add("Python");// 1
		lang.add("C#");// 2
		lang.add("Ruby");// 3
		
		//JDK 8 : streams:
		//functional programming:
		
		long stTime = System.currentTimeMillis();
		
		lang.stream().forEach(e -> System.out.println(e));
		
		long endTime = System.currentTimeMillis();

		System.out.println(endTime-stTime);
		
		System.out.println("----");
		
		lang.parallelStream().forEach(e -> System.out.println(e));
		
		

	}

}
