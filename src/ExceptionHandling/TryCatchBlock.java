package ExceptionHandling;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {

		int base = 0;
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");

		try {
			TryCatchBlock obj = new TryCatchBlock();
			//obj = null;
			obj.name = "Tom";
			System.out.println(obj.name);

			int i = 9/base;
			System.out.println("Bye!!");
			System.out.println("Bye!!");
			System.out.println("Bye!!");

		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception is coming...");
			e.printStackTrace();
		}
		catch(NullPointerException e) { //NPE
			System.out.println("null pointer exception is coming...");
			e.printStackTrace();
		}
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		
		
		
	}

}
