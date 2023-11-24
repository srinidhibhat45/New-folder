
public class Patient extends User {
	private String bloodGroup;
    private double height;
    private double weight;

	public Patient(String name, String email, String mobileNumber, String address, String bloodGroup, double height, double weight) {
		super(name, email, mobileNumber, address);
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.weight = weight;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//fill your code here
	public void display()
    {
		//fill your code here
		super.display(); // Call the display method of the parent class (User)
		System.out.println("Blood Group: " + bloodGroup);
		System.out.println("Height: " + height + " cm");
		System.out.println("Weight: " + weight + " kg");
    }

}
