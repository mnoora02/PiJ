package Day_08.Q5;

/**
 * Q5.1
 * Multiple inheritance
 * Create a class MusicalInstrument with a method play().
 * Now create another class WoodenObject with a method burn().
 * Create a class Guitar that is at the same time a musical instrument and a wooden object.
 *
 * How would you do it in Java?
 * Ans: Create the first two as interface cos java supports multiple inheritance of interfaces
 */

public interface MusicalInstrument {
    void play();
}
