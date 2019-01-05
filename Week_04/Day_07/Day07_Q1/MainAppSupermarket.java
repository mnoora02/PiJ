package Week_04.Day_07.Day07_Q1;

public class MainAppSupermarket {

	public static void main(String[] args) {

		Person tom = new Person("Tom", 18, "Abc");
		Person dick = new Person("Dick", 28, "Def");
		Person harry = new Person("Harry", 38, "Ghi");

		Supermarket asdus = new Supermarket(); 
		asdus.addPerson(tom);
		asdus.addPerson(dick);
		asdus.addPerson(harry);

		System.out.println(asdus.servePerson());
		System.out.println(asdus.servePerson());
		System.out.println(asdus.servePerson());
	}

} // END of class