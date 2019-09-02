package Day_08.Q1_to_4;

/**
 * Q1.1: Extension, extension. . .
 * Create a class OldPhone that implements the following interface.

 public interface Phone {
 Just print on the screen: "Calling <number>...".
 void call(String number);
 }
 */


/**
 * Q3: Passing information to ancestor classes
 * Add the following field, constructor, and method to OldPhone:
 *
 *      private String brand = null;
 *
 *      public OldPhone(String brand) { this.brand = brand; }
 *
 *      public String getBrand() { return brand; }
 *      // ... there is no setter for brand
 *
 * Add the appropriate constructors to MobilePhone and SmartPhone in order to be able to call the method getBrand()
 * from an object of class SmartPhone and obtain the right answer, i.e. the brand provided in the constructor.
 *
 * once we write the above into the constructor for the OldPhone - the implications for the child classes (MobilePhone
 * & SmartPhone) are:
 *      1 - we will need to change class MobilePhone & class SmartPhone cos
 *
 * We now have a method in class OldPhone called getBrand().
 * And both class MobilePhone & SmartPhone can also call getBrand() cos they inherit from OldPhone.
 *
 * The method getBrand() is public.
 * However, NB. the private field String brand = null;
 * And brand only gets instantiated when we call the constructor of class OldPhone.
 * So what? When we create SmartPhone we are not calling the constructor of any other class other than its own (if it has one).
 *
 * First we need to go to MobilePhone - here we already have a constructor and we need to
 *      1:
 *      2:
 *      3:
 *
 */

public class OldPhone implements Phone {
    private String brand = null;

    // constructor
    public OldPhone(String brand) { this.brand = brand; }

    public String getBrand() { return brand; }

    // ... there is no setter for brand - cos we are essentially setting the brand when we are creating it
    // once the brand of a phone is established it doesn't change in its lifetime - so we don't need to change it
    // therefore no need for a setter

    public void call(String number) {
        System.out.println("Calling " + number);
    }
}


