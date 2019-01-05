package toSort_PiJ_Exercises.Day_14.Q1a;

/*
1 Recursive code, line by line
        a)
        Do you see anything wrong with the following code? How would you fix it?
        String doggyMethod(int n) {
        String result = doggyMethod(n-3) + n + doggyMethod(n-2);
        if (n <= 0) {
        return "";
        }
        return result;
        }
*/

public class DoggyMethod {
    public String doggyMethod(int n) {
        if (n <= 0) {
            return "";
        }

        return doggyMethod(n-3) + n + doggyMethod(n-2);
    }

}
