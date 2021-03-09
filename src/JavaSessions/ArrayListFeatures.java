package JavaSessions;

import java.util.ArrayList;

public class ArrayListFeatures {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<Integer>();

		marksList.add(100);//0
		marksList.add(200);//1
		marksList.add(300);//2
		marksList.add(400);//3
		//PC = 4, VC = 6
		
		System.out.println(marksList.get(0));
		//System.out.println(marksList.get(4));//IndexOutOfBoundsException
		
//		marksList.add(4, 1000);
//		
//		System.out.println(marksList.get(4));

		//to print all the values from arrayList:
		System.out.println(marksList);
		
		for(int i=0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));
		}

		//for each:
		for(Integer e : marksList) {
			System.out.println(e);
		}

	}

}
