package JavaSessions;

public class MethodsInJava {
	int age;
	String name;
	
	//no method inside a method
	//methods are independent or parallel to each other
	
	//1. no input and no return:
	//void : can't return any value
	public void test() {
		System.out.println("test method");
	}
	
	public void addMarks() {
		System.out.println("add marks");
		int a = 10;
		int b = 20;
		int c = 40;
		int d = a+b+c;
		System.out.println(d);
	}
	
	//2. no input but some return:
	//return type: int
	public int getScore() {
		System.out.println("get score card....");
		int score = 100;
		int bal = 20;
		int finalScore = score + bal;//120
		return finalScore;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name ...");
		String name = "Naveen";
		return name;
	}
	
	//3. some input and some return:
	//return type: int
	public int add(int a, int b) {
		System.out.println("add method...");
		int sum = a+b;
		return sum;
	}
	
	public double getSalary(double prevCTC) {
		System.out.println("get salary...");
		double baseP = 10.12;
		double bonus = 1.3;
		double totalCTC = prevCTC + baseP + bonus;
		return totalCTC;
	}
	

	public static void main(String[] args) {
		System.out.println("main method...");
		
		//create the object:
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		obj.addMarks();
		int sc = obj.getScore();
		System.out.println(sc-10);
		
		int s1 = obj.add(10, 20);
		System.out.println(s1);
		
		double newCTC = obj.getSalary(40.44);
		System.out.println(newCTC);
		
		double secctc = obj.getSalary(34.44);
		System.out.println(secctc);
		
	}
	
			
	

}
