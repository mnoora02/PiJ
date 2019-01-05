package Week_03.Day_05;// this MainApp file was previously called QuestionFourMain.java

public class MainMatrixApp {

	public static void main(String[] args) {

		Matrix runMatrix = new Matrix(4, 4); 	// create our matrix and remember in the constructor we stated that
												// it takes two parameters telling java we want a 2D array cols x rows

		System.out.println(runMatrix);			// we can test that the matrix cells are all initialised to 1

		runMatrix.setElement(3, 2, 7);
		runMatrix.setRow(1, "9,8,7,6");
		runMatrix.setColumn(0, "34,56,78,89");  //
		//runMatrix.toString();
		runMatrix.toPretty();
		System.out.println();


	}
}