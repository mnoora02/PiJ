package Week_03.Day_05;

/*
3 Copying arrays
Create a new Java class called ArrayCopier with a method called copy that takes two arrays of integers as parameters.
The method should copy the elements of the first array (you can call it src, from “source”) to the second
one (dst, from “destination”) as much as possible.
If the second array is smaller, then only those elements that fit will be copied. If the second array is larger, it
will be filled with zeroes.
Write a Java script that creates an object of class ArrayCopier and uses its copy method to copy some arrays
in all three cases:
• Both arrays are of the same size.
• The source array is longer.
• The source array is shorter.
*/
public class ArrayCopier {							
	public void copy(int[] src, int[] dst) {		// create a method called copy that takes two int arrays as PARAMs 
													// (src - source array, dst - destination array)

		//int[] output = new int[dst.length]		// NB: later in SDP - we will learn that the method of copying we have practised here in ArrayCopier
													// is not necessarily good practice because we are taking an a src/dst array that already exists 
													// within our application and we are mutating it - you know you're mutating it because you are not
													// returning anything - you're returning void and we are changning one of the parameters
													// often in source code you'll find: (final int[] src, final int[] dst) - this stops you from 
													// mutating them
													// far better solution would be to create an entirely new array object within this method 
													// and then you'd return that new array object
													// eg. int[] output = new int[dst.length] - output array becomes same length as array of interest
													// and you'd return output at the end just before class END
													// NOT forgetting to write public int copy(int[] src, int[] dst) instead of public void copy...
													// and you'd print output not b,c or d as it is in the MainArrayCopierApp.java right now

		if (src.length >= dst.length) {				// if the length of the src array is the same size or longer than the length of the dst array
			for (int i = 0; i < dst.length; i++) {	// then we go as far as the dst.length and fill in the values from src to dst
				dst[i] = src[i];
			} 
		} else {
			for (int i = 0; i < dst.length; i++) {	// if src array is shorter than the dst array
				dst[i] = 0;							// assign dst index positions values as 0s
			}
			for (int i = 0; i < src.length; i++) {	// cont'd (src array is shorter than dst array)
				dst[i] = src[i];					// dst index positions will be filled with values from src index postions and as per 
													// the previous loop - outstanding dst index positions will have been filled with 0's
			}										// there must be a more efficient way of doing the above - cos we are going through the dst array
		}											// assigning each idx pos with a value of 0 and then going thru dst array again and assigning a src value
		//return output;
	}
} // END of class
/*	****BELOW is the original code prior to refactoring - NB: the excess/extra code)
		if (src.length == dst.length) {
			for (int i = 0, i < dst.length, i++) {
				dst[i] = src[i];
			} 
		} else if (src.length > dst.length) { 
			for (int i = 0, i < dst.length, i++) {
				dst[i] = src[i];
			}
		} else {
			for (int i = 0, i < dst.length, i++) {
				dst[i] = 0;
			}
			for (int i = 0, i < src.length, i++) {
				dst[i] = src[i];
*/