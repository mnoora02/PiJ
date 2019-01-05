package toSort_PiJ_Exercises.Day_15.Q6;

import java.util.Scanner;

/**
 * Created by mnoora02 on 13/05/2017.
 */
public class Q6App {

    public static void main(String[] args) throws MyCheckedException{

        Q6App app = new Q6App();  // create obj of this class

        app.launch(); // call method on the obj
    }

    private void launch() throws MyCheckedException {
        System.out.println("checked or runtime..? ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        System.out.println("inside or outside ..? ");
        String inOut = sc.next();

        if (userInput.equals("checked") && inOut.equals("inside")) {
            try {
                throw new MyCheckedException("I am a checked exception and I have been thrown inside a try block.");
            } catch(MyCheckedException e) {
                System.out.println(e.getMessage());
            }
        } else if (userInput.equals("checked") && inOut.equals("outside")) {
            throw new MyCheckedException("I am a checked exception and I have been thrown OUTside a try block.");
        } else if (userInput.equals("runtime") && inOut.equals("inside")) {
            try {
                throw new MyRuntimeException("I am a runtime exception and I have been thrown inside a try block.");
            } catch(MyRuntimeException e) {
                System.out.println(e.getMessage());
            }
        } else if (userInput.equals("runtime") && inOut.equals("outside")) {
            throw new MyRuntimeException("I am a runtime exception and I have been thrown OUTside a try block.");
        }

    }
}
