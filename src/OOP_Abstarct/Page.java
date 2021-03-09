package OOP_Abstarct;

public abstract class Page {
	
	//can not create the object of abstract class
	//abstract class const.. can be created...
	//but it will be called when you create the object of child class
	public Page() {
		System.out.println("Page class const.....");
	}
	
	public abstract void title();
	
	public abstract void header();
	
	public abstract void url();
	
	public final static void logo() {
		System.out.println("App -- logo");
	}
	
	public void loadingTimeOut() {
		System.out.println("loading time 20 secs....");
	}
	
	//abstract class: 0 to 100% abstraction
	//1. abstract methods + non abstract methods -- yes -- partial abstraction
	//2. only non abstract methods -- yes (0% abstraction)
	//3. only abstract methods -- yes (100% abstraction)
	
	

}
