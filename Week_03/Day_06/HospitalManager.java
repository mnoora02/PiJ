package Day_06;

/**
* 1 Singly-linked lists
        * Create a linked list following the “hospital and patients” example of the notes:
        * 1. Create the linked list and add several elements to it (around 10 is fine).
        * 2. Go through the list printing out the content of each element.
        * 3. Delete a couple of elements from the list.
        * 4. Print the elements in the list again. Check that the deleted elements have been deleted.
        *
        * Check that you can delete the first element too.
*/

public class Q1_HospitalManager {

    // private Patient[] patientArray = new Patient[90];
    // we could create a patient array but this will be a fixed size ie. 90
    // or we create a a linked list and have field that references the first patient in the
    // list which is initialised to null because it is a complex type
    // we're creating a private field firstPatient of type Patient (ie. Patient class)
    // initialised to null because (complex type) at start we have no patients in our hospital
    // the structure of the linked list is in Patient class which contains the values (name,
    // age, illness) and a link to the next patient
    // in the HospitalManager we're gonna construct the structure which is why we need the
    // field firstPatient of type Patient to refer back to the Patient class as it will be our
    // initial entry point into the list
    // design decision - you have a hospital and patients. Each patient has a link to the next
    // patient because we want to create a linked list BUT in terms of the methods ie. say we
    // want to add a patient; should that be the responsibility of the patients class or the
    // HospitalManager class? It depends on how you want to design it...
    // NB: in the Patient class we initialised the fields via a constructor - remember we declared
    // private fields and then initialised them in the constructor
    // whereas here we have initialised and declared in the same line (no constructor is needed)
    // because every time we create a HospitalManager - it will be created with no patients in.
    // we can create/declare the firsPatient and set/initialise it to null
    private Q1_Patient firstPatient = null;


    // create an addPatient method that takes a PARAM newPatient of type Patient
    public void addPatient(Q1_Patient newPatient) {
        // when creating addPatient method, we will need to see if there is a nextPatient and then
        // access nextPatient information through a getter (therefore we need to create a getter in our
        // Patient class) because all of our fields are private we need to create accessor methods
        // - getters (to get values) and setters (to change values) methods
        // Check & see if list is empty ie. no patients in hospitals
        if (firstPatient == null) {
            firstPatient = newPatient;
        }
        else {
            // create temp object holding value(s) of firstPatient and use that to iterate from beginning of list
            Q1_Patient currentPatient = firstPatient;
            // while our pointer is not at end of list
            while (currentPatient.getNextPatient() != null) {
                // our pointer moves to the next position
                currentPatient = currentPatient.getNextPatient();
            }
            // should the .getNextPatient be equal to null then our currentPatient pointer will come out of
            // of the while loop and setPatient & take PARAM that we're passing through in this method
            // if (firstPatient.getNextPatient() == null)
            //	firstPatient.setNextPatient(newPatient);
            currentPatient.setNextPatient(newPatient);
        }
    }

    // boolean delete method with PARAM of patient's name that you want to delete
    public boolean deletePatient(String name) {
        // check if list is empty
        if (firstPatient == null) {
            // return false if patient's name not found
            return false;
        }
        // check fP. name (need a getter in Patient class) use .equals(PARAM) cos fP. is a complex type
        else if (firstPatient.getName().equals(name)) {
            // if we have a name match - move pointer to second pointer in list
            firstPatient = firstPatient.getNextPatient();
            // return true
            return true;
        }
        else {
            // create mock/currentPatient as firstP.
            Q1_Patient currentPatient = firstPatient;
            // use mock.getNextP. != null to iterate through list cos we still want to check last P.
            while (currentPatient.getNextPatient() != null) {
                // now check if we have a name match with mockP.
                if (currentPatient.getNextPatient().getName().equals(name)) {
                    // if it does, then set mockP. to become m.gnp.gnp
                    currentPatient.setNextPatient(currentPatient.getNextPatient().getNextPatient());
                    // return true
                    return true;
                }
                // if we don't find name - move pointer
                currentPatient = currentPatient.getNextPatient();
            }
            // we've not found the name in list - we step out of the while loop and return false
            return false;
        }
    }

    // create toPrint() method, having created a toString() in Patient class
    public void toPrint() {
        // if you have an empty list
        if (firstPatient == null) {
            // print this message
            System.out.println("No patients in list!");
        }
        else {
            // set a mock/current to firstPatient
            Q1_Patient currentPatient = firstPatient;
            // while mockP isn't null - cos we want to ensure we print out our current mockP.
            while (currentPatient != null) {
                // print the currentPatient's details
                System.out.println(currentPatient);
                // iterate through the list
                currentPatient = currentPatient.getNextPatient();
            }
        }
    }

    // method to calc. length of list - it will return an int
    public int lengthList() {
        //if (firstPatient == null) {						// the code below accounts for even if we have an empty list i.e mP = fP but if fP
        //	return 0;										// is null then we do not enter the while loop, counter is set to 0, outside of loop
        //}													// counter returns 0

        // set mP. to fP.
        Q1_Patient currentPatient = firstPatient;
        // initialise a counter
        int counter = 0;
        // while mP. != nulll
        while (currentPatient != null) {
            // counter increases
            counter ++;
            // move pointer to next pointer
            currentPatient = currentPatient.getNextPatient();
        }
        // end of list step out of while loop and return counter - this takes care of an empty list
        return counter;
    }
} // END of class

// NB: Patient object can be compare to Patient objects
// NB: Patient object CAN'T be compared to Strings ie. type Patient CAN'T be compared to type String unless you create a getName() etc. methods
// that return type Strings or ints or whatever you're trying to compare (String-String) or (int-int)
// NB: with else, else if, & if statements remember to have a return type ie. return true etc. - otherwise you'll get a compilation error
