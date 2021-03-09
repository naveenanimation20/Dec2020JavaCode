package OOP_Encapsulation;

public class BrowserUser {

	public static void main(String[] args) {

		
		Browser br = new Browser();
		br.launchBrowser();
		
		br.setVersion(50);
		int v = br.getVersion();
		System.out.println(v);
		
	}

}
