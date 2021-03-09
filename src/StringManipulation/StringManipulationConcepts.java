package StringManipulation;

public class StringManipulationConcepts {

	public static void main(String[] args) {

		
		String str = "This is my java code and I am so happy";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(16));
		System.out.println(str.charAt(37));
		//System.out.println(str.charAt(38));//StringIndexOutOfBoundsException
		//System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException

		System.out.println(str.indexOf('T'));
		
		System.out.println(str.indexOf('i'));//1st occurrence of i
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of i

		System.out.println(str.indexOf("code"));//16
		
		System.out.println(str.indexOf("Naveen"));//-1
		
		String mesg = "welcome admin";
		if(mesg.indexOf("admin")>0) {
			System.out.println("username is there in messg");
		}
		else {
			System.out.println("user name is missing....");
		}
		
		if(mesg.indexOf("admin") == 8) {
			System.out.println("username is found...");
		}
		else {
			System.out.println("user name is missing....");
		}
		
		if(mesg.indexOf("admin") == -1) {
			System.out.println("user name is missing....");
		}
		else {
			System.out.println("username is found...");
		}
		
		//
		String s1 = "welcome to testing";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//trim: for removing the spaces from the corners
		String s2 = "    hello world     ";
		System.out.println(s2.trim());
		
		//file -- browser = chrome
		String browser = "chrome ";
		if(browser.trim().equals("chrome")) {
			System.out.println("launch chrome");
		}
		
		//contains:
		String name = "your app name is amazon";
		if(name.contains("Amazon")) {
			System.out.println("correct messg name");
		}
		else {
			System.out.println("in correct messg name");
		}
		
		String url = "http://www.xyz.com/loginpage.jsp";
		if(url.contains("loginpage")) {
			System.out.println("login page url is correct");
		}
		
		//equals:
		String s11 = "testing selenium";
		String s12 = "testing Selenium ";
		
		System.out.println(s11.equals(s12));
		System.out.println(s11.equalsIgnoreCase(s12.trim()));
		
		//substring:
		String st = "this is my java code";
		System.out.println(st.substring(5));
		System.out.println(st.substring(8, 16));
		
		//String stt = "this is your transaction id is 12345";
		String stt = "your transaction id is 12345";
		//System.out.println(stt.substring(stt.indexOf("is")+3, stt.length()));
		System.out.println(stt.substring(stt.indexOf("is")+3));

		//replace:
		String dob = "12-12-1990"; // 12/12/1990
		System.out.println(dob.replace('-', '/'));
		
		//split:
		String lang = "JAVA;Python;Ruby;JavaScript";
		String langArr[] = lang.split(";");
		System.out.println(langArr[0]);
		System.out.println(langArr.length);
		
		for(String e : langArr) {
			System.out.println(e);
		}
		
		//data driven:
		String testdata = "mohit;bisht;mohit@gmail.com;99999;test@123";
		
		String data[] = testdata.split(";");
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
			//pass the vaue to text filled -- data[i]
		}
		
		String test = "xXIndiaxXXUSXxXUKXxXXRussia";
		String testing[] = test.split("xX");
		System.out.println(testing[0]);
		System.out.println(testing[1]);
		System.out.println(testing[2]);
		System.out.println(testing[3]);
		System.out.println(testing[4]);

		
		
		
		
		
	}

}
