package JavaSessions;

public class StaticMethodoverloading {

	public static void test() {

	}

	public static void test(int a) {

	}

	public static void test(int a, String b) {

	}
	
	public static void test(String a, int b) {

	}
	

	public static void main(String[] args) {

		test("testing", 100);
		
		
		
	}

}
