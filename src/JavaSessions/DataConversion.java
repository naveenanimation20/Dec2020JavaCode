package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//String to int:
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x); //100
		System.out.println(i+20);
		
		String total = "5000";
		int finalToal = Integer.parseInt(total) + 10 -20 + 5;
		System.out.println(finalToal);
		
		if(finalToal == 4995) {
			System.out.println("calculation is correct");
		}
		
		String y = "100test";
		System.out.println(y+20);
		
//		int j = Integer.parseInt(y);
//		System.out.println(j+20);//120
		
		//String to double:
		String p = "12.33";
		System.out.println(p+300);
		
		double d = Double.parseDouble(p);
		System.out.println(d+300);
		
		//int to String:
		int marks = 100;
		System.out.println(marks + 20);
		
		//10020
		String m = String.valueOf(marks); //"100"
		System.out.println(m + 20);
		
		double salary = 34.44;
		String s1 = String.valueOf(salary) + 500;
		System.out.println(s1);
		
		boolean flag = true;
		System.out.println(flag + " Bye");
		
		String f = String.valueOf(flag);
		System.out.println(f);
		
		String s = "this is your transaction id is 12345";
		System.out.println(s.substring(s.indexOf("is", s.indexOf("is", s.indexOf("is")+1)+1)+3, s.length()));
		
		
		
	}

}
