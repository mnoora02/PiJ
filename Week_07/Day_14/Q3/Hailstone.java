package toSort_PiJ_Exercises.Day_14.Q3;

/*
The sequence hailstone numbers is defined as follows:
• If the number n is even, the next number is n/2
• If the number is odd, the next number is 3n + 1
It is thought that this sequence always converges to 1 (this is the Collatz conjecture, not demonstrated yet).
Write a method that returns a list of integers (hint: you can use List<Integer> and ArrayList<Integer>)
with the sequence of hailstone numbers that starts at some given natural number provided by the user.
 */

import java.util.ArrayList;
import java.util.List;

public class Hailstone {
    private List<Integer> listOfResults = null;

    public List<Integer> collatz(int n) {
        if (listOfResults == null) {
            listOfResults = new ArrayList<>();
        }

        if (n == 1) {
            return listOfResults;
        }

        if (n % 2 == 0) {
            int result = n / 2;
            listOfResults.add(result);
            return collatz(result);
        } else {
            int result = (3 * n) + 1;
            listOfResults.add(result);
            return collatz(result);
        }
    }
}
