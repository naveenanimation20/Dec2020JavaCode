package OOP_Interface;

public class TestHopital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardicServices();
		fh.entServices();
		fh.doctors(100);
		String info = fh.getHospInfo();
		System.out.println(info);

		fh.medicalInsurance();
		fh.medicalTraining();
		fh.pathalogyServices();

		System.out.println(USMedical.min_fee);

		USMedical.bloodTest();

		fh.billing();

		// top casting:
		// child class object can be referred by parent interface ref variable:
		USMedical us = new FortisHospital();
		us.pediaServices();

		IndianMedical in = new FortisHospital();
		in.oncologyServices();

		// down casting: not possible as we cant create the object of Interface.

		test("naven");
		
	}
	
	public static void test(String name) {
		
		String xpath = "//tag[@id='"+name+"']";
		System.out.println(xpath);
		
	}

}
