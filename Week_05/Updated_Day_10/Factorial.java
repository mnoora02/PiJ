package Week_05.Updated_Day_10;/*

2.1 a) Factorial
Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way

*/

public class Factorial {			// create class - gonna create both iterative and recursive methods

	public int iterative(int n) {	// iterative approach - you use some kind of loop (while or for etc..) it will take an int n as a PARAM
		if (n <= 0) {				// create this safety for loop cos if 0 was entered in we'd - our counter 
			return 1;
		}
		int output = 1;				// declare an int (which will be our output) and initialise to 1 as factorials always start at 1 - outside of our loop 
		int counter = 1;			// declare and initialise a counter to 1 because  - again outside of our loop
		while (counter <= n) {		// while the counter is less than or equal to n
			output = output * counter;	// the we multiply the output by the counter, hence start/initialise counter at 1 (starting at 0 will only yield 0)
			counter++;				// then increment the counter - and we loop around again
		}
		return output;				// return our output a.k.a. the result - outside of the loop
	}								

	public int recursive(int n) {	// recursive approach - you call the same method over and over again - again passing int n as a PARAM
		if (n <= 0) {				// create a base case i.e. if n <= 0 return 1
			return 1;
		}
		else {
			return n * recursive(n-1);	// we do n multiplied by recursive n-1 and then return it 
		}							// probs. with recursive method/solutions:
	}								// the machine is needs to remember n, then does a recursive call, when it comes back from a recursive call 
									// it needs to calc. n by what it returned this means it needs to keep a stack trace or it needs to keep a 
									// stack of all the values of n being calculated 
									// - usually when it gets to really large numbers in recursive solutions like this is you can get a 
									// stack overflow error where it goes beyond the stack - this is one downside

	public int tailRecursive(int n, int acc) {	// with tail recursive you can get around the above with int n but also int acc (for accumulator) - 
												// when running this program and especially when doing recursion you will start your acc as 1
												// NB: this method is doing the call to itself and returning the result - it is not doing additional work 
		if (n <= 0) {							// base case
			return acc;							// return you accumulator (when running in main set acc to 1)
		} else {
			return tailRecursive(n-1, acc * n);	// return tailRecursive (so we're calling it again) and we do n-1 (same as above but with the acc 
		}										// we're keeping track of the result, thus far.  So we're multiplying the acc. by the value of n 
	}											// the calculations call all be put on the same stack - thus eliminating a stackoverflow
}												// so imagine we wanted to find the factorial of 5 and run the prog. tailRecursive(5, 1)
												// -->	the next call would be tailRecursive(n5-1 = 4, acc1 * 5 = 5) so the acc is now 5
												// --> n4-1 = 3, acc5 * 4 = 20 
												// the acc keeps a track of your output saving the machine from setting a stack/memory to do the same
												// thus making things lighter and easier to deal with