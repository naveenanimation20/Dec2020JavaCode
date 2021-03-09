package OOP_Abstarct;

public class HomePage extends Page{
	
	@Override
	public void title() {
		System.out.println("My Home title");
	}

	@Override
	public void header() {
		System.out.println("Home Page header");
	}

	@Override
	public void url() {
		System.out.println("http://www.xyz.com/Homepage.jsp");
	}
	
	
	

}
