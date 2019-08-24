package Day_07;

public class Q1_Person {

    // private fields
    private String name;
    private int age;
    private String idNumber;
    // private field - when creating a linked list we need a pointer to the next obj of type Q1_Person
    private Q1_Person nextPerson;

    // constructor used when creating (in this case) a person
    public Q1_Person(String name, int age, String idNumber) {
        // the usual way of creating a setter
        // this.name = name;
        // creating a setter - later in SDP you will learn to create getters and setters in the constructor
        // like this - cos setName(pass name into it) - minimises overuse of " this.name " or " this.age " etc.
        setName(name);

        // this.age = age;
        setAge(age);

        // this.idNumber = idNumber;
        // and this - setIdNumber(pass idNumber into it)
        setIdNumber(idNumber);

        //this.nextPerson = null;
        // and this where we also initialise nextPerson to be null and pass null as a PARAM
        setNextPerson(null);
    }

    // you are calling the method getNP - so you want to get the next person of type Person
    public Q1_Person getNextPerson() {
        return this.nextPerson;
    }

    // void return type cos you set not get - pass a PARAM is settingPerson of type Person
    // cos we want to pass something into the method that we want to set to.. hence a PARAM
    public void setNextPerson(Q1_Person settingPerson) {
        this.nextPerson = settingPerson;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        // more work is involved doing the following commented out lines (Java will copy, then add, then copy, then add
        // each part of your statement/line - this can be very inefficient with large amounts of data
        // return this.name + ", " + this.age + ", " + this.idNumber;
        // OR return "Name: " + this.name + "\nAge: " + this.age + "\n" + "IDNumber: " + this.idNumber + "\n\n";
        // the Stringbuilder class and its object sb - just add everything to the object and returns it on request
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(", ");
        sb.append(this.age);
        sb.append(", ");
        sb.append(this.idNumber);
        return sb.toString();
    }

} // END of class