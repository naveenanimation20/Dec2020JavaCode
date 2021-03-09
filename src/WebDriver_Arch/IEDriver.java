package WebDriver_Arch;

public class IEDriver implements WebDriver{
	
	public IEDriver() {
		System.out.println("launching IE");
		System.out.println("IE is launched.....");
	}
	
	
	@Override
	public void findElement(String locator) {

		System.out.println("finding the element with : " + locator);

	}

	@Override
	public void get(String url) {
		System.out.println("enter url : " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("getting page title");
		return "Google";
	}

	@Override
	public void click() {
		System.out.println("click on element");
	}

	@Override
	public void sendkeys() {
		System.out.println("enter the values in a text field");
	}

	@Override
	public void close() {
		System.out.println("closing the browser");
	}
	
	

}
