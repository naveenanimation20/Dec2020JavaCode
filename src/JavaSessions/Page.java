package JavaSessions;

public class Page {

	public static void t1() {
		System.out.println("hii t1");
		t2();
	}

	public static void t2() {
		System.out.println("hello t2");
		t3();
	}

	public static void t3() {
		System.out.println("Bye...t3");
	}

	public void launch() {
		System.out.println("launch");
		header();
		t1();
	}

	public void header() {
		System.out.println("header");
		title();
	}

	public void title() {
		System.out.println("title");
		close();
	}

	public void close() {
		System.out.println("close");

	}

	public static void main(String[] args) {

		Page p = new Page();
		p.launch();
		
		t1();
	}

}
