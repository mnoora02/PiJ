package Week_05.Day_10;

public class Factorial {

	private int num;
	private int num2;

	public int getFactorial(int num) {
		if (num == 2) {
			return num;
		}
		else {
			return num * getFactorial(num - 1);
		}
	}
		
}