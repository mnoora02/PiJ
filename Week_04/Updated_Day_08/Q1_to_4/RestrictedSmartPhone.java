package Day_08.Q1_to_4;

/**
 * Q4.2 Reducing visibility
 * Some parents are concerned that their children spend too much time playing with their smartphones.
 * Create a class RestrictedSmartPhone that overrides playGame(String) to make it private and thus non-visible to
 * external classes and scripts.
 *
 * Is this possible? No
 * Why? Cos the method playGame in the parent classes is a public method. Public is the strongest accessor you can get.
 * The rule is when you go down the hierarchy, if you are overriding methods - you cannot assign weaker access.
 *
 * You can assign stronger access.
 *
 *
 *
 */
public class RestrictedSmartPhone extends SmartPhone {

    // constructor recall it calls the previous constructor
    public RestrictedSmartPhone(String brand) { super(brand); }

    @Override
    // was private - changed to public IOT compile etc.
    public void playGame(String birds) {
        System.out.println("Playing: " + birds);
    }
}