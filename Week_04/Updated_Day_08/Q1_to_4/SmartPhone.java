package Day_08.Q1_to_4;
/**
 Q1.3 *Then create a class SmartPhone that extends MobilePhone and adds methods for
        browseWeb(String)
        and
        findPosition(), the latter returning a(fictitious)GPS-found position.
 */

/**
 Q2 Overriding
 Save money by routing your international calls through the internet!
 Modify your class SmartPhone so that it overrides the method call(String) inherited from OldPhone.
 If the string parameter starts with “00”, the method should output

 “Calling <number> through the internet to save money”;

 otherwise, the method should do the same as the original method (hint: use super).

 could use charAt() - a character at a given index position i.e. charAt(0) == "0" && charAt(1) == "0"
 or
 substring() - returns a String that is a substring of what you give it - specify a beginning index and an end index
 e.g. "hamburger" .substring(4, 8) --> will return "u", "r" and "g"
 */

/**
 * Q3: Passing information to ancestor classes
 * In class MobilePhone - we already have a constructor in which we already have this.lastNumbersDialled = ...
 * and we need to:
 *      1: recall the rule when extending from a class we always call the constructor of the superclass first
 *          i.e. in the first line of the constructor
 *      2: NB. pass in params from the extended class constructor i.e. String brand
 *
 *      3: do same for SmartPhone class but we will need to create a constructor there with param etc.
 */

public class SmartPhone extends MobilePhone {

    // constructor
    public SmartPhone(String brand) { super(brand); }

    public void browseWeb(String browse) {
        System.out.println("Browsing: " + browse);
    }

    public void findPosition() {
        System.out.println("GPS is: 2344 1246 1234 N");
    }

    @Override
    public void call(String number) {
        // doing super.call(number) will add the number to our lastNumbersDialled list
        super.call(number);
        if (number.substring(0, 2).equals("00")) {
            System.out.println(" through the internet to save money");
        }
    }
}
