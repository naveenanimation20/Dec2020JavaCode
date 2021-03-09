package JavaSessions;

public class GrabageCollector {

	public static void main(String[] args) {

		GrabageCollector obj = new GrabageCollector();
		obj = null;
		
		new GrabageCollector();
		
		System.gc();
		
	}

}
