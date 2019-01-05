
/* Day 10 exercise 
1 Recursive code, line by line 
a) What number would the following method print on screen if you called printNumbers(6)?
Do this exercise on paper. Then add this method to a Java Decaf program and check your answer
*/

public void printNumbers(int n) {
	if (n <= 0) {
		return;
	}
	printLine(n);
	printNumbers(n-2);
	printNumbers(n-3);
	printLine(n);
}