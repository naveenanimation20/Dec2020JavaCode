package OOP_Abstarct;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("Login page class const.....");
	}

	@Override
	public void title() {
		System.out.println("My Login title");
	}

	@Override
	public void header() {
		System.out.println("Login Page header");
	}

	@Override
	public void url() {
		System.out.println("http://www.xyz.com/Loginpage.jsp");
	}

	@Override
	public void loadingTimeOut() {
		System.out.println("login page loading is : 10 secs");
	}
	
	public void doLogin() {
		System.out.println("do login");
	}
	

}
