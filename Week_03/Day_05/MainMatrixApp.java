package Day_05;

public class Q4_MatrixMainApp {

    public static void main(String[] args) {

        Q4_Matrix runMatrix = new Q4_Matrix(4, 4);
        System.out.println("Base matrix only\n" + runMatrix + "\n");

        runMatrix.setElement(3, 2, 7);
        System.out.println("Set elem. \npos1/index_row = 3 \npos2/index_column = 2 \nvalue = 7\n" + runMatrix + "\n");

        runMatrix.setRow(1, "9,8,7,6");
        System.out.println("Set row: 1 \nvalues = 9, 8, 7, 6 \n" + runMatrix + "\n");

        runMatrix.setColumn(0, "34,56,78,89");
        System.out.println("Set column: 0 \nvalues = 34, 56, 78, 89 \n" + runMatrix + "\n");

        runMatrix.toPretty();
        System.out.println(" ");

        Q4_Matrix runMatrix2 = new Q4_Matrix(3, 3);
        runMatrix2.setMatrix("1, 2, 3; 4, 5, 6; 7, 8, 9");
        runMatrix2.toPretty();
    }
}
