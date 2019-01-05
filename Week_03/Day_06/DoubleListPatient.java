package Week_03.Day_06;

public class DoubleListPatient {
	private String name;
	private int age;
	private String illness;
	private DoubleListPatient prevPatient;					// new field for a previous pointer
	private DoubleListPatient nextPatient;	


	public DoubleListPatient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.prevPatient = null;	
		this.nextPatient = null; 							// Pointer to another patient!
	}														// methods like constructors, getters
															// and setters come here...

	public DoubleListPatient getNextPatient() {
		return this.nextPatient;
	}

	public void setNextPatient(DoubleListPatient nextPatient) {
		this.nextPatient = nextPatient;
	}

	public DoubleListPatient getPrevPatient() {					// create new getter for PrevPatient
		return this.prevPatient;
	}

	public void setPrevPatient(DoubleListPatient prevPatient) {	// create new setter for PrevPatient
		this.prevPatient = prevPatient;
	}

	public String toString() {
		//return String output = "Name: " + name + " Age: " + age + " Illness: " + illness;
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Illness: " + illness + "\n\n";
	}

	public String getName() {
		return this.name; 
	}

} //END of class

/**
code minus the comments: 

public class DoubleListPatient {
	private String name;
	private int age;
	private String illness;
	private DoubleListPatient prevPatient;	
	private DoubleListPatient nextPatient;	


	public DoubleListPatient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.prevPatient = null;	
		this.nextPatient = null; 							// Pointer to another patient!
	}														// methods like constructors, getters
															// and setters come here...

	public DoubleListPatient getNextPatient() {
		return this.nextPatient;
		// return nextPatien;
	}

	public void setPrevPatient(DoubleListPatient prevPatient) {
		this.prevPatient = prevPatient;
		// return nextPatien;
	}

	public void setNextPatient(DoubleListPatient nextPatient) {
		this.nextPatient = nextPatient;
		// return nextPatien;
	}

	public DoubleListPatient getPrevPatient() {
		return this.prevPatient;
	}

	public String toString() {
		//return String output = "Name: " + name + " Age: " + age + " Illness: " + illness;
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Illness: " + illness + "\n\n";
	}

	public String getName() {
		return this.name; 
	}
} //END of class
*/