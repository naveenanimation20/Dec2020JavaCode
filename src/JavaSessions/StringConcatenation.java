package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {

		String x = "Hello";
		String y = "World";
				
		int a = 100;
		int b = 200;
		
		double d1 = 12.33;
		double d2 = 22.33;
		
		System.out.println(a+b);
		System.out.println(d1+d2);
		
		System.out.println(x+y);
		
		System.out.println(x+a);
		
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(x+y+(a+b));//HelloWorld300
		
		System.out.println(a+b+x+y+d1+d2);
		
		System.out.println(x+y+d1+d2+a+b);
		
		System.out.println("the value of a is " + a);
		System.out.println("the value of b is " + b);
		System.out.println("the sum of a and b is " + (a+b));

		byte b1 = 10;
		System.out.println(b1+"Hello");
		
		
		System.out.println(10/3);
		System.out.println(10.0/3.0);

		//System.out.println(9/0);// java.lang.ArithmeticException: / by zero
		System.out.println(0/19);//0
		
		System.out.println(11 % 2);
		
		//System.out.println(10 % 0);// java.lang.ArithmeticException: / by zero
		
		System.out.println(0 % 9);
		
		System.out.println(10 % 2.1);
		
		System.out.println(10+3+9*3);
		
		
		
	}

}
