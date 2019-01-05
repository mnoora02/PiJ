package Week_05.Updated_Day_10;/*

1b)
Do you see anything wrong with the following code? How would you fix it?

String buggyMethod(int n) {
	if (n == 0) {
		return "";
	}
	return n + " " + buggyMethod(n - 2);
}

*/

public class RecursiveMain {

	public static void main(String[] args) {
		printNums(6);
	}

	public static void printNums(int n) {	// needs to be static or you'll get the following message: "non-static method printNums(int) cannot be referenced from a static context"
		if (n <= 0) {
			return;
		}
		System.out.println(n);
		printNums(n-2);
		printNums(n-3);
		System.out.println(n);
	}
}