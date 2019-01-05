package toSort_PiJ_Exercises.Day_14.Q6;

/*
6 Mergesort
Mergesort is a popular sorting algorithm that employs a divide-and-conquer strategy. You can implement a Mergesort
for lists by following the following steps:
Subproblem: If the list contains 0 or 1 element, it is sorted and you can return it. If not, then divide the list
into two lists of the same length (± 1). Then sort the lists (i.e. apply mergesort to each sublist).
Integration: When both sublists are returned sorted, check the first element of both sublists; remove the one
that comes first (e.g. the lowest integer of the two) and add it to the result list. Repeat this process until all
elements in both sublists have been added to the result list. Return the result list.
Example with five elements:
[3, 7, 2, 9, 1]
[3, 7, 2] [9, 1] (subproblem)
[3, 7] [2] [9] [1] (subproblem)
[3] [7] [2] [9] [1] (subproblem)
[3, 7] [2] [9] [1] (integration of [3] and [7])
[2, 3, 7] [9] [1] (integration of [3, 7] and [2])
[2, 3, 7] [1, 9] (integration of [9] and [1])
[1, 2, 3, 7, 9] (integration of [2, 3, 7] and [1, 9])
 */

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public List<Integer> mergeSort(List<Integer> list) {
        //if (list.isEmpty() || list.size() == 1)
        if (list.size() <= 1) {
            return list;
        }
        List<Integer> subListA = mergeSort(list.subList(0, list.size()/2));
        List<Integer> subListB = mergeSort(list.subList(list.size()/2, list.size()));
        List<Integer> resultList = new ArrayList<>();

        while(!subListA.isEmpty() && !subListB.isEmpty()) {
            if (subListA.get(0) < subListB.get(0)) {
                resultList.add(subListA.get(0));
                subListA = subListA.subList(1, subListA.size());
            } else {
                resultList.add(subListB.get(0));
                subListB = subListB.subList(1, subListB.size());
            }
        }
        if (subListA.isEmpty()) {
            resultList.addAll(subListB);
        } else {
            resultList.addAll(subListA);
        }
        return resultList;
    }


}
