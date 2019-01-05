package Week_03.Day_05;/*
Question: 
2 Checking arrays
Create a new Java class called ArrayChecker with two methods:
isSymetrical(int[ ): ] a method that returns true if the array of int provided as argument is symmetrical and
false otherwise.
reverse(int[ ): ] a method that takes an array of int and returns another array of int of the same size and with
the same numbers, but in opposite order.
Write a Java script that creates an object of class ArrayChecker and uses its methods to check whether a
few arrays are symmetrical and, if they are not, reverses them.
*/

public class ArrayChecker {
	public static void main(String[] args) {
		ArrayChecker pracArray = new ArrayChecker();				// create a an object, pracArray, of type ArrayChecker
		pracArray.launch();											// we call (on pracArray) the launch method because we can't call everything 
																	// else onto a static method that is the PSVM - hence  pracArray.launch 
																	// (this is a non ststic method and you can't call it within a a static 
																	// method without creating a method and calling it)
	}
	public void launch() {											// create a launch method IOT to call it within the PSVM 
		int[] numArray = {12, 14, 16, 111, 16, 14, 12};				// create a symm. int[] and instantiate with {} IOT to test our methods below
		System.out.println(isSymmetrical(numArray));				// print with method as a param plus a param for the method also
		System.out.println();
		int[] numArray2 = {121, 14, 16, 111, 163, 124, 12};			// create an asymm. int[] and instantiate with {} IOT to test our methods below
		System.out.println(isSymmetrical(numArray2));
		System.out.println();
		System.out.println(reverse(numArray).toString());			// run reverse method on first array BUT NB: turn into String - otherwise we'll get the memory address location
		System.out.println();
		System.out.println(reverse(numArray2).toString());			// run reverse method on second array BUT NB: turn into String
	}

	public boolean isSymmetrical(int[] symArray) {					// create a boolean method that takes in an array, called symArray, as a PARAM
		int sizeArray = symArray.length;							// initialise a var, sizeArray, to calculate the size/length of symArray 
		if (sizeArray <= 1) {										// if size of the array is <= 1, then array is symmetrical
			return true;											//  --> return TRUE
		}

		int firstIndexPos = 0;										// create a var for the firstIndexPos and initialise to 0 as this relates 
																	// to the index position
		int lastIndexPos = sizeArray-1;								// create a var for the lastIndexPos and initialise to end of the array-1 
																	// IOT relate to actual index position
																	// if an array holds 5 values the size = 5 and NB: first idx pos = 0 and the last
																	// idx pos. = 4
		while (firstIndexPos <= lastIndexPos) {						// while the firstIndexPos <= lastIndexPos i.e. whilst they're opposite ends
			if (symArray[firstIndexPos] != symArray[lastIndexPos]) {// if the value in the firstIndexPos of symArray != value in lastIndexPos of symArray
				return false;										// then the array is NOT symmetrical therefore return FALSE
			} else {												// else
				firstIndexPos++;									// increment firstIndexPos by +1
				lastIndexPos--;										// decrement lastIndexPos by -1
			}
		} // END while loop											// once firsIndexPos & lastIndexPos are the same/have overlapped, then loop is complete 
		return true;												// go out of the loop and return TRUE
	}

	public int[] reverse(int[] array) {								// initialise a reverse method that takes in an array, called array, as a PARAM
		int sizeArray = array.length;								// initialise a var, sizeArray, to the length of array 
		if (sizeArray <= 1) {										// if size is <= 1, if it is an empty array or has one value then..
			return array;											//  --> return the array 
		}
		int[] output = new int[sizeArray];							// create an array (initialise an array object), called output, and it will be
																	// equal in size to the array (sizeArray) i.e. size of output = size of input
		int lastIndexPos = sizeArray-1;								// create var lastIndexPos and initialise to end of the array-1 
		int outputIndexPos = 0;										// initialise the output index pos. to 0
		while (lastIndexPos >= 0) {									// we want to stop when the lastIndexPos is equal to the 0th pos. until then...
			output[outputIndexPos] = array[lastIndexPos];			// value in the index pos. in output = value held in last index pos. in the array
			outputIndexPos++; 										// increment the output array index pos.
			lastIndexPos--;											// decrement the array's last index pos.
		} // END while loop											// once all values copied - loop ends
		return output;												// return the output array
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