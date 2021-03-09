package auto;

public class A {

	public static void main(String[] args) {

		for(byte b=1; b<=10;) {
			System.out.println(b);
			b=(byte) (b+1);
		}
		
		
		byte b1 = 111;
		byte b2 = 112;
		byte b3 = (byte)(b1+b2);
		System.out.println(b3);
		
		
		for(char c ='a'; c<='z'; c++) {
			System.out.println(c+0);
		}
		
		for(char c ='a'; c<='z'; c++) {
			System.out.println((int)c);
		}
		
		
		
	}

}
