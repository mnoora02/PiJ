package toSort_PiJ_Exercises.Day_14.Q1b;

/*
 b) McCarthy’s 91 function
 Calculate the result of calling this method with arguments 50, 73, and 95. Note that the recursion on line 5 is
 double.
 int mcCarthy91(int n) {
 if (n > 100) {
 return n - 10;
 } else {
 return mcCarthy91(mcCarthy91(n+11));
 }
 }
 (Hint: If you get too confused, maybe writing a slightly modified version of this code that prints the numbers
 on screen can help).
 */

public class McCarthy91 {
    public static void main(String[] args) {
        McCarthy91 mc = new McCarthy91();
        mc.launch();
    }

    public void launch() {
        //System.out.println(mcCarthy91(50));
        //System.out.println(mcCarthy91(73));
        ///System.out.println(mcCarthy91(95));
        System.out.println(mcCarthy91(120));
    }

    public int mcCarthy91(int n) {
        if (n > 100) {
            System.out.println(n + " - 10");
            return n - 10;
        } else {
            System.out.println("mcCarthy91(mcCarthy91(" + n + "+ 11))");
            return mcCarthy91(mcCarthy91(n + 11));
        }
    }
}
