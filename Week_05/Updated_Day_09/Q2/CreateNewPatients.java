package Week_05.Updated_Day_09.Q2;
code minus the comments: 

public class CreateNewPatients {

	public static void main(String[] args) {

		DoubleListPatient fire = new DoubleListPatient("Fire", 54, "Flu");
		DoubleListPatient water = new DoubleListPatient("Water", 24, "Cold");
		DoubleListPatient earth = new DoubleListPatient("Earth", 94, "Gout");

		DoubleListHospitalManager dblMan = new DoubleListHospitalManager(); 

		dblMan.addPatient(fire);
		dblMan.addPatient(water);
		dblMan.addPatient(earth);

		// dblMan.toPrint(); 
		// System.out.println(); 
		// dblMan.printBackwards();

		dblMan.deletePatient("Fire");
		dblMan.toPrint(); 
		System.out.println(); 

		dblMan.printBackwards();

		dblMan.addPatient(new DoubleListPatient("Air", 12, "Wind"));	// anonymous declarations
		System.out.println(dblMan.deletePatient("Mud"));
		dblMan.toPrint();
		dblMan.printBackwards();	
	}
} 

