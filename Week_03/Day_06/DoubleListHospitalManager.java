package Day_06;

public class Q3_DblListHospitalMngr {
    // private Patient[] patientArray = new Patient[90];
    private Q3_DblListPatient firstPatient = null;

    public void addPatient(Q3_DblListPatient newPatient) {
        // if list is empty
        if (firstPatient == null) {
            // set fP. to nP. - this doesn't change from singly linked list
            firstPatient = newPatient;
        }
        else {
            // set mP. to fP
            Q3_DblListPatient currentPatient = firstPatient;
            // while mP.gNP !=null
            while (currentPatient.getNextPatient() != null) {
                // mP. becomes the mP.gNP.
                currentPatient = currentPatient.getNextPatient();
            }
            // set mockP's nextP. to be the newPatient by passing newPatient as a PARAM
            currentPatient.setNextPatient(newPatient);
            // set newPatient's prev to be mockP by passing mockP. as a PARAM
            newPatient.setPrevPatient(currentPatient);
            // NB: (need to create setter for setPrevPatient in DblListPatient class)
        }
    }

    public boolean deletePatient(String name) {
        // if list is empty return false
        if (firstPatient == null) {
            return false;
        }
        // if fP. name is a match - we need to delete
        else if (firstPatient.getName().equals(name)) {
            // fP. becomes our fP.gNP
            firstPatient = firstPatient.getNextPatient();
            // what was our second index pos. is now our fP. - we need to set prev pointer to null
            firstPatient.setPrevPatient(null);
            // return true
            return true;
        }
        else {
            // set mP. to our fP.
            Q3_DblListPatient currentPatient = firstPatient;
            // whilst our mP.gNP != null
            while (currentPatient.getNextPatient() != null) {
                // if mP.gNP is a match
                if (currentPatient.getNextPatient().getName().equals(name)) {
                    // we set mP pointer to mP.gNP.gNP
                    currentPatient.setNextPatient(currentPatient.getNextPatient().getNextPatient());
                    // we use line above to set its prev pointer to mP.
                    currentPatient.getNextPatient().setPrevPatient(currentPatient);
                    // return true
                    return true;
                }
                // if name not found we move to next position
                currentPatient = currentPatient.getNextPatient();
            }
            // if name not in list we return false
            return false;
        }
    }

    // method will work for singly & doubly linked lists
    public void toPrint() {
        if (firstPatient == null) {
            System.out.println("No patients in list!");
        }
        else {
            Q3_DblListPatient currentPatient = firstPatient;
            while (currentPatient != null) {
                System.out.println(currentPatient);
                currentPatient = currentPatient.getNextPatient();
            }
        }
    }

    // print backwards - go through list first - then come back and print along the way
    public void printBackwards() {
        // if list is null - do this
        if (firstPatient == null) {
            System.out.println("No patients in list!");
        }
        else {
            // create mP and set it to fP
            Q3_DblListPatient currentPatient = firstPatient;
            // whilst mP.gNP != null iterate through list and stop on last pos.
            while (currentPatient.getNextPatient() != null) {
                // mP brcomes mP. gNP90
                currentPatient = currentPatient.getNextPatient();
            }
            // now we're at last pos. & whilst mP != null because we still want to print last index pos
            while (currentPatient != null) {
                // print mP.
                System.out.println(currentPatient);
                // mP becomes mP.getPrevP (now we need to create a getPrevPatient() getter)
                currentPatient = currentPatient.getPrevPatient();
            }
        }
    }

    // method will work for singly & doubly linked lists
    public int lengthList() {
        //if (firstPatient == null) {
        //	return 0;
        //}
        Q3_DblListPatient currentPatient = firstPatient;
        int counter = 0;
        while (currentPatient != null) {
            counter ++;
            currentPatient = currentPatient.getNextPatient();
        }
        return counter;
    }
} // END of class

// NB: it is only the adding and the deleting methods we wil need to adjust re: prevPointer
// NB: toPrint() & lengthList() methods will work for both singly & doubly linked lists
