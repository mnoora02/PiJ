package toSort_PiJ_Exercises.Day_16.Q1;

import java.io.File;
import java.util.Arrays;

/**
 1 ls
 Write a program that shows on screen the names of the files in the current directory. (Hint: look at methods from
 class File).
 */
public class Q1 {

    public static void main(String[] args) {
        File currentDirec = new File(".");
        String[] files = currentDirec.list();
        Arrays.asList(files).forEach(System.out::println);
    }
}
