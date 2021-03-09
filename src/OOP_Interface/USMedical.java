package OOP_Interface;

public interface USMedical extends WHO, UNHO{
	
	int min_fee = 10;
	//interface vars are static and final by default

	// No Method Body
	// Only method declaration
	// only method prototype
	//Abstract Methods : does not have method body
	//can not create the object of interface

	public void pediaServices();

	public void cardicServices();

	public void pyhsioServices();
	
	public void doctors(int count);
	
	public String getHospInfo();
	
	@Override
	public void healthFund();
	
	//After JDK 1.8:
	//1. can have the method body with static methods:
	public static void bloodTest() {
		System.out.println("US Medical -- Blood Test");
	}
	
	//2. can have one default method
	public default void billing() {
		System.out.println("US Medical -- billing");
	}
	
	public default void billing1() {
		System.out.println("US Medical -- billing");
	}
	

	public default void billing2() {
		System.out.println("US Medical -- billing");
	}
	
	
	
}
