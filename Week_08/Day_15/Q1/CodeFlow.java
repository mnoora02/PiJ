package toSort_PiJ_Exercises.Day_15.Q1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mnoora02 on 18/03/2017.
 */
public class CodeFlow {
    public static void main(String[] args) {
        CodeFlow cfObject = new CodeFlow();
        cfObject.launch(0);
        System.out.println();
        cfObject.launch(2);
        System.out.println();
        cfObject.launch(4);
        System.out.println();
        cfObject.launch(6);
        System.out.println();
    }
    public void launch(int userInput) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);                             // excpetion here
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }

}
