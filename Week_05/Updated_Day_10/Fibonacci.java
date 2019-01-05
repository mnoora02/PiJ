package Week_05.Updated_Day_10;/*

1a) Recursive code, line by line
What number would the following method print on screen if you called printNumbers(6)?

void printNumbers(int n) {
	if (n <= 0) {
		return;
	}
	printLine(n);
	printNumbers(n-2);
	printNumbers(n-3);
	printLine(n);
}
Do this exercise on paper. Then add this method to a Java program and check your answer.

*/

/*

2.2 b) Fibonacci
Write a small program with a method that calculates the nth element of the Fibonacci sequence as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way.
When doing it recursively, do it with and without memoization. Compare the time that is needed in each case
to find F(40) or F(45).

*/
public class Fibonacci {

	private int[] memo = null;					// for memoisation we will need an int array declared as memo and initialised to null

	public int iterativeFib(int n) {			// iterative method returns an int and takes an int as a PARAM
		int counter = 0;						// declare and initialise a counter
		int firstValue = 0;						// declare and initialise to 0 - a place holder for the first value 
		int secValue = 1;						// declare and initialise to 1 - a place holder for the second value 
		while (counter < n) {					// while loop cos this is iterative set it as counter < n
			int sum = firstValue + secValue;	// sum the first and sec values
			firstValue = secValue;				// make the first val equal to the sec value
			secValue = sum; 					// make the sec val equal to the sum
			counter++;							// increment the counter
		}
		return firstValue;						// outside of loop return the first val 
	}											// this iterative method is/can be faster than the recursive method because it is just going through
												// a while loop, updating two values and when at the end of the whle loop, returning the first val

	public int recursiveNaiveFib(int n) {		// recursive/naive method it returns an int and takes an int as a PARAM
		if (n<=2) {								// base case return 1
			return 1;
		}
		else {
			return recursiveNaiveFib(n-1) + recursiveNaiveFib(n-2);	// (call method on n1) add to (call method on n2)
		}										// this will be slow cos it is doing lots of calc's. (inc. same calc's) multiple times
	}											// imagine we fib(40) = it will fib(39) & fib(38), when we fib(39) --> fib(38) & fib(37)
												// fib(38) = it will fib(37) & fib(36)
												// NB: the repeating no's/calc's. - alot of no's are repeating thus this is a waste of time etc.
												// tho the recursive method looks neater and is easier to read than the iterative method
												// in terms of efficiency it is not great :( at least this version of the rucursiev method

	public int memoFib(int n) {					// memoisation method, returns an int, takes in an int as a PARAM
		if (memo == null) {						// if memo == null, 
			createArray(n);						// we need to instantiate it as createArray() using a private method (below) IOT 
		}										// keep the latter separate from this method

		if (memo[n-1] != -1) {					// if memo(idx.pos. != -1) NB: if size = 5 then idx.pos. = 4 (n-1 ie. 5-1) ie. it holds a value
			return memo[n-1];					// return the value of that idx.pos. 
		}
		else {
			int calc = memoFib(n-1) + memoFib(n-2);	// create a placeholder/int obj. - run the fib. calc'n.
			memo[n-1] = calc;					// then we put the result into that memo[idx.pos.] 
			return calc;						// return the calc'd. value within the else block but at the end
		}										// SO - if we pass 3 into this ie. we want to calc fib(2), it will create the array w/ 3 index pos.
	}											// we have two index positions [0], [1] & [2] --> the first two will have val's of 1 the last -1
												// if memo[n-1] != -1 well it does so...
												// calc memoFib(3),n-1-->(3-1=2)_2, fib(2)-->(2-1=1)_1, fib(1)-->(1-1=0)_0, 
												// calc memoFib(3),n-2-->(3-2=1)_1, fib(1)-->(1-2=-1)_-1, 
												// add the 1+1 = 2
												// fib(3) = 2
												// fib(4) = 3 
												// fib(5) = 5

	private void createArray(int n) {			// private void createArray method (int n will be passed as PARAM in the next line for size)
		memo = new int[n];						// here we initialise the array as memo new int[in the square brackets is the size of array]
												// we pass the size of the array cos we don't want one that is too big/small for what we need
		for (int i = 0; i < n; i++) {			// for loop, i < n cos n is the size of it
			if (i <= 1) {						// if the index pos. no. (NOT the value inside the idx.pos.) is less than or equal to 1
				memo[i] = 1;					// then set/initialise the pos. to 1 i.e. set first two positions memo[0] & memo[1] equal to 1 
			}									// cos in a fib. sequence the first two pos. always hold the value of 1
			else {								
				memo[i] = -1;					// initialise all other idx.pos. equal to -1 ie. set them to hold a value of -1
			}
		}
	}
}

// what we're gonna end up doing is filling the array - ie. if we try to calc. fib(2) - we check array to see if a value has been calc'd. 
// -1 indicates you haven't already calc'd it
// positive 1 does 
// if yes we extract the value - if not, we calc. and add the value to the array 
// in short we are creating a structure that is storing pre-calculated values which makes it quicker and easier 

/*

// Calculating fibonacci - naive recursive algorithm
// probs: exponential time 
fib(n): 
	if (n<=2): f = 1
	else: f = fib(n-1) + fib(n-2)
	return f

// probs with above: exponential time 
T(n) = T(n-1) + T(n-2) + Theta(1)

// make a bad algorithm good through memoisation: linear time
// whenever we compute a fib no. we put it into a dict.
// after that any future calcs will look in dict. for already known no's.
// memoised dynamic program algorithm

memo = {}				// intialise an empty dict.
fib(n): 
	if (n in memo): 	// this time we check dict. for known no's
		return memo[n] 	// if in dict. return the no.
	if (n<=2): f = 1	
	else: f = fib(n-1) + fib(n-2)
	memo[n] = f 		// if we have a new fib. add it to the dict.
	return f

// bottom-up DP algorithm:
// does the same as the memoised algorithm 
// here we're using a loop in the one above it's recursion
// possibly more efficient because we're not using function calls
// can save space
// linear time 

fib = {}				// intialise an empty dict.
for k in range(1 in n+1):
	if (k<=2): f = 1	
	else: f = fib[k-1] + fib[k-2]
	fib[k] = f 		// if we have a new fib. add it to the dict.
	return fib[n]

// shortest paths 
// guess for a solution, try all guesses & take the best one
// recursive algorithm
// v bad - exponential

delta (s, v) = 
				min (delta (s, u) + weight of edge(u, v)) / (u, v) eE

// better to memoise it as seen way above
// still not great/faster though
*/
