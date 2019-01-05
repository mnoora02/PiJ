package Week_04.Day_07.Day07_Q1;

public class Person {

	private String name;				// private fields
	private int age; 
	private String idNumber;
	private Person nextPerson;			// private field - when creating a linked list we need a pointer to the next obj of type Person

	public Person(String name, int age, String idNumber) {	// constructor used when creating (in this case) a person
		// this.name = name; 			// the usual way of doin
		setName(name);					// creating a setter - later in SDP you will learn to create getters and setters in the constructor
		// this.age = age;				
		setAge(age);					// like this - cos setName(pass name into it)
		// this.idNumber = idNumber;
		setIdNumber(idNumber);			// and this - setIdNumber(pass idNumber into it)
		//this.nextPerson = null;
		setNextPerson(null);			// and this where we also initialise nextPerson to be null and pass null as a PARAM
	}

	public Person getNextPerson() {		// you are calling the method getNP - so you want to get the next person of type Person
		return this.nextPerson;			// return this....
	}

	public void setNextPerson(Person settingPerson) {	// void return type cos you set not get - pass a PARAM is settingPerson of type Person
		this.nextPerson = settingPerson; 				// cos we want to pass someting into the method that we want to set to.. hence a PARAM
	}

	public String getName() {			
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Override 
	public String toString() {
		// return this.name + ", " + this.age + ", " + this.idNumber;
		StringBuilder sb = new StringBuilder(); 
		sb.append(this.name);
		sb.append(", ");
		sb.append(this.age);
		sb.append(", ");
		sb.append(this.idNumber);
		return sb.toString();
	}


} // END of class