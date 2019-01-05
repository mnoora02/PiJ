package toSort_PiJ_Exercises.Day_20_George;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mnoora02 on 22/12/2016.
 */

// Q3. (a) Given a list of numbers, how would you return a list of the square of each number? For
// example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25].

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream().map(e -> e*e).collect(Collectors.toList());
        System.out.println(squares);

        List<Integer> odds = numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
        System.out.println(odds);

        // 3 (b) Given two lists of numbers, how would you return all pairs of numbers? For example,
        // given a list [1, 2, 3] and a list [3, 4] you should return
        // [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]
        // For simplicity, you can represent a pair as an array with two elements
        List<Integer> listOne = Arrays.asList(1, 2, 3);
        List<Integer> listTwo = Arrays.asList(3, 4);

        //List<List<Integer>> listOflist = listOne.stream()
        //        .map(v1 -> (Stream.of(listTwo).map(v2 -> Arrays.asList(v1, v2))).collect(Collectors.toList()))
        //        .flatMap()
        //        .collect(Collectors.toList());
        // System.out.println(listOflist);

        List<int[]> pairs =
                listOne.stream()
                        .flatMap(i -> listTwo.stream()
                                .map(j -> new int[]{i, j})
                        )
                        .collect(Collectors.toList());
        pairs.forEach(p -> System.out.println(printArray(p)));
        System.out.println();

        // Q4 . How would you extend the previous example to return only pairs whose sum is divisible by 3?
        // For example, (2, 4) and (3, 3) are valid.

        List<int[]> divThree = pairs.stream()
                .filter(a -> (a[0] + a[1]) % 3 == 0)
                .collect(Collectors.toList());
        divThree.forEach(p -> System.out.println(printArray(p)));
    }

    private static String printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int v : array) {
            sb.append(v);
            sb.append(" ");
        }
        return sb.toString();
    }

}
