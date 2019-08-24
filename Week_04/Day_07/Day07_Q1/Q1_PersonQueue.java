package Day_07;

/**
 *
 * 1 Supermarket queue
 * Use the interface PersonQueue that represents a queue of people waiting at the supermarket and then implement it.
 * You can use the definition and the implementations of StringStack as a guide.
 * You can reuse any version of class Person from past days.
 *
 * For example, depending on your implementation, you may want to use a version of Person with or without internal pointers.

 * public interface PersonQueue {
 * // Adds another person to the queue.
 * * void insert(Person person);
 *
  * // Removes a person from the queue.
    *Person retrieve();
    *}

 * Then create a class Supermarket that has two methods:
 * addPerson(Person)
 * and
 * servePerson().
 *
 * These methods must call the appropriate methods of Q1_PersonQueue.
 */

public interface Q1_PersonQueue {

    // adds a person
    // this method contains a PARAM person of type Person - telling you need to create a class Person
    void insert(Q1_Person person);

    // retrieve a person
    // this method has a return of type Person
    Q1_Person retrieve();

} // END of interface class

