package Week_03.Day_06;

public class DoubleListHospitalManager {
	
	// private Patient[] patientArray = new Patient[90];
	private DoubleListPatient firstPatient = null;

	public void addPatient(DoubleListPatient newPatient) {
		if (firstPatient == null) {							// if list is empty
			firstPatient = newPatient; 						// set fP. to nP. - this doesn't change from signly linked list
		}
		else {
			DoubleListPatient mockPatient = firstPatient;	// set mP. to fP
			while (mockPatient.getNextPatient() != null) {	// while mP.gNP !=null
				mockPatient = mockPatient.getNextPatient();	// mP. becomes the mP.gNP.
			}
			mockPatient.setNextPatient(newPatient);			// set mockP's nextP. to be the newPatient by passing newPatient as a PARAM 
			newPatient.setPrevPatient(mockPatient);			// set newPatient's prev to be mockP by passing mockP. as a PARAM 
		}													// NB: (need to create setter for setPrevPatient)
	}
	
	public boolean deletePatient(String name) {
		if (firstPatient == null) {							// if list is empty
			return false; 									// return false
		}
		else if (firstPatient.getName().equals(name)) {		// if fP. name is a match - we need to delete
			firstPatient = firstPatient.getNextPatient(); 	// fP. becomes our fP.gNP
			firstPatient.setPrevPatient(null);				// what was our second index pos. is now our fP. - we need to set prev pointer to null
			return true;									// return true
		}
		else {
			DoubleListPatient mockPatient = firstPatient;										// set mP. to our fP.
			while (mockPatient.getNextPatient() != null) {										// whilst our mP.gNP != null
				if (mockPatient.getNextPatient().getName().equals(name)) {						// if mP.gNP is a match
					mockPatient.setNextPatient(mockPatient.getNextPatient().getNextPatient());	// we set mP pointer to mP.gNP.gNP 
					mockPatient.getNextPatient().setPrevPatient(mockPatient);					// we use line above to set its prev pointer to mP.
					return true;																// return true
				}
				mockPatient = mockPatient.getNextPatient();										// if name not found we move to next position
			}
			return false;																		// if name not in list we return false
		}
	}

	public void toPrint() {									// method will work for singly & doubly linked lists
		if (firstPatient == null) {
			System.out.println("No patients in list!");
		}
		else {
			DoubleListPatient mockPatient = firstPatient;
			while (mockPatient != null) {
				System.out.println(mockPatient);
				mockPatient = mockPatient.getNextPatient();
			}
		}
	}

	public void printBackwards() {							// print backwards - go through list first - then come back and print along the way
		if (firstPatient == null) {							// if list is null
			System.out.println("No patients in list!");		// do this 
		}
		else {
			DoubleListPatient mockPatient = firstPatient;	// create mP and set it to fP
			while (mockPatient.getNextPatient() != null) {	// whilst mP.gNP != null iterate through list and stop on last pos.
				mockPatient = mockPatient.getNextPatient();	// mP brcomes mP. gNP90
			}
			while (mockPatient != null) {					// now we're at last pos. & whilst mP != null because we still want to print last index pos
				System.out.println(mockPatient);			// print mP. 
				mockPatient = mockPatient.getPrevPatient();	// mP becomes mP.getPrevP (now we need to create a getPrevPatient() getter)
			}
		}
	}

	public int lengthList() {								// method will work for singly & doubly linked lists
		//if (firstPatient == null) {
		//	return 0;
		//}
		DoubleListPatient mockPatient = firstPatient; 
		int counter = 0;
		while (mockPatient != null) {
			counter ++; 
			mockPatient = mockPatient.getNextPatient(); 
		}
		return counter;
	}
} // END of class

// NB: it is only the adding and the deleting methods we wil need to adjust re: prevPointer 
// NB: toPrint() & lengthList() methods will work for both singly & doubly linked lists

/**
code minus the comments: 

public class DoubleListHospitalManager {
	
	// private Patient[] patientArray = new Patient[90];
	private DoubleListPatient firstPatient = null;

	public void addPatient(DoubleListPatient newPatient) {
		if (firstPatient == null) {
			firstPatient = newPatient; 
		}
		else {
			DoubleListPatient mockPatient = firstPatient;
			while (mockPatient.getNextPatient() != null) {
				mockPatient = mockPatient.getNextPatient();
			}
			mockPatient.setNextPatient(newPatient);
			newPatient.setPrevPatient(mockPatient);
		}
	}
	
	public boolean deletePatient(String name) {
		if (firstPatient == null) {
			return false; 
		}
		else if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient(); 
			firstPatient.setPrevPatient(null);
			return true;
		}
		else {
			DoubleListPatient mockPatient = firstPatient;
			while (mockPatient.getNextPatient() != null) {
				if (mockPatient.getNextPatient().getName().equals(name)) {
					mockPatient.setNextPatient(mockPatient.getNextPatient().getNextPatient());
					mockPatient.getNextPatient().setPrevPatient(mockPatient);
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
			DoubleListPatient mockPatient = firstPatient;
			while (mockPatient != null) {
				System.out.println(mockPatient);
				mockPatient = mockPatient.getNextPatient();
			}
		}
	}

	public void printBackwards() {
		if (firstPatient == null) {
			System.out.println("No patients in list!");
		}
		else {
			DoubleListPatient mockPatient = firstPatient;
			while (mockPatient.getNextPatient() != null) {
				mockPatient = mockPatient.getNextPatient();
			}
			while (mockPatient != null) {
				System.out.println(mockPatient);
				mockPatient = mockPatient.getPrevPatient();
			}
		}
	}

	public int lengthList() {
		//if (firstPatient == null) {
		//	return 0;
		//}
		DoubleListPatient mockPatient = firstPatient; 
		int counter = 0;
		while (mockPatient != null) {
			counter ++; 
			mockPatient = mockPatient.getNextPatient(); 
		}
		return counter;
	}
} // END of class
*/