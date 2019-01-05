package toSort_PiJ_Exercises.Day_15.Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 4 More patients
 Write a class that asks for data (name and year of birth) about new patients in a hospital and keeps them in a list
 of Patient. The constructor of Patient must throw an IllegalArgumentException if the age of the patient is
 negative or greater than 130.
 */

public class MorePatients {
    public static void main(String[] args) {
        List<Patient> hospital_patients = new ArrayList<>();

        boolean finished = false;

        while(!finished) {
            System.out.println("Do you wish to add a new patient: Y / N ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();


            //if(answer.equals("Y") || answer.equals("y")){
            if(answer.toLowerCase().equals("y")){
                System.out.println("Enter patient name: ");
                String name = sc.next();

                System.out.println("Enter patient age: ");
                int age = sc.nextInt();

                Patient newPatient = new Patient(name, age);

                hospital_patients.add(newPatient);
            }
            else {
                finished = true;
            }
        }
    }
}
