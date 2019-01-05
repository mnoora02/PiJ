package toSort_PiJ_Exercises.Day_15.Q3a;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 3 Error handling on user input
 a)
 Write a program that reads 10 numbers from the user and then prints the mean average. If the user inputs
 something that is not a number, the program should complain and ask for a number again until 10 numbers have
 been introduced.
 b)
 Modify the program so that it first asks how many numbers the user wants to enter, and then asks for the numbers.
 The computer should complain if the user enters something that is not a number in both cases. Use methods to
 prevent code repetitions.

 */
public class NumberReader {
    public static void main(String[] args) {
        System.out.println("How many numbers? ");
        int testNum = (int) runReader(1);
        System.out.println("now enter your numbers: ");
        System.out.println("mean = " + runReader(testNum));
    }

    public static double runReader(int inputs) {
        int total= 0;
        int counter = 0;

        while (counter < inputs) {
            try {
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                total = total + i;
                counter++;
            } catch (InputMismatchException e){
                System.out.println("pls. enter a number: ");
            }
        }
        return (double)total/inputs;

    }
}
