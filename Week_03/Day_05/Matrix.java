package Day_05;

/*
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

public class Q4_Matrix {
    // private field of 2-D array of integers NB: you've not made the 2D array yet
    private int[][] array2D;

    // constructor with two PARAMS re: size of the array as integers NB: it is public
    // because IOT to be able to create an object you need to be able to have access
    // to the constructor.
    public Q4_Matrix(int size1_rows, int size2_columns) {

        // create a 2D array kinda like a declaration of {  int[][] array2D = new int[][]  }
        // NB: to when initialising an array like this you put the size in the square brackets
        array2D = new int[size1_rows][size2_columns];

        // fill 2D array by iterating and filling with 1's by going through them columns (int i)
        // fill 2D array by iterating and filling with 1's by going through them rows (int j)
        // array2D[][] - two sq. brackets
        for (int i = 0; i < size1_rows; i++) {
            for (int j = 0; j < size2_columns; j++) {
                array2D[i][j] = 1;
            }
        }
    }

    // a method setElement(int,int,int) to modify one element of the array, given its
    // position (the first two integers) and the new value to be put in that position
    // (the third integer). The method must check that the indices are valid before
    // modifying the array to avoid an IndexOutOfBoundsException. If the indices are
    // invalid, the method will do nothing and the third argument will be ignored.
    public void setElement(int pos1, int pos2, int value) {
        if (pos1 >= 0 && pos1 < array2D.length &&
                pos2 >=0 && pos2 < array2D[0].length) {
            // if conditions are met then the 2D pos. takes on the value
            array2D[pos1][pos2] = value;
        }
    }

    // a method setRow(int,String) - modifies one whole row of the array, given its position as an integer and
    // the list of numbers as a String like “1,2,3”.
    // Method must check that the index is valid and the numbers are correct (i.e. if an array has three columns, the String contains three numbers).
    // If the index or the String is invalid, the method will do nothing.
    // NB. to get the no. of rows in an array do: array.length or as below array2D.length
    public void setRow(int rowIndex, String values) {
        if (rowIndex >= 0 && rowIndex < array2D.length) {
            String[] stringArray = values.split(",");
            // check to see if size of stringArray is equal to the size of the row. To get length of a row in a 2D array
            // array[rowIndex].length - we go to the row we want insert an item on, then find the length of that row
            // i.e. the no. of columns in that row. we then try to fit it in i.e. make sure its length is same as stringArray.length
            if (stringArray.length == array2D[rowIndex].length) {
                // we N2 convert our String[] into an int[] - we N2 pass each element into it
                // intArray is the same length as stringArray but there is nothing in it at the mo.
                int[] intArray = new int[stringArray.length];
                // use for loop to go through each elem in stringArray and integerise each elem. and place that into the
                // int[] we are creating.
                for (int i = 0; i < stringArray.length; i++) {
                    int integerised = Integer.parseInt(stringArray[i]);
                    intArray[i] = integerised;
                }
                array2D[rowIndex] = intArray;
            }
        }
    }

    // a method setColumn(int,String) that modifies one whole column of the array, given its position as an integer and
    // the list of numbers as a String like “1,2,3”.
    // The method must check that the index is valid and the numbers are correct
    // (i.e. if the array has four rows, the String contains four numbers).
    // If the index or the String is invalid, the method will do nothing.
    public void setColumn(int columnIndex, String values) {
        if (columnIndex >= 0 && columnIndex < array2D[0].length) {
            String[] stringArray = values.split(",");
            // NB. in a 2D array when you do array.length you will get back the no. of rows in your 2D array
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

    // a method toString() that returns the values in an array as a String using square brackets, commas & semicolons
    // e.g. “[1,2,3;4,5,6;3,2,1]”.
    @Override
    public String toString() {
        // use StringBuilder, you can write in the () string that you want to write at the beginning / a blank string
        StringBuilder sb = new StringBuilder("[");

        // NB. array2D.length = number of rows (size1 refers to the number of rows)
        // NB. array2D[0].length = number of columns (in the square brackets specify the row no. and get its length)
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {

                // append the number/value you wish to insert at [i][j]
                sb.append(array2D[i][j]);

                // NB. array2D[0].length - 1 cos we do not want a comma after the last no. in a row
                if (j < array2D[0].length - 1) {
                    sb.append(",");
                }
            }
            // jump back to the outside for loop which represents the rows, here we add a semi-colon at the end of a row
            // NB. it is array2D.length - 1 cos we don't want a semi-colon at the end of the last row
            if (i < array2D.length - 1) {
                sb.append(";");
            }
        }
        // add closing ] at the end
        sb.append("]");
        return sb.toString();
    }

    // method prettyPrint() that prints the values of the matrix on screen in a legible format.
    // Hint: you can use the special character ’\t’ (backslash-t) to mark a tabulator so that all numbers are placed in
    // the same column regardless of their size.
    // You can think of a tabulator character as a move-to-the-next-column command when printing on the screen.
    public void toPretty() {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                System.out.print(array2D[i][j]);
                if (j < array2D[0].length - 1) {
                    System.out.print("\t");
                }
            }
            // between each row we want a line
            //if (i < array2D.length - 1) {
            System.out.println();
            //}
        }
    }

    //Q5* one liner matrices
    // Extend your Matrix class with a method setMatrix(String) that takes a String representing the numbers to be
    // put in the elements of the array separated by commas, separating rows by semicolons, e.g. 1,2,3;4,5,6;7,8,9.
    public void setMatrix(String stringMate) {
        String[] rows = stringMate.split(";");
        for (int i = 0; i < rows.length; i++) {
            String singleRow = rows[i];
            String[] elements = singleRow.split(",");
            for (int j = 0; j < elements.length; j++) {
                String singleElem = elements[j].trim();
                int singleNumElem = Integer.parseInt(singleElem);
                // array2D = new int[size1_rows][size2_columns];
                array2D[i][j] = singleNumElem;
            }
        }
    }

} //END of class
