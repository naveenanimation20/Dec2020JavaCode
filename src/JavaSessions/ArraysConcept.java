package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysConcept {

	public static void main(String[] args) {

		
		//1. similar type of data in array
		//2. array size is fixed -- static array
		//1. int array:
		
		int i[] = new int[40];
		//i[-1] = 45;
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//4 to 39
						
		System.out.println(i[0]);
		//System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i[0]+ i[1]);
		System.out.println(i.length);//4
		
		//to print all the values of array: for loop:
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		
		System.out.println("-------");
		
		//for each loop:
		for(int e : i) {
			System.out.println(e);
		}
		
		
		System.out.println("-------");

		
		//2. double array:
		
		double d[] = new double[10];
		d[0] = 12.33;
		d[1] = 23.33;
		
		System.out.println(d[0]);
		System.out.println(d[5]);
		
		int l = d.length;
		System.out.println("length = " + l);
		System.out.println("Li = " + 0);
		System.out.println("Hi = " + (l-1));
		
		//3. char array:
		char c[] = new char[10];
		c[0] = 'a';
		c[1] = '8';
		c[2] = '$';
		
		System.out.println("---->" + c[5]);
		
		
		System.out.println(c.length);
		
		//4. String array:
		String names[] = new String[10];
		names[0] = "Divya";
		names[1] = "namita";
		names[2] = "durjan";
		
		List<String> namesList = Arrays.asList(names);

		System.out.println(names[0]);//Divya
		System.out.println(names[3]);
		
//		for(int p=0; p<names.length; p++) {
//			System.out.println(names[p]);
//		}
//		
//		for(String s : names) {
//			System.out.println(s);
//		}
		
		//Array Literal: when we aware of the number of elements in the array
		int arr[] = {1,2,3,4,1,2,3,4,5,66,89};
		
		System.out.println(arr.length);
		System.out.println("Hi = " + (arr.length-1));
		System.out.println("LI = " + 0);
		System.out.println(arr[0]);
		
		for(int e : arr) {
			System.out.println(e);
		}
		
		//
		System.out.println("---------");
		

		String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));		
		System.out.println(citylist);
		Collections.swap(citylist, 0, 1);
		System.out.println(citylist);

		
		
		
		
	}

}
