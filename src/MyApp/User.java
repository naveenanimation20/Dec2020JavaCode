package MyApp;

public class User {

	public static void main(String[] args) {

		
		Application app = new Application("admin", "admin");
		app.doLogin();
		
		Application app1 = new Application();
		app1.setUsername("seller");
		app1.setPassword("seller123");
		app1.doLogin();
		
		System.out.println(app1.getUsername());
		System.out.println(app1.getPassword());

		
	}

}
