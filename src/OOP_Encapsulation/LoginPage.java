package OOP_Encapsulation;

public class LoginPage {

	private String userName;
	private String password;

	public LoginPage() {
		System.out.println("");
	}
	
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("entering username : " + un);
		System.out.println("entering password : " + pwd);
		System.out.println("click on Login");
		System.out.println("login is done.....");

	}

	public void logout() {
		System.out.println("logout from the app....");
	}

}
