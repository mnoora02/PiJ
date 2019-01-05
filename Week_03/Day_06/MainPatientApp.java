package Week_03.Day_06;

public class MainPatientApp {

	public static void main (String[] args) {						

		Patient bob = new Patient("Bob", 34, "Broken Leg");			// Patient object called bob NB: patient constructor takes 3 PARAMs
		// Patient bob = new Patient("Bob", 34, "Broken Leg");		// for clarity can also use patients name as the object as well in lower case..
		Patient tom = new Patient("Tom", 25, "Broken Leg");
		Patient dick = new Patient("Dick", 78, "Broken Rib");
		Patient harry = new Patient("Harry", 31, "1st. Degree Burn");
		Patient lilith = new Patient("Lilith", 45, "Smoke Inhalation");
		Patient lilly = new Patient("Lilly", 82, "Dog bite");
		Patient sarah = new Patient("Sarah", 12, "Anaphylactic shock");
		Patient jane = new Patient("Jane", 34, "Breathing difficulties");
		Patient makayla = new Patient("Makayla", 31, "Broken arm");
		Patient andrea = new Patient("Andrea", 43, "RTA");

		HospitalManager hospitalManager = new HospitalManager();	// create a hospital manager object of type hospitalManager with empty paranthese
																	// because hospitalManager does not have a constructor with PARAMs
																	// NB. when creating objects in your application, there is no need t
																	// to specify whether objects are public or private etc.

		System.out.println(hospitalManager.lengthList());			// print the length of the list of the 

		hospitalManager.addPatient(bob);							// creating/add a patient object to hospitalManager by passing object as a PARAM as per addPatient method
		hospitalManager.addPatient(tom);							 							
		hospitalManager.addPatient(dick);
		hospitalManager.addPatient(harry);
		hospitalManager.addPatient(lilith);
		hospitalManager.addPatient(lilly);
		hospitalManager.addPatient(sarah);
		hospitalManager.addPatient(jane);
		hospitalManager.addPatient(makayla)	;
		hospitalManager.addPatient(andrea);

		System.out.println(hospitalManager.lengthList());			// print the length of the list of the 
		
		hospitalManager.toPrint();									// print method which needs to be created in the hospitalManager

		hospitalManager.deletePatient("Bob");                       // delete Bob to see if we can
		hospitalManager.deletePatient("Tom");
		hospitalManager.deletePatient("Andrea");

		System.out.println(hospitalManager.lengthList());
		
		hospitalManager.toPrint();

	}
} // END of class

/**
code minus the comments: 

public class MainPatientApp {

	public static void main (String[] args) {

		Patient bob = new Patient("Bob", 34, "Broken Leg");
		// Patient bob = new Patient("Bob", 34, "Broken Leg");
		Patient tom = new Patient("Tom", 34, "Broken Leg");
		Patient dick = new Patient("Dick", 34, "Broken Leg");
		Patient harry = new Patient("Harry", 34, "Broken Leg");
		Patient lilith = new Patient("Lilith", 34, "Broken Leg");
		Patient lilly = new Patient("Lilly", 34, "Broken Leg");
		Patient sarah = new Patient("Sarah", 34, "Broken Leg");
		Patient jane = new Patient("Jane", 34, "Broken Leg");
		Patient makayla = new Patient("Makayla", 34, "Broken Leg");
		Patient andrea = new Patient("Andrea", 34, "Broken Leg");

		HospitalManager hospitalManager = new HospitalManager();
		
		System.out.println(hospitalManager.lengthList());

		hospitalManager.addPatient(bob);
		hospitalManager.addPatient(tom);
		hospitalManager.addPatient(dick);
		hospitalManager.addPatient(harry);
		hospitalManager.addPatient(lilith);
		hospitalManager.addPatient(lilly);
		hospitalManager.addPatient(sarah);
		hospitalManager.addPatient(jane);
		hospitalManager.addPatient(makayla)	;
		hospitalManager.addPatient(andrea);

		hospitalManager.toPrint();

		hospitalManager.deletePatient("Bob");
		hospitalManager.deletePatient("Tom");
		hospitalManager.deletePatient("Andrea");

		hospitalManager.toPrint();

		System.out.println(hospitalManager.lengthList());

	}
} END of class
*/