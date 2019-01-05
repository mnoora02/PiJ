package toSort_PiJ_Exercises.Day_15.Q4;

/**
 4 More patients
 Write a class that asks for data (name and year of birth) about new patients in a hospital and keeps them in a list
 of Patient. The constructor of Patient must throw an IllegalArgumentException if the age of the patient is
 negative or greater than 130.
 */

public class Patient {
    private String name;
    private int age;

    public Patient(String constr_name, int constr_age) {
        this.name = constr_name;
        if(constr_age < 0 || constr_age > 130) {
            throw new IllegalArgumentException("Age cannot be less than 0 or greater than 130yrs");
        }
        this.age = constr_age;
    }
}
