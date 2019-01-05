package toSort_PiJ_Exercises.Day_16.Q2;

import java.io.File;

/**
 2 mkdir
 Write a program that takes a name from the user at the command line and creates a directory with that name.
 Remember that the only argument of method main is an array of Strings, each of them an argument written after
 the name of the class. For example, if you write java myClass this That 0, the elements in args will be three
 strings of values “this”, “That”, and “0”.
 */
public class Q2 {

    public static void main(String[] args) {
        File newDirectory = new File(".\\src\\" + args[0]);
        newDirectory.mkdir();
    }
}
