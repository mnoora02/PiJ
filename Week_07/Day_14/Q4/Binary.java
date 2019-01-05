package toSort_PiJ_Exercises.Day_14.Q4;

/*
4 Binary search
The most basic example of divide-and-conquer strategies is the binary search. This is used to look for an element
in a sorted list.
We can find an element in a list by traversing through the whole list and checking whether each element is the
one we are looking for. The number of comparisons that we need by using this algorithm is proportional to the
length of the list. If we know that the list is sorted, we can do better with a divide-and-conquer strategy, like the
one defined by repeating these steps:
Initial action: If the list is empty, it does not contain the element and we have finished. If it is not empty,
check the middle element, i.e. the element at list.size()/2. If it is the element we are looking for, we have
finished.
Subproblem: If the element we are looking for is before the middle element, the next list to search into is the
first half of the original list; otherwise, it is the second half.
Integration: No need for integration in this case. Just repeat looking into half-lists until the sublist is only one
element long At that point, either the element is the one we are looking for or the list does not contain it.
Implement a binary search algorithm for a list of integer numbers. The method returns true if the list contains
the element and false otherwise.
You can use the classes in the Java Collection Library. Search for numbers in lists with 10, 100, and 1000
elements; how many comparisons do you need in each case? (Hint: instead on entering manually 1000 elements
in order, maybe you can implement one of the sorting algorithms in the following exercises and then use them
to order a list of random numbers. Remember that you can create a random integer between 0 and N-1 with
Math.abs(N * Math.random()))
 */

import java.util.List;

public class Binary {

    public boolean binarySearch(int n, List<Integer> l){
        if (l.isEmpty()) {
            return false;
        }
        int middle = l.get(l.size()/2);
        if (middle == n) {
            return true;
        } else if (n < middle) {
            return binarySearch(n, l.subList(0,l.size()/2));
        } else {
            return binarySearch(n, l.subList((l.size()/2)+1, l.size()));
        }
    }
}
