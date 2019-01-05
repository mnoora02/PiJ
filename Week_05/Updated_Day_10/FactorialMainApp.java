package Week_05.Updated_Day_10;/*

2.1 a) Factorial
Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way

*/

public class FactorialMainApp {							// MainApp to run our Factorial 

	public static void main(String[] args) {			// create object of Factorial class - fac
		Factorial fac = new Factorial();				
		//System.out.println(fac.iterative(5));			// call method iterative on our object fac and send in 5 as a PARAM NB: use syst.out.. to get results on screen
		System.out.println(fac.recursive(100));			// call method recursive on our object fac and send in 100 as a PARAM
		System.out.println(fac.tailRecursive(100, 1));	// call method tailRecursive on our object fac and send in 100, 1 as a PARAMs
	}
}