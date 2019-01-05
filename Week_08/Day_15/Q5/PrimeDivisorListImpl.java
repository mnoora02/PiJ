package toSort_PiJ_Exercises.Day_15.Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 5 Prime divisors
 Create a class PrimeDivisorList. Integers (as in class Integer) can be added to / removed from the list. If a
 null number is passed to the add(Integer) method, a NullPointerException must be thrown. If a non-prime
 number is added, an IllegalArgumentException must be thrown.
 Override the method toString() so that it returns something like:
 [ 2 * 3^2 * 7 = 126 ]
 for a list containing one 2, two 3, and one 7.
 Use the TDD methodology to create the class (interface, tests,implementation). You can base your class on
 classes and interfaces from the Java Collections Library.
 */

public class PrimeDivisorListImpl implements PrimeDivisorList {

    private List<Integer> numList;

    public PrimeDivisorListImpl() {
        numList = new ArrayList<>();
    }

    @Override
    public void add(Integer i) {
        if (i == null){
            throw new NullPointerException();
        }
        if (!isPrime(i)){
            throw new IllegalArgumentException();
        }
        numList.add(i);
    }

    private boolean isPrime(Integer num) {
        if (num <= 1) {
            return false;
        }

        boolean result = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        if (numList.isEmpty()) {
            return "[]";
        }

        int result = numList.stream().reduce(1, (a, b) -> a * b);
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        //numList.forEach(sb::append);
        Map<String, Long> mapList =  numList.stream()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String stringList = mapList.keySet()
                .stream()
                .map(k -> mapList.get(k)> 1? k + "^" + mapList.get(k):k)
                .reduce((a, b) -> a + " * " + b)
                .get();

        //String stringList = numList.stream().sorted().map(Object::toString).reduce((a, b) -> a + " * " + b).get();
        sb.append(stringList);
        //sb.append(numList.stream().map(Object::toString).reduce("", (a, b) -> a + " * " + b));

        sb.append(" = ");
        sb.append(result);
        sb.append(" ]");
        return sb.toString();
    }


}
