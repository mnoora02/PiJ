package Day_08.Q5;

/**
 * Q5.3
 * Multiple inheritance
 * Lastly, create a class Guitar that is at the same time a musical instrument and a wooden object.
 *
 * How would you do it in Java?
 * Ans: Create the first two as interface cos java supports multiple inheritance of interfaces
 *
 * NB. a table is a wooden object but is not a musical instrument
 */
public class Guitar implements MusicalInstrument, WoodenObject {

    @Override
    public void burn() {
        System.out.println("Burning object..");
    }

    @Override
    public void play() {
        System.out.println("Playing instrument..");
    }

}