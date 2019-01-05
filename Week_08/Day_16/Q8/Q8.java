package toSort_PiJ_Exercises.Day_16.Q8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * Created by mnoora02 on 27/05/2017.
 */
public class Q8 {
    public static void main(String[] args) {
        String fileName = args[0];
        String root = "I:";
        File dataFile = new File(root, fileName);

        try(BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {

            System.out.println("Line Averages");
            reader.lines()
                    .map(line -> Stream.of(line.split(","))
                            .map(String::trim)
                            .mapToInt(Integer::parseInt)
                            .average()
                            .orElse(0))
                    .forEach(System.out::println);
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
            System.out.println("overall avg: ");

            double avg = reader.lines()
                    .flatMapToInt(line -> Stream.of(line.split(","))
                            .map(String::trim)
                            .mapToInt(Integer::parseInt))
                    .average()
                    .orElse(0);
            System.out.println(avg);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
