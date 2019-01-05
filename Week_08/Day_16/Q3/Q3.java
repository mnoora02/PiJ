package toSort_PiJ_Exercises.Day_16.Q3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 3 cat
 a)
 Write a program that takes a name from the user at the command line. If a file with that name exists, the program
 must show its contents on screen. If it does not, the program must say so.
 */
public class Q3 {
    public static void main(String[] args) {
        String name = args[0];
        String root = "I:";
        File myFile = new File(root + File.separator + name);

        if (myFile.exists()) {
            if (myFile.isDirectory()) {
                File[] myDirectoryFiles = myFile.listFiles();
                //Arrays.stream(myDirectoryFiles)
                //        .forEach(f -> System.out.println(f.getName())); // printing array to string

                Arrays.stream(myDirectoryFiles)
                        .map(File::getName)
                        .forEach(System.out::println);
            } else {
                try(BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
                    reader.lines().forEach(System.out::println);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } else {
            System.out.println("File does not exist");
        }


    }



}
