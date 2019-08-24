package Day_06;

public class Q3_DblListPatient {
    private String name;
    private int age;
    private String illness;
    // new field for a previous pointer
    private Q3_DblListPatient prevPatient;
    private Q3_DblListPatient nextPatient;

    // constructor method - here we create our doubly linked list data structure
    public Q3_DblListPatient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        // Pointers to previous and next patient!
        this.prevPatient = null;
        this.nextPatient = null;
    }

    public Q3_DblListPatient getNextPatient() {
        return this.nextPatient;
    }

    public void setNextPatient(Q3_DblListPatient nextPatient) {
        this.nextPatient = nextPatient;
    }

    // create new getter for PrevPatient
    public Q3_DblListPatient getPrevPatient() {
        return this.prevPatient;
    }

    // create new setter for PrevPatient
    public void setPrevPatient(Q3_DblListPatient prevPatient) {
        this.prevPatient = prevPatient;
    }

    public String toString() {
        //return String output = "Name: " + name + " Age: " + age + " Illness: " + illness;
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Illness: " + illness + "\n\n";
    }

    public String getName() {
        return this.name;
    }

} //END of class
