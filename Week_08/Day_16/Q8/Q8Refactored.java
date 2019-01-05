package toSort_PiJ_Exercises.Day_16.Q8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mnoora02 on 27/05/2017.
 */
public class Q8Refactored {
    public static void main(String[] args) {
        String fileName = args[0];
        String root = "I:";
        File dataFile = new File(root, fileName);

        List<String> lines = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
            lines = reader.lines().collect(Collectors.toList());
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("Line Averages");
        lines.stream()
                .map(line -> Stream.of(line.split(","))
                        .map(String::trim)
                        .mapToInt(Integer::parseInt)
                        .average()
                        .orElse(0))
                .forEach(System.out::println);

        System.out.println("overall avg: ");

        double avg = lines.parallelStream()
                .flatMapToInt(line -> Stream.of(line.split(","))
                        .map(String::trim)
                        .mapToInt(Integer::parseInt))
                .average()
                .orElse(0);
        System.out.println(avg);

    }
}
