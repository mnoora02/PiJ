package Day_07;

import java.util.Scanner;

/**
 * 5.1 Hash function
 * Create a class HashUtilities that implements a simple hash function shortHash(int) that takes any integer
 * and returns an integer between 0 and 1000.
 *
 * You can use the modulo operator and the static function Math.abs(int) for obtaining the absolute value of an integer.
 *
 * Note that shortHash(int) is a pure function (it does not have any side effects), so it should be static.
 * Then you can call this method using the name of the class like HashUtilities.shortHash(int).
 * Every object in Java has the method hashCode(), that returns an int.
 *
 * Test your hash function by passing the hash codes of different objects and verifying that it always returns
 * a number between 0 and 1000, as in the following example:
 *
 *      println "Give me a string and I will calculate its hash code";
 *      String str = System.console().readLine();
 *      int hash = str.hashCode();
 *      int smallHash = HashUtilities.shortHash(hash);
 *      System.out.println("0 < " + smallHash + " < 1000");
 *
 * Needs fixing - should work but getting NPE
 */

public class Q5_HashMainApp {

    public static void main(String[] args) {
        System.out.println("Give me a string and I'll calc. its hash code: ");
        //String str = System.console().readLine();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int hash = str.hashCode();
        int smallHash = Q5_HashUtilities.shortHash(hash);
        System.out.println("0 < " + smallHash + " < 1000");
    }
    // NB. above in the original code String str = System.console().readLine() returns an NPE when used inside an IDE
    // Solution 1: create a Scanner object followed by a next string object and carry on
    // Solution 2: Use a BufferedReader object and an InputStremReader
    // see also: https://stackoverflow.com/questions/4644415/java-how-to-get-input-from-system-console for details
}