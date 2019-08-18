package Day05;

        import java.util.Arrays;

public class Q3_MainApp {

    // entry point for our ArrayCopier - we will create an object of type copier and we will use the copy method on it
    //
    public static void main(String[] args) {
        Q3_ArrayCopier arrayCopier = new Q3_ArrayCopier();

        //int[] a = new int[input a number for the size of the array];
        // create an int[] with var name a and list elems in curly braces...
        int[] a = {1, 2, 3, 4, 5};

        // int[] b = new int[5];  <- we are initialising an array with 5 slots NB diff't JVM initialise arrays differently
        // some might initialise with 0's others with -1 others with an empty array or some may come up with a error
        // therefore it is better to test things out with actual values
        // create an int[] with var name b
        int[] b = {6, 7, 8, 9, 0};

        // create an int[] with var name c
        int[] c = {20, 21, 22};

        // create an int[] with var name d
        int[] d = {31, 32, 33, 34, 35, 11, 12, 13};

        // arrayCopier.copy - calling/using copy method from ArrayCopier.java which takes 2 PARAMS..
        // which in this case are 2 arrays which we will create above also
        // src is same length as dst
        System.out.println("a = [1, 2, 3, 4, 5] \nb = [6, 7, 8, 9, 0]\nwhen copied\no = " + Arrays.toString(arrayCopier.copy(a, b)));
        System.out.println();

        // print output instead of b, c, d - NB: use Arrays.toString(param) can also do with..
        // ArrayList which you convert to an Array first before converting to String

        // src is longer/larger than dst
        System.out.println("a = [1, 2, 3, 4, 5] \nc = [20, 21, 22]\nwhen copied\no = " + Arrays.toString(arrayCopier.copy(a, c)));
        System.out.println();

        // src is shorter/smaller than dst
        System.out.println("a = [1, 2, 3, 4, 5] \nd = [31, 32, 33, 34, 11, 12, 13, 14]\nwhen copied\no = " + Arrays.toString(arrayCopier.copy(a, d)));

    }
} // END of class


// see also stackoverflow Arrays.toString(list.toArray));
