package Day_08.Q6;

/**
 * Q6 Java magic
 * Can you see what is wrong in the following code (most JavaDoc comments ommited for the sake of space)?
 *
 * If it is not evident, try to compile the code.
 * If it compiles without problems, write a script that creates an object of class Lecturer and uses its two methods.
 * If it does not, modify class Lecturer so that the program compiles, and then write the script to use its two methods.
 * A lecturer has both teaching and research responsibilities
 */

// original

/**
 * Q6.2 Java magic
 * Can you see what is wrong in the following code (most JavaDoc comments ommited for the sake of space)?
 *
 * If it is not evident, try to compile the code.
 * If it compiles without problems, write a script that creates an object of class Lecturer and uses its two methods.
 * If it does not, modify class Lecturer so that the program compiles, and then write the script to use its two methods.

 * original problem code below - the class Teacher has a constructor that takes a param:
            public Teacher(String name)
 * but class Lecturer has no way of instantiating its own name
 * when we do not provide a constructor, java will create its own one with empty parantheses and java will call super()
 * - however this will then result in a compilation error because
 * when java calls super with an empty parantheses it cannot do that
 * because our super constructor does not have empty parantheses
 *
 public class Lecturer extends Teacher {
    public void doResearch(String topic) { System.out.println("Doing research on: " + topic);
    }
 }
 */

// corrected code
public class Lecturer extends Teacher {

    public Lecturer(String name){
        super(name);
    }
    public void doResearch(String topic) {
        System.out.println("Doing research on: " + topic);
    }
}

