package Week_10.two;

/**
 * Created by mnoora02 on 08/12/2016.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        // A lambda expression that tests if a number is even.
        //NumericTest isEven;
        //isEven = (n) -> (n % 2) == 0;

        NumericTest isEven = n -> (n % 2) == 0;  // single line declaration and instantiation

        if (isEven.test(10))
            System.out.println("10 is even");
        if (!isEven.test(9))
            System.out.println("9 is not even");

        NumericTest isNonNeg = n -> n >= 0;

        if (isNonNeg.test(1))
            System.out.println("1 is non-negative");
        if (!isNonNeg.test(-1))
            System.out.println("-1 is negative");
    }
}
