package Day_07;

// Q1_PersonQueue same name as interface hence PersonQueueImpl
// we are implementing the Q1_PersonQueue interface
public class Q1_PersonQueueImpl implements Q1_PersonQueue {
    // private field - a reference the starting point of a list - in this case the head of the queue
    private Q1_Person head;

    // constructor & initialise the head to null (can initialise above in the private field)
    // when we create a new queue there won't be anyone in it - hence, head = null; BUT we still want to create it
    // as an object so that we can create stuff and work with it OR test to see if it is null or not
    public Q1_PersonQueueImpl() {
        head = null;
    }

    public void insert(Q1_Person person) {
        if (head == null) {
            head = person;
        } else {
            // create a current pointer to refer to the head and it to iterate over the list
            // use a for loop when you know how may items ar e in list
            // use a while loop when you don't know
            Q1_Person currentPointer = head;
            while (currentPointer.getNextPerson() != null) {
                currentPointer = currentPointer.getNextPerson();
            }
            currentPointer.setNextPerson(person);
        }
    }

    public Q1_Person retrieve() {
        if (head == null) {
            return null;
        } else {
            // create a new Person object that acts as a pointer to the head, store it, return it,
            // point the object to the second person in the queue
            Q1_Person output = head;
            head = head.getNextPerson();
            return output;
        }
    }

} // END of class