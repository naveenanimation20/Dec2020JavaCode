package JavaSessions;

import java.util.Scanner;

public class aa {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Please enter a number = ");

		int num = reader.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}

	}
}