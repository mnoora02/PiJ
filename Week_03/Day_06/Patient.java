package Week_03.Day_06;/*
Singly-linked lists
Create a linked list following the “hospital and patients” example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again. Check that the deleted elements have been deleted. Check that you can
delete the first element too.
 */

public class Patient {
    private String name;                                    // NB: having fields is a question of composition - meaning you have a class and it contains
    // objects of other classes. having composition tends to be easier to do than inheritance
    // (with abstract classes, parents and children). Composition allows things to be changed
    // more easily in the future.
    private int age;
    private String illness;
    private Patient nextPatient;                            // create this additional field because we are creating a linked list where each patient will
    // need to point (reference) to the next patient in the list. So now each patient as well as
    // holding information that is personal/specific to them - will also have a reference to the
    // next patient on the list (NB: when creating a doubly linked list you'd also have a
    // private Patient prevPatient field). NB this field is a complex type because Patient is
    // is blue and has a capital P (String, Integer, Double) - complex types

    // constructor method
    public Patient(String name, int age, String illness) {    // constructor with the same name as class but minus 'class' and minus return type
        this.name = name;                                    // constructor takes the three PARAMs and initialises the private fields to the PARAMs
        this.age = age;                                        // that are being passed through
        this.illness = illness;                             // NB. the keyword 'this' refers to the class itself, so this.name refers to the
        // private field we created above -> private String name; so when we say this.name = name then
        // we are stating that the class 'name' (private String name) refers to 'name' which
        // in turn refers to the 'name' parameter being passed in
        // if we do not use 'this' then the program will look for 'name within its local scope which
        // will only be the String name being passed in thru the constructor class

        // Alternatively, we could, change the constructor String name to String patientName,
        // instead of using this.name we could use name = patientName
        // in this case java will look for 'name' and find it in the global scope of a private field
        // Better to use 'this' cos java always starts looking for variable within the local scope before
        // looking further out (i.e. global). Failure to use 'this.' i.e. we just say name = name will
        // result in a local assignment within a local scope (put another way, java will not get a chance
        // to look globally and therefore assign the global variable/field correctly.

        this.nextPatient = null;                            // initialise the Pointer to another patient BUT initialise it to null (because it is a
        // complex type) - Patient nextPatient and NOT patient nextpatient NB: the pointer is not
        // pointing to anything in the heap
        // whereas with simple types you'd want to say what you're initialising them to (0 etc.)
        // NB. you can't initialise simple types to null cos they don't have pointers pointing
        // to anywhere on the heap
        // It is good practice to initialise variables to something cos depending no your java machine
        // your variable may get initialised to something you did not intend i.e. -1 or 0 etc.
    }

    public Patient getNextPatient() {                        // when creating a getter method NB: we need a return type because we are tyring ot get a
        // value. That method would return ie. String (for a name), int (for age),
        // Patient (for getNextPatient) ie. getNextPatient() --> cos it is a method
        return this.nextPatient;                            // return the value you're looking for (for ease of communication/learning use this.) - as
        // return nextPatient;								// <--- this is less clearer than the previous line
    }                                                        //


    public void setNextPatient(Patient nextPatient) {        // setter method NB: it is void because it is not returning anything
        this.nextPatient = nextPatient;                        // this.nextPatient = our PARAM
    }

    public String toString() {                                // every object in Java has a toString method that allows you to set how to print
        //return String output = "Name: " + name + " Age: " + age + " Illness: " + illness;
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Illness: " + illness + "\n\n"; // you call this on your patient object and print PARAMS
    }                                                        // we can now change the output (PARAMS) like this
    // NB. the toString() method always goes in the class it is printing from cos it
    // needs to access the fields it is printing from
    // If, on the other hand, you want a toPrint method that prints out the whole list of
    // patients, then we need to think first which class this method needs to go in and write
    // it there (it can't be in the Patient class cos a patient does not know about any other
    // patien - it just know info about itself. As we try to keep as much of the logic outside
    // of our Main app - it's reasonable to think we should not put it there. This leaves the
    // HosptialManager class which is where we should write it.)

    public String getName() {                                // getter method to get name
        return this.name;                                    // return this.name
    }

} //END of class


/**
 * code minus the comments:
 * <p>
 * public class Patient {
 * private String name;
 * private int age;
 * private String illness;
 * private Patient nextPatient;
 * <p>
 * <p>
 * public Patient(String name, int age, String illness) {
 * this.name = name;
 * this.age = age;
 * this.illness = illness;
 * this.nextPatient = null; 							// Pointer to another patient!
 * }														// methods like constructors, getters
 * // and setters come here...
 * <p>
 * public Patient getNextPatient() {
 * return this.nextPatient;
 * // return nextPatient;
 * }
 * <p>
 * public void setNextPatient(Patient nextPatient) {
 * this.nextPatient = nextPatient;
 * // return nextPatient;
 * }
 * <p>
 * public String toString() {								// a toString method that sends to Java and prints out what is stated see below:
 * //return String output = "Name: " + name + " Age: " + age + " Illness: " + illness;
 * return "Name: " + name + "\n" + "Age: " + age + "\n" + "Illness: " + illness + "\n\n";
 * }
 * <p>
 * public String getName() {
 * return this.name;
 * }
 * } //END of class
 */