package toSort_PiJ_Exercises.Day_17.Q1;

/**
 * Created by mnoora02 on 17/06/2017.
 */
public class TextLoop implements Runnable {

    public static final int COUNT = 10;

    private final String name;

    public TextLoop(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Loop:" + name + ", iteration:" + i + ".");
        }
    }
}
