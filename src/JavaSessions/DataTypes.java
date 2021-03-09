package JavaSessions;

/**
 * This class is used for different data types in Java
 * @author naveenautomationlabs
 *
 */
public class DataTypes {

	public static void main(String[] args) {

		//data types: type of data
		//strict data type: 
		//1. primitive Data types:
				//a. Boolean Type: boolean: true/false
				//b. Numeric Type: 
					//b.1 character : char
					//b.2: Integral:
						//b.2.1: Integer: byte, short, int, long
						//b.2.2: Floating-point: float, double
					
		//2. non primitive data types: String, Array, Interface....Object
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b1 = 10;
		 b1 = 20;
		 System.out.println(b1);
		byte b2 = 0;
		
		//2. short:
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		short s = 100;
		System.out.println(s);
		
		//3. int:
		//size: 4 bytes = 32 bits
		//Range: -2147483648 to 2147483647
		int i = 1000;
		int i1 = -10;
		int i2 = 400;
		System.out.println(i+i1+i2);
		
		//4. long: 
		//size: 8 bytes = 64 bits
		//range: 
		long l1 = 100000;
		System.out.println(l1);
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: upto 7 digits after .
		float f1 = 12.33f;
		float f2 = (float)19.33;
		System.out.println(f1);
		System.out.println(f2);
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: upto 16 digits after .
		double d1 = 12.3333333;
		
		
		//7. char: only single digit value
		//size: 2 bytes = 16 bits
		//UNICODE + LANGUAGE CODES --> ASCII Codes
		char c1 = 'a'; //a-z
		char c11 = 'b';
		char c2 = '1'; //0-9
		char c3 = '$'; //
		
		System.out.println(c1);//a
		System.out.println(c1+c11); //97 + 98 = 195
		//ranges:	
		//a-z : 97 to 122
		//A-Z : 65 to 90
		//0-9 : 48 to 57
		
		//8. Boolean: true/false
		//checkpoint: validations/verifications
		//Assert
		//conditional Operators
		//size: ~ 1 bit
		boolean flag = true;
		boolean fl = false;
	
		//9. String: default class in java
		//not a primitive data type
		String str = "Hello World";
		System.out.println(str);
		System.out.println("Hello Selenium");		
		
		
		byte b3 = 067;
		System.out.println(b3);
		
		//065 --> 
		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
		
		
	}

}
