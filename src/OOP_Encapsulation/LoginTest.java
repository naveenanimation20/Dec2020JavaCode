package OOP_Encapsulation;

public class LoginTest {

	public static void main(String[] args) {

		
//		LoginPage lp_customer = new LoginPage("naveen@gmail.com", "Naveen@123");
//		
////		lp.setUserName("naveen@gmail.com");
////		lp.setPassword("test@123");
//		lp_customer.doLogin(lp_customer.getUserName(), lp_customer.getPassword());
//		lp_customer.logout();
//		
////		lp.setUserName("seller@gmail.com");
////		lp.setPassword("seller@123");
////		lp.doLogin(lp.getUserName(), lp.getPassword());
////		lp.logout();
//
//		LoginPage lp_seller = new LoginPage("seller@gmail.com", "seller@123");
//		lp_seller.doLogin(lp_seller.getUserName(), lp_seller.getPassword());
//		lp_seller.logout();
		
		
		LoginPage lp = new LoginPage();
		lp.setUserName("veena@gmail.com");
		lp.setPassword("veena@123");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		lp.logout();
		
		LoginPage lp1 = new LoginPage("naveen@gmail.com", "naveen@123");
		lp1.doLogin(lp1.getUserName(), lp1.getPassword());
		lp1.logout();
	}

}
