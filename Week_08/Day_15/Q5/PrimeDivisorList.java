package toSort_PiJ_Exercises.Day_15.Q5;

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


public interface PrimeDivisorList {

    void add(Integer i);

}
