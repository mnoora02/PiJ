package Day_07;

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
 */

public class Q5_HashUtilities {
    // NB. clue in the above notes - we are are not creating an object of type HashUtilities
    // we are accessing the method shortHash directly --> HashUtilities.shortHash therefore the method must be static
    // anything that is static is a member of the actual class itself - meaning we do not need to create an object of
    // that class to call, for example, a given method - it is a method of the class itself
    public static int shortHash(int shortie) {
        return Math.abs(shortie % 1000);
    }

} // END of class