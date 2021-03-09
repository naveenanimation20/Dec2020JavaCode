package OOP_Interface;

public class FortisHospital extends CenteralHospital implements USMedical, IndianMedical, UKMedical{

	//USMedical
	@Override
	public void pediaServices() {
		System.out.println("FH --pediaServices ");
	}

	@Override
	public void cardicServices() {
		System.out.println("FH --cardicServices ");

	}

	@Override
	public void pyhsioServices() {
		System.out.println("FH --pyhsioServices ");
	}

	@Override
	public void doctors(int count) {
		System.out.println("FH --doctors +  " + count);

	}

	@Override
	public String getHospInfo() {
		return "US Hospital -- FH";
	}

	//Indian
	@Override
	public void oncologyServices() {
		System.out.println("FH --oncologyServices ");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH --orthoServices ");
		
	}

	//UKMedical
	@Override
	public void neuroServices() {
		System.out.println("FH --neuroServices ");
		
	}
	
	@Override
	public void opthoServices() {

		
	}

	@Override
	public void entServices() {
		System.out.println("FH --entServices ");
		
	}

	@Override
	public void gynecServices() {
		System.out.println("FH --gynecServices ");
		
	}

	
	//Non overridden methods
	public void medicalInsurance() {
		System.out.println("FH --medicalInsurance ");

	}
	
	public void medicalTraining() {
		System.out.println("FH --medicalTraining ");

	}

	public void pathalogyServices() {
		System.out.println("FH --pathalogyServices ");

	}

	//WHO
	@Override
	public void covid19Test() {
		System.out.println("FH -- covid19Test");
	}
	
	@Override
	public void billing() {
		System.out.println("FH - billing");
	}

	@Override
	public void healthFund() {
		System.out.println("FH - healthFund");

	}

}
