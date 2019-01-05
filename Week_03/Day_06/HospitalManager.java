package Week_03.Day_06;

public class HospitalManager {
	
	// private Patient[] patientArray = new Patient[90];	// we could create a patient array but this will be a fixed size ie. 90 
	private Patient firstPatient = null;					// or we create a a linked list and have field that references the first patient in the
															// list which is initialised to null because it is a complex type
															// we're creating a private field firstPatient of type Patient (ie. Patient class)
															// initialised to null because (complex type) at start we have no patients in our hospital
															// the strucutre of the linked list is in Patient class which contains the values (name, 
															// age, illness) and a link to the next patient
															// in the HospitalManager we're gonna construct the structure which is why we need the
															// field firstPatient of type Patient to refer back to the Patient class as it will be our
															// initial entry point into the list 
															// design decision - you have a hospital and patients. Each patient has a link to the next
															// patient becaues we want to create a linked list BUT in terms of the methods ie. say we
															// want to add a patient; should that be the responsibilty of the patients class or the 
															// HospitalManager class? It depends on how you want to design it...
															// NB: in the Patient class we initialised the fields via a constructor - remember we declared
															// private fields and then initialised them in the constructor 
															// whereas here we have initialised and declared in the same line (no constructor is needed)
															// because everytime we create a HospitalManager - it will be created with no patients in.
															// we can create/declare the firsPatient and set/initialise it to null

	public void addPatient(Patient newPatient) {			// create an addPatient method that takes a PARAM newPatient of type Patient
															// this will be void but sometimes you may want to return a value i.e. 1 to confirm you have
                                                            // actually added a patient in which case your return type will reflect that i.e. int etc.
															// When creating addPatient method, we will need to see if there is a nextPatient and then
															// access nextPatient information through a getter (therefore we need to create a getter in our 
															// Patient class) because all of our fields are private we need to create accessor methods 
															// - getters (to get values) and setters (to change values) methods
		if (firstPatient == null) {							// Check & see if list is empty ie. no patients in hospitals
			firstPatient = newPatient; 						
		}
		else {
			Patient mockPatient = firstPatient;				// create temp object holding value(s) of firstPatient and use that to iterate from beginning of list
			while (mockPatient.getNextPatient() != null) {	// while our pointer is not at end of list 
				mockPatient = mockPatient.getNextPatient();	// our pointer moves to the next position 
			}
			mockPatient.setNextPatient(newPatient);			// should the .getNextPatient be equal to null then our mockPatient pointer will come out of 
															// of the while loop and setPatient & take PARAM that we're passing through in this method
			 //if (firstPatient.getNextPatient() == null)	// NB. since we now need to create a setter, we go back to our Patient class and create a
			//	firstPatient.setNextPatient(newPatient);    // setter method
                                                            // future ref. it may be better to change mockPatient to currentPatient so we know exactly
                                                            // where and at which patient we are looking at
		}
	}
	
	public boolean deletePatient(String name) {				// boolean delete method with PARAM of patient's name that you want to delete
		if (firstPatient == null) {							// check if list is empty 
			return false; 									// we will return false if list is empty
		}
		else if (firstPatient.getName().equals(name)) {		// check fP. name (need to create a getter in Patient class) use .equals(PARAM) cos fP. is a complex type
			firstPatient = firstPatient.getNextPatient(); 	// if we have a name match - move pointer to second position in list
			return true;									// return true
		}
		else {
			Patient mockPatient = firstPatient;				// create mockP. as firstP. 
			while (mockPatient.getNextPatient() != null) {	// use mock.getNextP. != null to iterate through list cos we still want to check last P.
				if (mockPatient.getNextPatient().getName().equals(name)) {	// now check if we have a name match with mockP.
					mockPatient.setNextPatient(mockPatient.getNextPatient().getNextPatient());	// if it does, then set mockP. to become m.gnp.gnp
					return true;																// return true
				}
				mockPatient = mockPatient.getNextPatient();	// if we don't find name - move pointer
			}
			return false;									// we've not found the name in list - we step out of the while loop and return false
		}
	}

	public void toPrint() {									// create toPrint() method, having created a toString() in Patient class 							
		if (firstPatient == null) {							// if you have an empty list i.e. we have no patients in the hospital
			System.out.println("No patients in list!");		// print this 
		}
		else {
			Patient mockPatient = firstPatient;				// set a mock/current to firstPatient 
			while (mockPatient != null) {	                // while mockP isn't null - cos we want to ensure we print out our current mockP. - this
                                                            // also ensures when we reach the end of our list, cos we still print last patient in list
				System.out.println(mockPatient);			// print the mockPatient's details
				mockPatient = mockPatient.getNextPatient();	// iterate through the list
			}                                               // So, mockP is not null, we print, we get to last mP, we print, mockP = mockp.getNP(),
                                                            // mockP = null, we break out of while loop
		}
	}

	public int lengthList() {								// method to calc. length of list - it will return an int 
		//if (firstPatient == null) {						// the code below accounts for even if we have an empty list i.e mP = fP but if fP 
		//	return 0;										// is null then we do not enter the while loop, counter is set to 0, outside of loop
		//}													// counter returns 0

		Patient mockPatient = firstPatient; 				// set mP. to fP.
		int counter = 0;									// initialise a counter
		while (mockPatient != null) {						// while mP. != nulll
			counter ++; 									// counter increases 
			mockPatient = mockPatient.getNextPatient(); 	// move pointer to next pointer
		}
		return counter;										// end of list step out of while loop and return counter - this takes care of an empty list
	}
} // END of class

// NB: Patient object can be compare to Patient objects
// NB: Patient object CAN'T be compared to Strings ie. type Patient CAN'T be compared to type String unless you create a getName() etc. methods
// that return type Strings or ints or whatever you're trying to compare (String-String) or (int-int)
// NB: with else, else if, & if statements remember to have a return type ie. return true etc. - otherwise you'll get a compilation error

/**
code minus the comments: 

public class HospitalManager {
	
	// private Patient[] patientArray = new Patient[90];
	private Patient firstPatient = null;

	public void addPatient(Patient newPatient) {
		if (firstPatient == null) {
			firstPatient = newPatient; 
		}
		else {
			Patient mockPatient = firstPatient;
			while (mockPatient.getNextPatient() != null) {
				mockPatient = mockPatient.getNextPatient();
			}
			mockPatient.setNextPatient(newPatient);
			//if (firstPatient.getNextPatient() == null) {
			//	firstPatient.setNextPatient(newPatient);
		}
	}
	
	public boolean deletePatient(String name) {
		if (firstPatient == null) {
			return false; 
		}
		else if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient(); 
			return true;
		}
		else {
			Patient mockPatient = firstPatient;
			while (mockPatient.getNextPatient() != null) {
				if (mockPatient.getNextPatient().getName().equals(name)) {
					mockPatient.setNextPatient(mockPatient.getNextPatient().getNextPatient());
					return true;
				}
				mockPatient = mockPatient.getNextPatient();
			}
			return false;
		}
	}

	public void toPrint() {
		if (firstPatient == null) {
			System.out.println("No patients in list!");
		}
		else {
			Patient mockPatient = firstPatient;
			while (mockPatient != null) {
				System.out.println(mockPatient);
				mockPatient = mockPatient.getNextPatient();
			}
		}
	}

	public int lengthList() {
		//if (firstPatient == null) {
		//	return 0;
		//}
		Patient mockPatient = firstPatient; 
		int counter = 0;
		while (mockPatient != null) {
			counter ++; 
			mockPatient = mockPatient.getNextPatient(); 
		}
		return counter;
	}
} // END of class
*/