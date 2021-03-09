package OOP_Encapsulation;

public class Browser {
	
	private int version;
	
	//getter and setter:
	public void setVersion(int version) {
		this.version = version;
	}
	
	public int getVersion() {
		return version;
	}
	
	

	public void launchBrowser() {
		System.out.println("getting browser launched");
		checkBrowserVersion();
		checkRAM();
		OSCompatible();
		checkBrowserUpdate();

		System.out.println("browser is launched");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkRAM() {
		System.out.println("checkRAM");

	}

	private void OSCompatible() {
		System.out.println("OSCompatible");
	}

	private void checkBrowserUpdate() {
		System.out.println("checkBrowserUpdate");

	}

}
