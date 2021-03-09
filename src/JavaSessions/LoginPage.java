package JavaSessions;

public class LoginPage {

	
	//Compile Time PolyMorphism
	//Poly + Morphism => multiple Forms
	
	// method overloading:
	// within the same class :
	// we have different methods
	// with the same name
	// with different params(diff types)
	// and the diff parameter sequence

	public void login() {
		System.out.println("default login");
	}

	public void login(long phone) {
		System.out.println("login with phone number: " + phone);
	}

	public void login(long phone, int otp) {
		System.out.println("login with phone number: " + phone + " and " + otp);
	}

//	public void login(int otp, long phone) {// 2 params
//		System.out.println("login with phone number: " + phone + " and " + otp);
//	}

	public void login(String un, String pwd) {// 2 params
		System.out.println("login with : " + un + " " + pwd);
	}

	public void login(String email, String pwd, String role) {// 3 params

	}
	
	public String bookingCab(String st, String end) {
		System.out.println(st + " to " + end);
		return "Booked";

	}

	public void bookingCab(String st, String end, String carType) {

	}
	
	public void bookingCab(String st, String end, String carType, double rating) {

	}


	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.login();
		lp.login(99999);
		lp.login(90909099, 999);
		lp.login("admin", "admin123");
		

	}

}
