package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {

		//dynamic Arrays:
		//ArrayList concept: is a class in Java
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());//0 --PC
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size()); //2 -- PC
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size()); //4 -- PC

		ar.add(500);//4
		ar.add(600);//5
		ar.add(700);//6
		ar.add(800);//7
		ar.add(900);//8
		ar.add(400);//9
		
		System.out.println(ar.size()); //10 -- PC

		ar.add(400);//10
		ar.add("test");
		ar.add('t');
		ar.add(true);
		ar.add(12.33);
		
		//int arraylist:
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		//marksList.add(12.33);
		
		ArrayList<Double> BMIList = new ArrayList<Double>();

		//String ArrayList:
		
		ArrayList<String> namesList = new ArrayList<String>();

		namesList.add("Anjum");
		namesList.add("Naveen");
		namesList.add("Dinesh");
		//namesList.add(100);
		
		//Emp list with diff types of data:
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Tom");//0
		empData.add(25);//1
		empData.add(12.33);
		empData.add("London");
		empData.add(true);
		empData.add('M');
		
		System.out.println(empData);

		Collections.swap(empData, 0, 1);
		System.out.println(empData);
		
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Black");
		colorList.add("Purple");
		colorList.add("White");

//		for(String e : colorList) {
//			System.out.println(e);
//			if(e.equals("Black")) {
//				System.out.println("Bye!!!");
//				break;
//			}
//		}
		
		
	}

}
