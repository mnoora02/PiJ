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

public class Q1_PatientMainApp {

    public static void main (String[] args) {

        // Q1_Patient object called bob NB: patient constructor takes 3 PARAMs
        // for clarity can also use patients name as the object as well in lower case..
        Q1_Patient bob = new Q1_Patient("Bob", 34, "Broken Leg");
        Q1_Patient tom = new Q1_Patient("Tom", 25, "Broken Leg");
        Q1_Patient dick = new Q1_Patient("Dick", 78, "Broken Rib");
        Q1_Patient harry = new Q1_Patient("Harry", 31, "1st. Degree Burn");
        Q1_Patient lilith = new Q1_Patient("Lilith", 45, "Smoke Inhalation");
        Q1_Patient lilly = new Q1_Patient("Lilly", 82, "Dog bite");
        Q1_Patient sarah = new Q1_Patient("Sarah", 12, "Anaphylactic shock");
        Q1_Patient jane = new Q1_Patient("Jane", 34, "Breathing difficulties");
        Q1_Patient michaela = new Q1_Patient("Michaela", 31, "Broken arm");
        Q1_Patient andrea = new Q1_Patient("Andrea", 43, "RTA");

        // create a hospital manager object of type hospitalManager with empty parantheses
        // because hospitalManager does not have a constructor with PARAMs
        Q1_HospitalManager hospitalManager = new Q1_HospitalManager();

        // print the length of the list of the
        System.out.println(hospitalManager.lengthList());

        // creating/add a patient object to hospitalManager by passing object as a PARAM as per addPatient method
        hospitalManager.addPatient(bob);
        hospitalManager.addPatient(tom);
        hospitalManager.addPatient(dick);
        hospitalManager.addPatient(harry);
        hospitalManager.addPatient(lilith);
        hospitalManager.addPatient(lilly);
        hospitalManager.addPatient(sarah);
        hospitalManager.addPatient(jane);
        hospitalManager.addPatient(michaela);
        hospitalManager.addPatient(andrea);

        // print the length of the list of the
        System.out.println(hospitalManager.lengthList());

        // print method which needs to be created in the hospitalManager
        hospitalManager.toPrint();

        hospitalManager.deletePatient("Bob");
        hospitalManager.deletePatient("Tom");
        hospitalManager.deletePatient("Andrea");

        System.out.println(hospitalManager.lengthList());

        hospitalManager.toPrint();

    }
} // END of class
