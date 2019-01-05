package Week_10.three;

/**
 * Created by mnoora02 on 08/12/2016.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        // This lambda expression determines if one number is
        // a factor of another.
        NumericTest isFactor = (n, d) -> (n % d) == 0;


        if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        if (!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
    }
}
