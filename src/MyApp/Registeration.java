package MyApp;

//POJO -- Plain old java object
//no main method
//it should not extend any other class
//it should not have any other annotations
public class Registeration {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;

	public Registeration(String firstName, String lastName, String email, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public Registeration(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void registerUser(Registeration register) {
		System.out.println(register.firstName + " : " + register.lastName + " : " + register.email + " : "
				+ register.phone + " : " + register.address);
	}
	

}
