package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		
		if(a==b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		//dead code:
		if(false) {
			System.out.println("Hii");
		}
		else {
			System.out.println("Bye");
		}
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		double d1 = 12.33;
		double d2 = 12.33;
		
		if(d1==d2) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		// < > <= >= == !=
		
		int total = 110;
		if(total>=100) {
			System.out.println("correct total");
		}
		else {
			System.out.println("total is less than 100");
		}
		
		
		int marks = 91;
		
		if(marks>=90) {
			System.out.println("GRADE A");
		}
		
		if(marks >=80) {
			if(marks<90) {
				System.out.println("GRADE B");
			}
		}
		
		if(marks >=70) {
			if(marks <80) {
				System.out.println("GRADE C");
			}
		}
		
		//WAP to print the highest number (three diff numbers given)
		
		int x = 500;
		int y = 600;
		int z = 300;
		
		if(x>y && x>z) { //false && true = false
			System.out.println("x is the highest number");
		}
		else if(y>z) {//true
			System.out.println("y is the highest number");
		}
		else {
			System.out.println("z is the highest number");
		}
		
//		int x = 500;
//		int y = 600;
//		int z = 300;
//		int g = 900;
		
		char c1 = 'a';
		char c2 = 'b';
		
		if(c1 == c2) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		int f = 10;
		int g = 10;
		System.out.println(f==g);
		
		
		//String comaprison:
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		
		//cross browser testing:
		String browser = "chrome";

		if(browser.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		
		if(browser.equals("firefox")) {
			System.out.println("Launch firefox");

		}
		
		if(browser.equals("ie")) {
			System.out.println("Launch ie");
		}
		
		if(browser.equals("opera")) {
			System.out.println("Launch opera");

		}
		

		//if else-if:
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		
		else if(browser.equals("firefox")) {
			System.out.println("Launch firefox");

		}
		
		else if(browser.equals("ie")) {
			System.out.println("Launch ie");
		}
		
		else if(browser.equals("opera")) {
			System.out.println("Launch opera");
		}
		
		else {
			System.out.println("Please pass the correct browser name");
		}
		
		
		String gg = "400";
		System.out.println(Integer.parseInt(gg, 8));
		
		byte b1 = 10;
		byte b2 = 20;

		System.out.println(b1 + b2); //Output 30

		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);
		
		final byte x1 = 100;
		 final byte y1 = 20;
		 byte z1 = x1 + y1;
		 System.out.println(z1);
		 
		
	}

}
