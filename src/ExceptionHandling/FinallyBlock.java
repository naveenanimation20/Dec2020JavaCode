package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception is here....");
		}

		finally {
			System.out.println("Bye.....");
		}

		// make connection with DB --
		// db is down -- exception
		// un/pwd -- wrong -- exception
		// connectivity issue -- exception

		// 2. connection is done...

		// get the data using SQL -- exception
		// use that data
		// close the connection -- finally block

		System.out.println(getMarks("Naveen"));
	}

	public static int getMarks(String name) {
		if (name.equals("Sonam")) {
			return 90;
		}

		else if (name.equals("Tom")) {
			try {
				int i = 9 / 0;
				return 45;
			} catch (Exception e) {
				return 50;
			}
			finally {
				System.out.println("inside finally block");
				return 10;
			}
		}

		else if (name.equals("Sujan")) {
			return 95;
		}
		
		return -1;

	}

}
