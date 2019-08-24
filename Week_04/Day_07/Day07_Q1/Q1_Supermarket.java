package Day_07;

public class Q1_Supermarket {

    // its type will be PersonQueue and name personQueue - this will allow Supermarket to access it
    // NB: PersonQueue here is equal to null. Sol'n: we can initialise it either here as..
    // (private PersonQueue personQueue=null) or (as is the case) below in the constructor
    private Q1_PersonQueue personQueue;

    // now we have a reference to a PersonQueue obj (personQueue) - we can create a
    // constructor and use the obj. to fill out our two methods and we initialise our PersonQueueImpl
    // NB: constructors do no have a return type
    // on this occasion we do not need to pass anything in but we do want to create/initialise
    // our personQueue obj hence --> this.personQueue = new PersonQueueImpl
    // remembering that we cannot create objects using interfaces but only classes hence we will need
    // to create a PersonQueueImpl class which implements interface PersonQueue
    public Q1_Supermarket() {
        this.personQueue = new Q1_PersonQueueImpl();
    }

    // PARAM is of type Person - again you need a class Person
    // the details for these methods must be created ie. in PersonQueue
    // NB: remember Supermarket is not an interface - hence we must provide actual details for them
    // and it is within these (to be created) methods that we call the appropriate methods of ie.
    // PersonQueue
    // the normal way to do this is 1) supermarket needs to call methods on PersonQueue which means
    // that Supermarket needs to have access to an obj. of type PersonQueue, somehow...
    // NB: remember PersonQueue does not extend Supermarket (nor is PersonQueue a type of Supermarket)
    // but Supermarket can contain a queue of Persons - this then becomes a question of composition
    // what seems to fit best/make sense depending on the context of what your program needs to do
    // hence the need to create a field as above on line 5
    // .insert is in the interface which is accessed via the PersonQueueImpl
    public void addPerson(Q1_Person joePublic) {
        this.personQueue.insert(joePublic);
    }

    // return type is Person but could be void depending on what is required - here we will return
    public Q1_Person servePerson() {
        return this.personQueue.retrieve();
    }

} // END of class

/**
 * without comments:
 *
public class Q1_Supermarket {
    private Q1_PersonQueue personQueue;

    public Q1_Supermarket() {
        this.personQueue = new Q1_PersonQueueImpl();
    }

    public void addPerson(Q1_Person joePublic) {
        this.personQueue.insert(joePublic);
    }

    public Q1_Person servePerson() {
        return this.personQueue.retrieve();
    }

} // END of class
 */