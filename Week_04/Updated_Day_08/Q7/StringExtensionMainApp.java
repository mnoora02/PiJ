package Day_08.Q7;

import java.util.Arrays;

/**
 * Q7.2
 *
 * create our main app
 * we need to obtain the class String
 * lets create a string and get the class on/of that string
 *
 * create an object of type Class, call the object something
 * get the class of our string i.e. call .getClass()
 *
 * we now have a class object and we can get any information on it and from it:
 * - its name
 * - its interface
 * - its constructors
 * - get any declared fields
 * - get declared methods - gives you an array of methods - within each of those methods you could invoke/alter it
 * - get declared fields
 *
 * // print the Array of objects
 * // call .toString() to stringify the Array
 * // in parantheses call stringClass.getDeclaredMethods()
 * System.out.println(Arrays
 *                 .toString(stringClass.getDeclaredMethods()));
 * // you'll need to import.java.util.Arrays
 *
 *
 */

public class StringExtensionMainApp {

    public static void main(String[] args) {
        String s = "";
        Class stringClass = s.getClass();
        System.out.println(Arrays
                .toString(stringClass.getDeclaredMethods()));
        System.out.println("");
        System.out.println(Arrays
                .toString(stringClass.getDeclaredFields()));
    }

}