package OOP_Abstarct;

public class AmazonPageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		
		lp.url();
		lp.title();
		lp.header();
		//lp.logo();
		Page.logo();
		lp.loadingTimeOut();
		
		//child class object can be referred by parent abstract class ref variable:
		//top casting:
		
		Page p = new LoginPage();
		p.header();
		p.title();
		p.url();
		p.loadingTimeOut();
		p.logo();
		
		
		
	}

}
