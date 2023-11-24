
public class Doctor extends User{
	private String qualification;
    private int experience;

	public Doctor(String name, String email, String mobileNumber, String address, String qualification, int experience) {
		super(name, email, mobileNumber, address);
		this.qualification = qualification;
		this.experience = experience;
	}

	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	//fill your code here
	public void display()
    {
        //fill your code here
		super.display(); // Call the display method of the parent class (User)
		System.out.println("Qualification: " + qualification);
		System.out.println("Experience: " + experience + " years");
    }
}
