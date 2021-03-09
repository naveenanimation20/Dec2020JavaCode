package auto;

public class AutoMobile {

	public void getAuto() {
		System.out.println("AutoMobile -- getAuto");
	}
	
	public static void main(String a[]) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = s1;

		s3 = "NewJava";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1);
		
		int i1 = 10;
		int i2 = i1;
		i2=20;

		System.out.println(i1);
		System.out.println(i2);
		
		
		Integer i3 = 30;
		Integer i4 = i3;
		i4 = 40;

		System.out.println(i3);
		System.out.println(i4);
	}
	
	
}
