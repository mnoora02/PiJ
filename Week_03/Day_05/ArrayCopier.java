package Day05;

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
public class Q3_ArrayCopier {
    // create a method called copy that takes two int arrays as PARAMs
    public void copy(int[] src, int[] dst) {
        // (src - source array, dst - destination array)
        // int[] output = new int[dst.length]

        // NB: later in SDP - we will learn that the method of copying we have practised here in ArrayCopier
        // is not necessarily good practice because we are taking an a src/dst array that already exists
        // within our application and we are mutating it - you know you're mutating it because you are not
        // returning anything - you're returning void and we are changing one of the parameters
        // often in source code you'll find: (final int[] src, final int[] dst) - this stops you from
        // mutating them
        // far better solution would be to create an entirely new array object within this method
        // and then you'd return that new array object
        // eg. int[] output = new int[dst.length] - output array becomes same length as array of interest
        // and you'd return output at the end just before class END
        // NOT forgetting to write public int copy(int[] src, int[] dst) instead of public void copy...
        // and you'd print output not b,c or d as it is in the MainApp.java right now

        // if the length of the src array is the same size or longer than the length of the dst array
        // then we go as far as the dst.length and fill in the values from src to dst
        if (src.length >= dst.length) {
            for (int i = 0; i < dst.length; i++) {
                dst[i] = src[i];
            }
        } else {
            // if src array is shorter than the dst array
            // assign dst index positions values as 0s first before we copy from src
            for (int i = 0; i < dst.length; i++) {
                dst[i] = 0;
            }
            // cont'd (src array is shorter than dst array)
            // dst index positions will be filled with values from src index positions and as per
            for (int i = 0; i < src.length; i++) {
                dst[i] = src[i];
                // the previous loop - outstanding dst index positions will have been filled with 0's
            }
        }
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
