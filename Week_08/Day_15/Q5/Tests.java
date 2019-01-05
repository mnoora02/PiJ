package toSort_PiJ_Exercises.Day_15.Q5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 5 Prime divisors
 Create a class PrimeDivisorList. Integers (as in class Integer) can be added to / removed from the list. If a
 null number is passed to the add(Integer) method, a NullPointerException must be thrown. If a non-prime
 number is added, an IllegalArgumentException must be thrown.
 Override the method toString() so that it returns something like:
 [ 2 * 3^2 * 7 = 126 ]
 for a list containing one 2, two 3, and one 7.
 Use the TDD methodology to create the class (interface, tests,implementation). You can base your class on
 classes and interfaces from the Java Collections Library.
 */

public class Tests {

    private PrimeDivisorList list;

    @Before
    public void init() {
        list = new PrimeDivisorListImpl();
    }

    @Test (expected = NullPointerException.class)
    public void testPassingNullThrowsNullPointerException(){
        list.add(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPassingNonPrimeThrowsIllegalArgumentException(){
        list.add(10);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPassing1ThrowsIllegalArgumentException(){
        list.add(1);
    }

    @Test
    public void testToStringOnEmptyList() {
        assertEquals("[]", list.toString());
    }

    @Test
    public void testSingleElementInListWithToString() {
        list.add(2);
        assertEquals("[ 2 = 2 ]", list.toString());
    }


    @Test
    public void testTwoElementsInListWithToString() {
        list.add(2);
        list.add(3);
        assertEquals("[ 2 * 3 = 6 ]", list.toString());
    }

    @Test
    public void testExponentsInListWithToString() {
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(3);
        assertEquals("[ 2 * 3^2 * 7 = 126 ]", list.toString());
    }
}
