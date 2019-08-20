// this MainApp file was previously called QuestionFourMain.java

package Day05;

public class Q4_MatrixMainApp {

    public static void main(String[] args) {

        Q4_Matrix runMatrix = new Q4_Matrix(4, 4);
        System.out.println("Base matrix only\n" + runMatrix + "\n");

        runMatrix.setElement(3, 2, 7);
        System.out.println("Set elem. pos1/index_row = 3, pos2/index_column = 2, value = 7\n" + runMatrix + "\n");

        runMatrix.setRow(1, "9,8,7,6");
        System.out.println("Set row: 1\n" + runMatrix + "\n");

        runMatrix.setColumn(0, "34,56,78,89");
        System.out.println("Set column: 0\n" + runMatrix + "\n");

        runMatrix.toPretty();
    }
}
