package Day_05;

/*
Question:
2 Checking arrays
Create a new Java class called Q2_ArrayChecker with two methods:
isSymmetrical(int[ ): ] a method that returns true if the array of int provided as argument is symmetrical and
false otherwise.
reverse(int[ ): ] a method that takes an array of int and returns another array of int of the same size and with
the same numbers, but in opposite order.
Write a Groovy script that creates an object of class Q2_ArrayChecker and uses its methods to check whether a
few arrays are symmetrical and, if they are not, reverses them.
*/

import java.util.Arrays;

public class Q2_ArrayChecker {

    public static void main(String[] args) {
        // create a an object, pracArray, of type Q2_ArrayChecker
        Q2_ArrayChecker pracArray = new Q2_ArrayChecker();
        // we call (on pracArray) the launch method because we can't call everything
        // else onto a static method that is the PSVM - hence  pracArray.launch
        // (this is a non static method and you can't call it within a a static
        // method without creating a method and calling it)
        pracArray.launch();
    }

    // create a launch method IOT to call it within the PSVM
    public void launch() {
        // create a symmetrical int[] and instantiate with {} IOT to test our methods below
        int[] numArray = {12, 14, 16, 111, 16, 14, 12};
        // print with method plus a param for the method also
        System.out.println("numArray [12, 14, 16, 111, 16, 14, 12] is symmetrical: " + isSymmetrical(numArray));
        System.out.println();

        // create an asymmetrical int[] and instantiate with {} IOT to test our methods below
        int[] numArray2 = {120, 130, 140, 150, 160, 170, 180, 190};
        System.out.println("numArray2 [120, 130, 140, 150, 160, 170, 180, 190] is symmetrical: " + isSymmetrical(numArray2));
        System.out.println();

        // run reverse method on first array BUT NB: turn into String - otherwise we'll get the memory address location
        // NB. in Java ArrayLists need to be turned into Arrays then turned into Strings - we already have Arrays so
        // we just need to Stringify them - and that is all and print it out of course
        System.out.println(
                "reverse numArray \n[12, 14, 16, 111, 16, 14, 12] : \n" + Arrays.toString(reverse(numArray)));
        //System.out.println(reverse(numArray).toString());
        System.out.println();

         // run reverse method on second array BUT NB: turn into String
        System.out.println(
                "reverse numArray2 \n[120, 130, 140, 150, 160, 170, 180, 190] : \n" + Arrays.toString(reverse(numArray2)));
        // System.out.println(reverse(numArray2).toString());
    }

    // create a boolean method that takes in an array, called symArray, as a PARAM
    public boolean isSymmetrical(int[] symArray) {
        // initialise a var, sizeArray, to calculate the size/length of symArray
        int sizeArray = symArray.length;

        // if size of the array is <= 1, then array is symmetrical --> return TRUE
        if (sizeArray <= 1) {
            return true;
        }

        // create a var for the firstIndexPos and initialise to 0 represents zero-eth index position
        int firstIndexPos = 0;
        // create a var for the lastIndexPos and initialise to size of array-1 represents last index position
        int lastIndexPos = sizeArray-1;

        // if an array holds 5 values the size = 5 and NB: first idx pos = 0 and the last
        // idx pos. = 4
        // while the firstIndexPos <= lastIndexPos i.e. whilst they're opposite ends
        while (firstIndexPos <= lastIndexPos) {
            // if the value in the firstIndexPos of symArray != value in lastIndexPos of symArray - it is NOT symmetrical - return FALSE
            if (symArray[firstIndexPos] != symArray[lastIndexPos]) {
                return false;
            } else {
                // increment firstIndexPos by +1 and also decrement lastIndexPos by -1
                firstIndexPos++;
                lastIndexPos--;
            }
            // once firsIndexPos & lastIndexPos are the same/have overlapped, then loop is complete
        } // END while loop
        // go out of the loop and return TRUE
        return true;
    }

//    public int extractMidValue(int[] valuesArray) {
//        int
//    }

    // initialise a reverse method that takes in an array, called array, as a PARAM
    public int[] reverse(int[] array) {
        // initialise a var, sizeArray, to the length of array
        int sizeArray = array.length;

        // if size is <= 1, if it is an empty array or has one value then --> return the array
        if (sizeArray <= 1) {
            return array;
        }

        // initialise the output index pos. to 0
        int indexPos = 0;
        // create var lastIndexPos and initialise to end of the array-1
        int lastIndexPos = sizeArray-1;

        // create an array (initialise an array object), called output, and it will be
        // equal in size to the array (sizeArray) i.e. size of output = size of input
        int[] output = new int[sizeArray];

        // we want to stop when the lastIndexPos is equal to the 0th pos. until then...
        while (lastIndexPos >= 0) {
            // value in the index pos. in output = value held in last index pos. in the array
            output[indexPos] = array[lastIndexPos];
            // increment the output array index pos. and decrement the array's last index pos.
            indexPos++;
            lastIndexPos--;
            // once all values copied - loop ends
        } // END while loop
        // return the output array
        return output;
    }

}

/*
		if (firstElem == lastElem) {
			return true;
		} else {
			return false;
		}
		// alt. write of the above return firstElem == lastElem;
*/
