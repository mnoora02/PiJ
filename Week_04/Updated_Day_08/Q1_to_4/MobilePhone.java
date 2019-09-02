package Day_08.Q1_to_4;

/**
 * Q1.2 Now create a class MobilePhone that extends OldPhone and adds methods for things like:
 *      ringAlarm(String)
 *      and
 *      playGame(String)
 *
 * This class keeps a list of the last ten numbers that have been called,which can be printed with the method
 *      printLastNumbers().
 */


/**
 * Q3 cont'd: Passing information to ancestor classes
 * After adding the following field, constructor, and method to OldPhone:
 *
 *      private String brand = null;
 *
 *      public OldPhone(String brand) { this.brand = brand; }
 *
 *      public String getBrand() { return brand; }
 *      // ... there is no setter for brand
 *
 *
 * The method getBrand() is public.
 * However, NB. the private field String brand = null;
 * And brand only gets instantiated when we call the constructor of class OldPhone.
 * So what? When we create SmartPhone we are not calling the constructor of any other class other than its own (if it has one).
 *
 * First we need to go to MobilePhone - here we already have a constructor in which we already have this.lastNumbersDialled = ...
 * and we need to:
 *      1: recall the rule when extending from a class we always call the constructor of the superclass first
 *          i.e. in the first line of the constructor
 *      2: NB. pass in params from the extended class constructor i.e. String brand
 *      3: do same for SmartPhone class but we will need to create a constructor there with param etc.
 *
 */

/**
 * Q4.1 Increasing visibility
 * Change the visibility of playGame(String) to private and check whether the script you wrote in the former
 * exercise still works.
 * Why does this happen? No it doesn't - cos of visibility - things that are private can only be accessed by methods
 * of that class - not by classes/objects outside of that class.
 * What are the minimal changes that you need to make on class SmartPhone so that the script still works? Minimal change
 * is either change the method back to public or class SmartPhone has its own playGame() method.
 *
 */

import java.util.List;
import java.util.ArrayList;

public class MobilePhone extends OldPhone {
    private List<String> lastNumbersDialled;

    // constructor method in q3 takes a PARAM with its return type
    // first line - calling constructor from super class
    public MobilePhone(String brand) {
        super(brand);
        // instantiate lastNumbersDialled as an ArrayList
        this.lastNumbersDialled = new ArrayList<String>();
    }

    public void ringAlarm(String alarm) {
        System.out.println("Ringing: " + alarm);
    }

    public void playGame(String birds) {
        System.out.println("Playing: " + birds);
    }

    public void printLastNumbers() {
        // System.out.println(this.lastNumbersDialled);
        // for (int i = 0; i < lastNumbersDialled.size(); i++) {
        //		System.out.println(lastNumbersDialled.get(i));
        // enhanced for loop version:
        for (String s : lastNumbersDialled) {
            System.out.println(s);
        }
        // lastNumbersDialled.forEach(s -> System.out.println(s)); // lambda expression
        // in situations where you have 1 item/object and you are calling a method that takes 1 param as well you can
        // eliminate the param i.e. s and do the following:
        // call the class System.out :: followed by the method println
        // lastNumbersDialled.forEach(System.out::println);		// anonymous expression
    }

    /** call method exists in class OldPhone but it cannot see down the hierarchy to this class MobilePhone. To add
     *  called/dialled numbers to our list of lastNumberDialled we need to use the call method here and override it
     *
     *  class OldPhone and its call method is:
     *  public void call(String number) {
     *          System.out.println("Calling " + number);
     *  }
     */
    @Override
    public void call(String number) {
        super.call(number);
        // add numbers in reverse order, give an index number and each number will be added at that index position plus the number
        this.lastNumbersDialled.add(0, number);
        // if our list goes beyond size ten remove the last number from the given index position
        if (lastNumbersDialled.size() > 10) {
            lastNumbersDialled.remove(10);
        }
    }

} //