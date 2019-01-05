package toSort_PiJ_Exercises.Day_17.Q3;

/**
 * Created by mnoora02 on 17/06/2017.
 */
public class CounterMain {

    public static void main(String args[]) {

        Counter counter = new Counter();

        for (int i = 0; i < 100; i++) {
            Increaser increaserTask = new Increaser(counter);
            Thread t = new Thread(increaserTask);
            t.start();
        }
    }
}
