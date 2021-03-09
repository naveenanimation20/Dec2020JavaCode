package OOP_Encapsulation;

public class Company {
	
	public String name;
	private int sharePrice;
	private String policy;
	
	public void getCompAddress() {
		System.out.println("some comp address....");
	}
	
	public void getShareInformation() {
		getCompShareInfo();
	}
	
	private void getCompShareInfo() {
		System.out.println("comp share info....");
	}
	
	
	

}
