package WebDriver_Arch;

public class GoogleTest {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "Opera";
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// IEDriver driver = new IEDriver();

		// top casting: Cross browser testing:
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} 
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} 
		else if (browser.equals("IE")) {
			driver = new IEDriver();
		}
		else {
			System.out.println("Please pass the correct browser name....");
		}

		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is : " + title);

		// verification point: checkpoint:
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}

		driver.findElement("test_id");
		driver.sendkeys();
		driver.click();
		driver.close();

	}

}
