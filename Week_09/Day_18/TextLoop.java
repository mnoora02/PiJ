package Day_18.Day_18;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class TextLoop implements Runnable {
    public static final int COUNT = 10;
    private final String name;
    
    public TextLoop(String name) {          // constructor
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Loop:" + name + ", iteration:" + i + ".");
        }
    }

    public static void main(String args[]) {
        if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
            System.out.println("USAGE: java TextLoop <mode>");
            System.out.println(" mode 0: without threads");
            System.out.println(" mode 1: with threads");
        } else if (args[0].equals("0")) {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop("Thread " + i);
                r.run();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                BlockingQueue q = new ArrayBlockingQueue(10);
                Executor e = new ThreadPoolExecutor(2, 10, 1000, TimeUnit.MILLISECONDS, q);
                Runnable r = new TextLoop("Thread " + i);
                //Thread t = new Thread(r);
                //t.start();
                e.execute(r);
            }
        }
    }
} // END of class