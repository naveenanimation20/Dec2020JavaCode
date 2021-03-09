package SuperKeyword;

public class HR extends Department{

	int dept_code = 102;

	@Override
	public void getDeptId() {
		System.out.println("HR -- get Dept id....");
	}
	
	public void getDeptInfo() {
		getDeptId();
		super.getDeptId();
	}
		
	
	

}
