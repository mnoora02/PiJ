package Week_04.Day_07.Day07_Q1;

public class PersonQueueImpl implements PersonQueue {				// PersonQueue same name as interface hence PersonQueueImpl
	
	private Person head; 											// 

	public PersonQueueImpl() {			// constructor
		head = null;
	}

	public void insert(Person person) {
		if (head == null) {
			head = person;
		} else {
			Person currentPointer = head; 
			while (currentPointer.getNextPerson() != null) {
				currentPointer = currentPointer.getNextPerson();
			} 
			currentPointer.setNextPerson(person);
		}
	}

	public Person retrieve() {
		if (head == null) {
			return null;
		} else {
			Person output = head;
			head = head.getNextPerson();
			return output;
		}
	}

} // END of class 