/* 

Day 5 Exercise 2 Copying arrays
Create a new Java class called ArrayCopier with a method called copy that takes two arrays of integers as parameters.
The method should copy the elements of the first array (you can call it src, from “source”) to the second
one (dst, from “destination”) as much as possible.
If the second array is smaller, then only those elements that fit will be copied. If the second array is larger, it
will be filled with zeroes.
Write a program that creates an object of this class and uses this method to copy some arrays in all three cases:
• Both arrays are of the same size.
• The source array is longer.
• The source array is shorter.

*/


public class ArrayCopier {
	public void copy(int[] src, int[] dst){
		if (src.length == dst.length) {
			copyEqualSize(src, dst);
		} else if (src.length > dst.length) {
			copyLongerSource(src, dst);
		} else {
			copyShorterSource(src, dst); 
		}
	}
	public void copyEqualSize(int[] src, int[] dst) {
		for (int i = 0; i < args.length; i++) {
			dst[i] = src[i]
		}
	}
	pub
}