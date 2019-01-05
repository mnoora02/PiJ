package toSort_PiJ_Exercises.Day_14.Q7;

import java.util.ArrayList;
import java.util.List;

/**
 7 SortUtils
 SortUtils is another sorting algorithm that also employs a divide-and-conquer strategy. It works well in most usual
 computers because of the low-level interactions between registers and the main memory, which make it very popular
 and widely used.
 You can implement a SortUtils for lists by following the following steps:
 Initial action: If the list contains 0 or 1 element, it is sorted and you can return it. Otherwise, choose one
 element as “pivot” (usually the first one).
 Subproblem: Divide the list into two lists: the first list contains the elements before the pivot (e.g. the integers
 lower than the pivot) and the second one contains the elements after the pivot. Then sort both lists (i.e. apply
 quicksort to each sublist, choosing a new pivot, etc).
 Integration: When both sublists are returned sorted, simply concatenate them (first list, then pivot, then second
 list) and return the result.
 Example with five elements:
 [3, 7, 2, 9, 1]
 [2, 1] 3 [7, 9] (subproblem, pivot: 3)
 [1] 2 [] 3 [7, 9] (subproblem, pivot: 2)
 [1] 2 [] 3 [] 7 [9] (subproblem, pivot: 7)
 [1,2] 3 [] 7, [9] (integration of the sublists of pivot 2)
 [1,2] 3 [7, 9] (integration of the sublists of pivot 7)
 [1,2, 3, 7, 9] (integration of the sublists of pivot 3)

 */
public class SortUtils {

    public static List<Integer> quickSort(List<Integer> numToSort) {
        if (numToSort.size() <= 1) {
            return numToSort;
        } else {
            int pivot = numToSort.get(0);
            List<Integer> lessThan = new ArrayList<>();
            List<Integer> moreThan = new ArrayList<>();
            for (int i = 1; i < numToSort.size(); i++) {
                int value = numToSort.get(i);
                if (value < pivot) {
                    lessThan.add(value);
                } else {
                    moreThan.add(value);
                }
                // boolean b = (value < pivot)? lessThan.add(value) : moreThan.add(value);      // ternary statement needs a look at
            }
            List<Integer> sortedLessThan = quickSort(lessThan);
            List<Integer> sortedMoreThan = quickSort(moreThan);
            sortedLessThan.add(pivot);
            sortedLessThan.addAll(sortedMoreThan);
            // List<Integer> output = Stream.concat(sortedLessThan.stream(), sortedMoreThan.stream()).collect();       // potential streaming sol'n issues w/ pivot which is not a List
            return sortedLessThan;
        }
    }
}
