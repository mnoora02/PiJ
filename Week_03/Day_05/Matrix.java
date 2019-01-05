package Week_03.Day_05;/*
4 Creating matrices
Create a class Matrix that has a 2-D array of integers as a field. The class should have methods for:
• a constructor method Matrix(int,int) setting the size of the array as two integers (not necessarily the
same). All elements in the matrix should be initialised to 1.

• a method setElement(int,int,int) to modify one element of the array, given its position (the first two
integers) and the new value to be put in that position (the third integer). The method must check that the
indeces are valid before modifying the array to avoid an IndexOutOfBoundsException. If the indeces are
invalid, the method will do nothing and the third argument will be ignored.

• a method setRow(int,String) that modifies one whole row of the array, given its position as an integer and
the list of numbers as a String like “1,2,3”. The method must check that the index is valid and the numbers
are correct (i.e. if the array has three columns, the String contains three numbers). If the index or the String
is invalid, the method will do nothing.

• a method setColumn(int,String) that modifies one whole column of the array, given its position as an
integer and the list of numbers as a String like “1,2,3”. The method must check that the index is valid and
the numbers are correct (i.e. if the array has four rows, the String contains four numbers). If the index or the
String is invalid, the method will do nothing.

    • a method toString() that returns the values in the array as a String using square brackets, commas, and
    semicolons, e.g. “[1,2,3;4,5,6;3,2,1]”.

• A method prettyPrint() that prints the values of the matrix on screen in a legible format. Hint: you can use
the special character ’\t’ (backslash-t) to mark a tabulator so that all numbers are placed in the same column
regardless of their size. You can think of a tabulator character as a move-to-the-next-column command when
printing on the screen.

Create a Java program that uses all those methods from the Matrix class: creates matrices, modifies its
elements (one-by-one, by rows, and by columns), and prints the matrix on the screeen.
*/

public class Matrix {										// create new class called Matrix
	
	private int[][] array2D; 								// private field of 2-D array of integers NB: you've not made the 2D array yet

	public Matrix(int size1, int size2) {					// constructor with two PARAMS re: size of the array as integers NB: it is public 
															// because IOT to be able to create an object you need to be able to have access 
															// to the constructor. 
		
		array2D = new int[size1][size2];					// create a 2D array kinda like a declaration of {  int[][] array2D = new int[][]  } 
															// NB: to when initialising an array like this you put the size in the square brackets
		
		for (int i = 0; i < size1; i++) {					// fill 2D array by iterating and filling with 1's by going through them columns (int i)
			for (int j = 0; j < size2; j++) {				// fill 2D array by iterating and filling with 1's by going through them rows (int j)
				array2D[i][j] = 1;							// array2D[][] - two sq. brackets 
			}
		}
	}

	public void setElement(int pos1, int pos2, int value) { // a method setElement(int,int,int) to modify one element of the array, given its 
															// position (the first two integers) and the new value to be put in that position 
															// (the third integer). The method must check that the indeces are valid before 
															// modifying the array to avoid an IndexOutOfBoundsException. If the indeces are
															// invalid, the method will do nothing and the third argument will be ignored.
		if (pos1 >= 0 && pos1 < array2D.length 
			&& pos2 >=0 && pos2 < array2D[0].length) {
			array2D[pos1][pos2] = value; 					// if conditions are met then the 2D pos. takes on the value 
		}
	}

	public void setRow(int rowIndex, String values) {		// a method setRow(int,String) that modifies one whole row of the array, given its
															// position as an integer and the list of numbers as a String like “1,2,3”.
															// The method must check that the index is valid and the numbers are correct
															// (i.e. if the array has three columns, the String contains three numbers).
															// If the index or the String is invalid, the method will do nothing.
		if (rowIndex >= 0 && rowIndex < array2D.length) {
			String[] stringArray = values.split(",");       // we need to check our string is correct, find out how many strings by splitting and
                                                            // store that result in an array of strings (cos splitting returns an array of strings)

			if (stringArray.length == array2D[rowIndex].length) {   // check if the length of string array == length of our 2D array, if yes, continue
                                                                    // more specifically, we check the length of the row we are looking at ie. no. of cols

				int[] intArray = new int[stringArray.length];       // cos we're dealing with int's - we convert our string array into an integer array by
                                                                    // initialising an int[] array and setting its length as the same length as our
                                                                    // string array

				for (int i = 0; i < stringArray.length; i++) {      // then we loop thru our string array and up to its length
					int integerised = Integer.parseInt(stringArray[i]); // parse/integerise each string numeric value in the string array in a given idx pos.
					intArray[i] = integerised;              // and assign to each value in our intArray a value from our integerised values (this is not an array)
				}
				array2D[rowIndex] = intArray;               // nb. when inserting entire rows, we can insert entire rows as an array
			}

		}
	}

	public void setColumn(int columnIndex, String values) { // a method setColumn(int,String) that modifies one whole column of the array, given its
                                                            // position as an integer and the list of numbers as a String like “1,2,3”.
                                                            // The method must check that the index is valid and the numbers are correct
                                                            // (i.e. if the array has four rows, the String contains four numbers).
                                                            // If the index or the String is invalid, the method will do nothing.

		if (columnIndex >= 0 && columnIndex < array2D[0].length) {  // almost the same as above but we change/adjust a few bits
			String[] stringArray = values.split(",");       // as above we split into a string array
			if (stringArray.length == array2D.length) {     // this time we don't need to use [] and enter columnIndex because unlike in the above
                                                            // situation where we had to do that, here array.length() in a 2D array returns the number of
                                                            // rows you entered - which is what we want/require here

				int[] intArray = new int[stringArray.length];
				for (int i = 0; i < stringArray.length; i++) {
					int integerised = Integer.parseInt(stringArray[i]);
					intArray[i] = integerised;
				}
				for (int i = 0; i < intArray.length; i++) { // here things will be completely different from the above method. when inserting columns
                                                            // or column values, we need to iterate through each row and add a single value at given
                                                            // idx position (from your intArray to the column idx you are interested in)
                                                            // so we iterate through our intArray.length

					array2D[i][columnIndex] = intArray[i];  // IOT add to our array2D we use two []'s. The first [] will represent our row, the second []
                                                            // will represent the columnIndex and in there we will place/assign a given value from our
                                                            // intArray[i]
				}
			}
		}

	}

	public String toString() {                      // create a method toString() that returns the values in the array as a String using
                                                    // square brackets, commas, and semicolons, e.g. “[1,2,3;4,5,6;3,2,1]”.

        StringBuilder sb = new StringBuilder("[");  // we can begin by initalising the string that we are going to return
                                                    // use StringBuilder, it has methods that you can append to it and build up your
                                                    // string, as you go along and at the end you can return that
                                                    // just as with any class we declare what type it is i.e. StringBuilder and then
                                                    // create an object of it
                                                    // in the () we can state what string we want to place at the beginning of our string output
                                                    // or you can start with a blank string
                                                    // in either case, we start to append to it, finally retruning it once it has completed built up
                                                    // in our case we want each sentence to begin with "[" - so that is what we'll do

                                                    // because we will need to iterate through our string and end up printing our string
                                                    // we will prob. need a double nested for loop (as before - see above).
                                                    // trickiest bit is knowing when to put a comma, semi-colon etc.

		for (int i = 0; i < array2D.length; i++) {  // iterate through our 2D array up to its length
			for (int j = 0; j < array2D[0].length; j++) {   //
				sb.append(array2D[i][j]);           // when we get to an element of interest, we can append that elem at that particular
                                                    // location to our sb (remembering it is a 2D array)
                                                    // thus we append a number

				if (j < array2D[0].length - 1) {    // now we want a comma between each number in the row, so if j (specifically, the number that is here)
                                                    // is less than the size2 -1 (remember size1 represents the number of rows there are, size2
                                                    // represents the number of columns there are) -
                                                    // since, size1 is actually array2D.length()
                                                    // and size2 is in fact array2D[0].length() - the [0] representing the row, then do the
                                                    // length of that row to the number of columns BUT remember to -1 cos we dont' want to
                                                    // include a comma after the last number in any row.
					sb.append(",");                 // so, after each number, we append a comma
				} 
			} 
			if (i < array2D.length - 1) {           // now we jump to the outside for loop because we are need to address what to do at the end
                                                    // of each sentend/row. Cos it is the outside for loop that is the rows, themselves
                                                    // and between each row we want a semi-colon. NB. in the outer for loop we are using i as in index
                                                    // if (i < size1) which is actually (i < array2D.length and don't forget -1 cos we don't
                                                    // want to put a semi-colon after the last row
				sb.append(";");                     // append a semi-colon
			}
		}
		sb.append("]");                             // finally at the end of everything, append a semi-colon,
		return sb.toString();                       // sb.toString() cos
	}

	public void toPretty() {                        // A method prettyPrint() that prints the values of the matrix on screen in a legible format.
                                                    // Hint: you can use the special character ’\t’ (backslash-t) to mark a tabulator so that all
                                                    // numbers are placed in the same column regardless of their size. You can think of a tabulator
                                                    // character as a move-to-the-next-column command when printing on the screen.

                                                    // in some ways this exercise is similar to the above toString method but
                                                    // instead of commas between the numbers, we will have a tab
                                                    // instead of semi-colons between the rows, we will have a print line
                                                    // NB. pretty print only returns the values to the screen and therefore we do not need to worry
                                                    // about using a StrinBuilder or .toString() or anything else to do this exercise.

		for (int i = 0; i < array2D.length; i++) {          // iterate through the columns
			for (int j = 0; j < array2D[0].length; j++) {   // iterate through the rows
				System.out.print(array2D[i][j]);    // to print each value in a 2D array, we give the name of the array and position [i][j] of each value
				if (j < array2D[0].length - 1) {    // we still need to do this cos we need to do a tab after each value, excpept the last value hence -1
					System.out.print("\t");         // so we print a tab to separate each of the elems in each column (and value)
				} 
			} 
			//if (i < array2D.length - 1) {
				System.out.println();               // between ie. at the end of each row, we are printing a new line - we need nothing else
                                                    // cos we are at the end of each row/line. There are no more appends or returning or anything...
			//}
		}
	}

} //END of class 





/*
public class Matrix {										
	
	private int[][] array2D; 								

	public Matrix(int size1, int size2) {						
		array2D = new int[size1][size2];				
		for (int i = 0; i < size1; i++) {				
			for (int j = 0; j < size2; j++) {			
				array2D[i][j] = 1;						
			}
		}
	}

	public void setElement(int pos1, int pos2, int value) {
		if (pos1 >= 0 && pos1 < array2D.length 
			&& pos2 >=0 && pos2 < array2D[0].length) {
			array2D[pos1][pos2] = value; 
		}
	}

	public void setRow(int rowIndex, String values) {
		if (rowIndex >= 0 && rowIndex < array2D.length) {
			String[] stringArray = values.split(",");
			if (stringArray.length == array2D[rowIndex].length) {
				int[] intArray = new int[stringArray.length];
				for (int i = 0; i < stringArray.length; i++) {
					int integerised = Integer.parseInt(stringArray[i]);
					intArray[i] = integerised;
				}
				array2D[rowIndex] = intArray;
			}

		}
	}

	public void setColumn(int columnIndex, String values) {
		if (columnIndex >= 0 && columnIndex < array2D[0].length) {
			String[] stringArray = values.split(",");
			if (stringArray.length == array2D.length) {
				int[] intArray = new int[stringArray.length];
				for (int i = 0; i < stringArray.length; i++) {
					int integerised = Integer.parseInt(stringArray[i]);
					intArray[i] = integerised;
				}
				for (int i = 0; i < intArray.length; i++) {
					array2D[i][columnIndex] = intArray[i];
				}
			}
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");  // use string builder 

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[0].length; j++) {
				sb.append(array2D[i][j]);
				if (j < array2D[0].length - 1) {
					sb.append(",");
				} 
			} 
			if (i < array2D.length - 1) {
				sb.append(";");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	public void toPretty() {
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[0].length; j++) {
				System.out.print(array2D[i][j]); 
				if (j < array2D[0].length - 1) {
					System.out.print("\t");
				} 
			} 
			//if (i < array2D.length - 1) {
				System.out.println();
			//}
		}
	}

} //END of class 

*/










