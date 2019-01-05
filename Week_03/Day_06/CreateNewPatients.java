package Week_03.Day_06;

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

		dblMan.addPatient(new DoubleListPatient("Air", 12, "Wind"));	// anonymous declarations/objects - created inside argument with any PARAMs
																		// cos you haven't called it air as we have fire, water etc...
		System.out.println(dblMan.deletePatient("Mud"));				// delete item not in list - should get false because it didn't find patient
		dblMan.toPrint();
		dblMan.printBackwards();	
	}
} 



/**
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

@Override 
public void turnOff() {
	le.turnOff()
}
*/