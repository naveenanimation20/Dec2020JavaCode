package JavaSessions;


public class LoopsConcept {

	public static void main(String[] args) {

		//1 to 10:
		//1. while loop:
	
		
		
		int i = 1; //Initialization
		while(i<=10) { //Conditional
			System.out.println(i);//1 2 3 4 5 ....10
			i++;//Incremental/Decremental
			//++i;
			//i=i+1;
		}
		
		//give me the ex of infinite loop:
//		while(true) {
//			System.out.println("welcome to Taz Hotel...24 x 7");
//		}
		//dead code/unreachable code
//		while(false) {
//			System.out.println("Bye....");
//		}
		
		int p = 1;
		while(p<=1000) {
			System.out.println(p);//1
			if(p % 10 ==0) {
				System.out.println("Hiii....");
				break;
			}
			p++;			
		}
		
		System.out.println("-------------");
		
		
		//for loop:
		//1 to 10:
		for(int m=1; m<=10; m++) {
			System.out.println(m);//1 2 3 4 5 ....10
		}
		
		System.out.println("-------------");

		for(int m=1; m<=10;) {
			System.out.println(m);//1 1 1 1 1 1
			m++;
		}
		
		//infinite loop:
//		for(;;) {
//			System.out.println("hiii");
//		}
		System.out.println("-------------");

		//even numbers: 0 to 10: 0 2 4 6 8 10
		for(int even = 0; even<=10; even++) {
			System.out.println(even);//0 2 4 6 8 10
			even++;//5
		}
		
		//odd numbers: for, while
		//10 to 1 : for, while
		
		for(int m=0; m<=100; m++) {
			
			System.out.println(m);
			
				if(m == 0) {
					System.out.println("zero....duck....out");
					break;
				}
			
				if(m==50) {
					System.out.println("half century... score is 50...");
				}
				
				if(m==100) {
					System.out.println(" YAY ....century... score is 100");
				}
			
			
		}
		
		
		//
		for(double d = 1.0; d<=10.0; d++) {
			System.out.println(d);
		}
		
		//a to z:
		for(char c ='a'; c<='z'; c++) {
			System.out.print(c + " ");
		}
		
		//do-while loop:
		int n = 1;
		do {
			System.out.println(n);//1 
			n++;
		} 
		while (n<=10);
		
		//
		boolean flag = false;
		while(flag) {
			System.out.println("HElloooo HArini....");
		}
		
//		while(false) {
//		System.out.println("Bye....");
//	}
		
		//00 01 02 03
		//10 11 12 13
		
		for(int m=0; m<=9; m++) {
			for(int s=0; s<=9; s++) {
				
				System.out.print(m+""+s+ " ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
