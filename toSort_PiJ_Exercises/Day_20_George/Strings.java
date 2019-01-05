package toSort_PiJ_Exercises.Day_20_George;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by mnoora02 on 22/12/2016.
 */
public class Strings {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "wotcha", "bye", "goodbye");

    // Q5. (a) Loop through the words and print each on a separate line, with two spaces in front of
    // each word.

        words.stream().forEach(w -> System.out.println("  " + w));
        words.stream().map(w -> "  " + w).forEach(System.out::println);

    // Q5(b) Repeat the previous problem, but without the two spaces in front. This is trivial if you
    // use the same approach as in (5a), so the point here is to use a method reference.
        words.stream().forEach(System.out::println);

    /* Q6. (a) For the following expressions, which you wrote for the last exercise sheet, produce the
    same transformations using map:
            • List<String> excitingWords =
            transformedList(words, s -> s + "!");
    • List<String> eyeWords =
            transformedList(words, s -> s.replace("i", "eye"));
    • List<String> upperCaseWords =
            transformedList(words, String::toUpperCase);
    */
        List<String> excitingWords = words.stream().map(s -> s + "!").collect(Collectors.toList());
        List<String> eyeWords = words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
        List<String> upperCase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(excitingWords);
        System.out.println(eyeWords);
        System.out.println(upperCase);

    /* Q6b For the following lists produce the same transformations using filter (you wrote solutions
        for last exercise sheet):
        • List<String> shortWords = allMatches(words, s -> s.length() < 4);
        • List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
        • List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2)
                == 0);
    */
        List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        List<String> wordsWithB = words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
        List<String> evenLengthWords = words.stream().filter(s -> s.length() % 2 == 0).collect(Collectors.toList());
        System.out.println(shortWords);
        System.out.println(wordsWithB);
        System.out.println(evenLengthWords);

    /* Q8. (a) Produce a single String that is the result of concatenating the uppercase versions of all
    of the Strings. E.g., the result should be "HIHELLO...". Use a single reduce operation,
    without using map.
    */
        //String stringed = words.stream().reduce("", (s1, s2) -> s1 + s2).toUppercase();
        String stringed = words.stream().reduce("", (s1, s2) -> s1.toUpperCase() + s2.toUpperCase());
        Optional<String> stringOptional = words.stream().reduce((s1, s2) -> s1.toUpperCase() + s2.toUpperCase());
        String stringed2 = null;
        if (stringOptional.isPresent()) stringed2 = stringOptional.get();

        System.out.println(stringed);

    /* Q8(b) Produce the same String as above, but this time via a map operation that turns the
    words into upper case, followed by a reduce operation that concatenates them*/

        String mappedWords = words.stream().map(String::toUpperCase).reduce("", (s1, s2) -> s1 + s2);
        Optional<String> mappedWords2 = words.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + s2);

        List<String> listString = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println();

        /*Q8 */
        List<Double> nums = randomNumberList(3);
        System.out.println(nums);

        /*Q9 */
        List<Integer> nums2 = orderedNumberList(50, 5, 5);
        System.out.println(nums2);
    }

    /* Q9. (a) Write a static method that produces a List of a specified length of random numbers.
    E.g.: List<Double> nums = randomNumberList(someSize); */

    public static List<Double> randomNumberList(int size){
        return IntStream.range(0, size)
                .mapToDouble(i -> Math.random())
                .boxed()
                .collect(Collectors.toList());
    }

    /* Q9(b) Write a static method that produces a list of numbers that go in order by a step size.
    E.g.: List<Integer> nums = orderedNumberList(50, 5, someSize);
    // Result is [50, 55, 60, ...] */

    public static List<Integer> orderedNumberList(int startingNum, int addingNum, int size){
        return IntStream.range(0, size)
                .map(n -> n * addingNum + startingNum)
                .boxed()
                .collect(Collectors.toList());
    }


}


