package JavaSessions;

public class SwithCaseConcept {

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("please pass the correct browser " + browser );
			break;
		}

	}

}
