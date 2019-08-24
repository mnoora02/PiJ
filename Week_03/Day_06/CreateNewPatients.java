package Day_06;

public class Q3_DblPatientMainApp {

    public static void main(String[] args) {

        Q3_DblListPatient fire = new Q3_DblListPatient("Fire", 54, "Flu");
        Q3_DblListPatient water = new Q3_DblListPatient("Water", 24, "Cold");
        Q3_DblListPatient earth = new Q3_DblListPatient("Earth", 94, "Gout");

        Q3_DblListHospitalMngr dblMan = new Q3_DblListHospitalMngr();

        dblMan.addPatient(fire);
        dblMan.addPatient(water);
        dblMan.addPatient(earth);

        // dblMan.toPrint();
        // System.out.println();
        // dblMan.printBackwards();

        dblMan.deletePatient("Fire");
        dblMan.toPrint();
        System.out.println();

        dblMan.printBackwards();

        // anonymous declarations/objects - created inside argument with any PARAMs
        // cos you haven't called it air as we have fire, water etc...
        dblMan.addPatient(new Q3_DblListPatient("Air", 12, "Wind"));

        // delete item not in list - should get false because it didn't find patient
        System.out.println(dblMan.deletePatient("Mud"));
        dblMan.toPrint();
        dblMan.printBackwards();
    }
}
