package WebDriver_Arch;

public interface WebDriver extends SearchContext{
	
	//selenium 3.x
	@Override
	public void findElement(String locator);

	public void get(String url);
	
	public String getTitle();
	
	public void click();
	
	public void sendkeys();
	
	public void close();
	
	//selenium 4.x
	//public void handleAlert();
	

}
