package toSort_PiJ_Exercises.Day_17.Q3;

/**
 * Created by mnoora02 on 17/06/2017.
 */
public class Increaser implements Runnable {

    private Counter c;

    public Increaser(Counter counter) {
        this.c = counter;
    }

    @Override
    public void run() {
        System.out.println("Starting at " + c.getCount());
        synchronized (c) {
            for (int i = 0; i < 1000; i++) {
                c.increase();
            }
        }

        System.out.println("Stopping at " + c.getCount());
    }
}