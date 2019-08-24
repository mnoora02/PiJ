package Day_07;

public class Q1_SupermarketMainApp {

    public static void main(String[] args) {

        Q1_Person tom = new Q1_Person("Tom", 18, "Abc");
        Q1_Person dick = new Q1_Person("Dick", 28, "Def");
        Q1_Person harry = new Q1_Person("Harry", 38, "Ghi");

        Q1_Supermarket asdus = new Q1_Supermarket();
        asdus.addPerson(tom);
        asdus.addPerson(dick);
        asdus.addPerson(harry);

        System.out.println(asdus.servePerson());
        System.out.println(asdus.servePerson());
        System.out.println(asdus.servePerson());
    }

} // END of class