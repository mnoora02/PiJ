package Week_03.Day_05;/*
Q3 cont'd: 
*/
import java.util.Arrays;								// need to import java.util library in order to use Arrays

public class MainArrayCopierApp {
	
	public static void main(String[] args) {			// entry point of our application
		
		ArrayCopier arrayCopier = new ArrayCopier(); 	// create your object (arrayCopier) of type ArrayCopier

		//int[] a = new int[6]							// can also create an array like this with a number to indicate size of array or do...
														// NB: as we are testing to see if something is copying into another correectly it may be 
														// better to use actual values BECAUSE when initialising empty arrays, for example, new int[], 
														// different Java machines may initialise each value differently (0's / -1)
														// thus initialising an array as follows is perhaps a more certain approach
		int[] a = {1, 2, 3, 4, 5}; 						// create an int[] with var name a and list elems in curly braces...
		int[] b = {6, 7, 8, 9, 0};						// create an int[] with var name b

		int[] c = {20, 21, 22};							// create an int[] with var name c
		int[] d = {31, 32, 33, 34, 11, 12, 13, 14};		// create an int[] with var name d


		arrayCopier.copy(a, b);							// arrayCopier.copy - calling/using copy method from ArrayCopier.java which takes 2 PARAMS..
														// which in this case are 2 arrays which we will create above also
		System.out.println(Arrays.toString(b)); 		// print output instead of b, c, d - NB: use Arrays.toString(param) can also do with.. 
														// ArrayList which you convert to an Array first before converting to String
		System.out.println();							

		arrayCopier.copy(a, c);							// src is longer/larger than dst
		System.out.println(Arrays.toString(c));
		System.out.println();

		arrayCopier.copy(a, d);							// src is shorter/smaller than dst
		System.out.println(Arrays.toString(d));
	}


} // END of class


// see also stackoverflow Arrays.toString(list.toArray));