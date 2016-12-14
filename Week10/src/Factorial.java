/**
 * Created by mnoora02 on 12/12/2016.
 */
import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Iterative: " + factorialIterative(10));
        System.out.println("Recursive: " + factorialRecursive(25));
        System.out.println("Stream: " + factorialStream(35));
    }

    public static long factorialIterative(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static long factorialRecursive(int n) {
        return (1 > n) ? 1 : n * factorialRecursive(n-1);
    }

    public static long factorialStream(int n) {
        return LongStream
                .rangeClosed(2,n)
                .reduce(1, (a,b) -> a * b);
    }
}
