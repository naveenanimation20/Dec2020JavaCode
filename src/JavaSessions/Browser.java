package JavaSessions;

public class Browser {

	// WAF where you need to pass the browser name : ch//ff//Ie
	// and on the basis of browser name, launch the browser

	public void launchBrowser(String browserName) {
		System.out.println("brower name is : " + browserName);//CHROME
		
		switch (browserName.toLowerCase()) { //chrome
		
		case "chrome":
			System.out.println("launch chrome...");
			break;
		case "firefox":
			System.out.println("launch ff...");
			break;
		case "safari":
			System.out.println("launch safari...");
			break;

		default:
			System.out.println("incorrect browser");
			break;
		}

//		if (browserName.equalsIgnoreCase("chrome")) {
//			System.out.println("launch chrome...");
//		}
//
//		else if (browserName.equalsIgnoreCase("firefox")) {
//			System.out.println("launch ff...");
//		}
//
//		else if (browserName.equalsIgnoreCase("ie")) {
//			System.out.println("launch ie...");
//		}
//
//		else {
//			System.out.println("Please pass the correct browser name....");
//		}

	}

	public static void main(String[] args) {
		Browser br = new Browser();
		br.launchBrowser("CHROME");
	}

}
