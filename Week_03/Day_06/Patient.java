package Day_06;

/**
 * Dynamic lists are composed of a sequence of complex types in memory, linked by their pointers.
 * In other words, every element in a dynamic list contains one element of information of a certain type
 * (which may be complex) and a pointer to the next element.
 * Let’s use the hospital above to see an example. For the sake of simplicity, we can assume that the hospital only
 * stores three pieces of data about each patient: name, age, and illness.
 *
 * The file Patient.java may be similar to:
 *  public class Patient {
 *  private String name;
 *  private int age;
 *  private String illness;
 *
 *  // methods like constructors, getters // and setters come here...
 *
 *  }
 *
 * And the hospital program (a different file to Patient.java) could have an array of patients:
 * public class HospitalManager {
 *  private Patient[] patientArray = new Patient[90];
 *
 * // methods here to add or remove patients, etc
 *
 * }
 *
 * But, as we already know, this is limited because the hospital may have at a later point more than 90 patients.
 * We can overcome this limitation by using a dynamic data structure, a structure that can change size after creation,
 * e.g. a linked list.
 *
 * Our list will be composed of objects of a slightly modified class Patient:
 *
 * public class Patient {
 *  private String name;
 *  private int age;
 *  private String illness;
 *  private Patient nextPatient;
 *
 *  public Patient(String name, int age, String illness) {
 *      this.name = name;
 *      this.age = age;
 *      this.illness = illness;
 *      this.nextPatient = null; // Pointer to another patient! }
 *
 *  // other methods come here, including getters / setters }
 *
 *  The only difference (but it is important!) is the pointer to another Patient.
 *  A linked list of patients is nothing more than a sequence of patients in which each patient links to the next one,
 *  and the last one points to null.
 *
 *  The starting point of the list will appear in the container class as before, but instead of being a pointer to
 *  an array it will be a pointer to the first element in the linked list:
 *
 * public class HospitalManager {
 *  private Patient firstPatient = null;
 *
 * // other methods come here... }
 *
 * 1 Singly-linked lists
 * Create a linked list following the “hospital and patients” example of the notes:
 * 1. Create the linked list and add several elements to it (around 10 is fine).
 * 2. Go through the list printing out the content of each element.
 * 3. Delete a couple of elements from the list.
 * 4. Print the elements in the list again. Check that the deleted elements have been deleted.
 *
 * Check that you can delete the first element too.
 *
 *
 */


public class Q1_Patient {
    // NB: having fields is a question of composition - meaning you have a class and it contains
    // objects of other classes. having composition tends to be easier to do than inheritance
    // (with abstract classes, parents and children). Composition allows things to be changed
    // more easily in the future.
    private String name;
    private int age;
    private String illness;
    // below create this additional field because we are creating a linked list where each patient will
    // need to point (reference) to the next patient in the list. So now each patient as well as
    // holding information that is personal/specific to them - will also have a reference to the
    // next patient on the list (NB: when creating a doubly linked list you'd also have a
    // private Patient prevPatient field). NB this field is a complex type because Patient is
    // is blue and has a capital P (String, Integer, Double) - complex types
    private Q1_Patient nextPatient;


    // constructor takes the three PARAMs and initialises the private fields to the PARAMs
    public Q1_Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        // below we will set the Pointer to another patient BUT initialise it to null (because it is a
        // complex type) - Q1_Patient nextPatient and NOT patient nextPatient NB: the pointer in the
        // heap is not pointing to anything
        // whereas with simple types you'd want to say what you're initialising them to (0 etc.)
        this.nextPatient = null;
    }


    // when creating a getter method NB: we need a return type because we are trying ot get a
    // value. That method would return ie. String (for a name), int (for age),
    // Patient (for getNextPatient) ie. getNextPatient() --> cos it is a method
    public Q1_Patient getNextPatient() {
        // return the value you're looking for (for ease of communication/learning use this.) - as
        // this is less clearer than the previous line which was: return nextPatient;
        return this.nextPatient;
    }


    // setter method NB: it is void because it is not returning anything
    public void setNextPatient(Q1_Patient nextPatient) {
        this.nextPatient = nextPatient;
    }

    // every object in Java has a toString method that allows you to set how to print
    public String toString() {
        // return String output = "Name: " + name + " Age: " + age + " Illness: " + illness;
        // you call this on your patient object and print PARAMS
        // we can now change the output (PARAMS) like this
        return "Name: " + name + "\nAge: " + age + "\n" + "Illness: " + illness + "\n\n";
    }

    // getter method to get name
    public String getName() {
        return this.name;
    }

} //END of class
