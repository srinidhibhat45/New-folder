import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		//fill your code here
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Menu");
			System.out.println("1. Doctor");
			System.out.println("2. Patient");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume new line

			switch (choice) {
				case 1:
					System.out.println("Enter doctor details (name,email,mobile,address,qualification,experience):");
					String doctorDetails = sc.nextLine();
					String[] doctorInfo = doctorDetails.split(",");
					Doctor doctor = new Doctor(
							doctorInfo[0], doctorInfo[1], doctorInfo[2],
							doctorInfo[3], doctorInfo[4], Integer.parseInt(doctorInfo[5]));

					System.out.println("Doctor details");
					doctor.display();
					break;
				case 2:
					System.out.println("Enter patient details (name,email,mobile,address,bloodGroup,height,weight):");
					String patientDetails = sc.nextLine();
					String[] patientInfo = patientDetails.split(",");
					Patient patient = new Patient(
							patientInfo[0], patientInfo[1], patientInfo[2],
							patientInfo[3], patientInfo[4], Double.parseDouble(patientInfo[5]),
							Double.parseDouble(patientInfo[6])
					);
					System.out.println("Patient details");
					patient.display();
					break;
				default:
					System.out.println("Invalid input");
			}
		}
	}
}
