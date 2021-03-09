package JavaSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		// Time Complexity:
		// BIG O
		// n, n^2, n^3 1

		int i = 10;
		System.out.println(i);
		// O(1) -- constant time

		for (int p = 1; p <= 10; p++) {
			System.out.println(p);
			System.out.println("hii im an batman");
		}

		// n = 1, 10, 100, 1000, 1000000
		// O(n)
		// 1 + n + n + n + n ==> 1 + 3n ==> 3n + 1 ==> 3n ==> n ==> O(n)
		// Linear Equation

		for (int m = 1; m <= 9; m++) {

			for (int n = 1; n <= 9; n++) {
				System.out.print(m + " " + n);
			}
			System.out.println();

		}

		// (1 + n + n + n)(1+ n + n+n)
		// (1+3n)(1+3n)
		// (1+3n+3n+9n^2)
		// 1+6n+9n^2 -- Quadratic Equation
		// 9n^2 + 6n
		// 3(3n^2 + 2n)
		// 3n^2 + 2n
		// n^2 + n
		// n(n+1)
		// n(n) ==> n^2 ==> O(n^2)

		for (int m = 1; m <= 9; m++) {

			for (int n = 1; n <= 9; n++) {
				
				for(int k=1; k<=9; k++) {
					System.out.print(m + " " + n + " " + k);
				}
				
			}
			System.out.println();
		}
		
		//(1+n)(1+n)(1+n) ==> 1 + n^3 ==> O(n^3)

	}

}
