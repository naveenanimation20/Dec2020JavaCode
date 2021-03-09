package JavaSessions;

public class EcommApp {

	public void search() {

	}

	public void search(String name, int price) {

	}

	public void search(String name, int price, String color) {

	}

	public void payment(String CC) {

	}

	public void payment(String UPI, int otp) {

	}

	public void payment(String CC, int otp, int cvv) {

	}

	public String bookingCab(String st, String end) {
		System.out.println(st + " to " + end);
		return "Booked";

	}

	public void bookingCab(String st, String end, String carType) {

	}
	
	public boolean bookingCab(String st, String end, String carType, double rating) {
		System.out.println(st + " to " + end + " with " + carType + " rating: "+ rating);
		if(carType.equals("Premium")) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		EcommApp obj = new EcommApp();
		String mesg = obj.bookingCab("bangalore", "pune");
		System.out.println(mesg);
		
		boolean b = obj.bookingCab("pune", "mumbai", "Normal", 4);
		System.out.println(b);
		
	}

}
