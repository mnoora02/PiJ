package Week_05.Day_10;
/* Day 10 exercise 
1 Recursive code, line by line 
a) What number would the following method print on screen if you called printNumbers(6)?
Do this exercise on paper. Then add this method to a Java Decaf program and check your answer
*/


public class PrintNumbers {
	private int n;
	
	public static void main(String[] args){

		PrintNumbers printNumbers = new PrintNumbers();

		

		public printNumbers(int n) {
			if (n <= 0) {
				return n;
			}
			System.out.println(n);
			
			printNumbers(n-2);
			
			printNumbers(n-3);
			
			System.out.println(n);
		}
	}
}