package toSort_PiJ_Exercises.Day_14.Q2;

/*
2 Memoized Fibonacci
Memoization is not always necessary, but in some cases it can really speed up computation, as in this exercise.
Write a Java class with a with a method that calculates the nth element of the Fibonacci sequence as seen in
the notes. Note: Remember that when a method is a pure function without side-effects, it is good practice to make
it static. Does any or both versions of this method qualify?
Do it with and without memoization. Compare the time that is needed in each case to find F(40) or F(45).
What is the maximum Fibonacci number you can calculate in Java using int? And using long? Hint: Remember
that both types have a maximum value as they are only 32 and 64 bits long. Look at the Java documentation to
find the maximum value in each case.
 */


public class Memoisation {

    private int[] calculated = null;

    public static void main(String[] args) {
        Memoisation nm = new Memoisation();
        nm.launch();
    }

    private void launch() {
        System.out.println(nonMemo(45));
        //System.out.println(memoisationMethod(45));
    }

    private int nonMemo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return nonMemo(n-1) + nonMemo(n-2);
        }
    }

    private void initialiseArray(int n) {
        calculated = new int[n+1];
        for(int i = 0; i < calculated.length; i++){
            if(i <= 1){
                calculated[i] = 1;
            } else {
                calculated[i] = -1;
            }
        }
    }

    private int memoisationMethod(int n) {
        if(calculated == null) {
            initialiseArray(n);
        }
        if (calculated[n] != -1) {
            return calculated[n];
        } else {
            int result = memoisationMethod(n -1) + memoisationMethod(n - 2);
            calculated[n] = result;
            return result;
        }
    }
}
