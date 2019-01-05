package Week_05.Updated_Day_10;

public class FibonacciMainApp {
	
	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci();
		System.out.println(fib.iterativeFib(45));
		//System.out.println(fib.recursiveNaiveFib(45));	// will run slow due to exponential time to n i.e. a big num takes longer to calc.
		System.out.println(fib.memoFib(5));
	}
}