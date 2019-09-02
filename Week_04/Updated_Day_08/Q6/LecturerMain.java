package Day_08.Q6;

/**
 * Q6.2 Java magic
 * Can you see what is wrong in the following code (most JavaDoc comments ommited for the sake of space)?
 *
 * If it is not evident, try to compile the code.
 * If it compiles without problems, write a script that creates an object of class Lecturer and uses its two methods.
 * If it does not, modify class Lecturer so that the program compiles, and then write the script to use its two methods.
*/

public class LecturerMain {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Lucy");
        System.out.println("Lecturer name: " + lecturer.getName());
        lecturer.teach("ACT");
        lecturer.doResearch("Scala");
    }
}
