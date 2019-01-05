package toSort_PiJ_Exercises.Day_16.Q4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

/**
 * Created by mnoora02 on 27/05/2017.
 */
public class Q4 {
    public static void main(String[] args) {
        String source = args[0];
        String destination = args[1];

        String root = "I:";
        File sourceFile = new File(root, source);
        File destinationFile = new File(root, destination);
        if (sourceFile.exists()) {
                try {
                    if (destinationFile.exists()) {
                        System.out.println("Overwrite file? ");
                        Scanner sc = new Scanner(System.in);
                        String userInput = sc.next();

                        if (userInput.equals("Yes")) {
                            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        } else {
                            System.out.println("OK, exiting program.");
                        }
                    } else {
                        Files.copy(sourceFile.toPath(), destinationFile.toPath());
                    }
                } catch (IOException e) {
                    System.out.println("IOException..");
                    e.printStackTrace();
                }
        } else {
            System.out.println("Source file does not exist.");
        }
    }
}
