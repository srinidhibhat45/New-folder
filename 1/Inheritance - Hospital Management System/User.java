
public class User {
	private String name;
    private String email;
    private String mobileNumber;
    private String address;

	public User(String name, String email, String mobileNumber, String address) {
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//fill your code here
	public void display()
    {
        //fill your code here
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Address: " + address);
    }
}
