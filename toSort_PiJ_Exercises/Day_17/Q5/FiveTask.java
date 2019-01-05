package toSort_PiJ_Exercises.Day_17.Q5;

/**
 * Created by mnoora02 on 17/06/2017.
 */
public class FiveTask implements Runnable {

    private int duration;

    public FiveTask (int duration){
        this.duration = duration;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
