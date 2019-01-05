package toSort_PiJ_Exercises.Day_18.Q2;

/*
2 Text loops re-executed
Modify the code of the exercise “Text Loops” from last day to use one of the Executor instead of plain threads.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by mnoora02 on 17/06/2017.
 */
public class TextLoopMainConcII {
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
            ExecutorService e = Executors.newFixedThreadPool(10);
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop("Thread " + i);
                //Executor e = new ThreadPoolExecutor(int 1, int 4, long 100000, TimeUnit unit, BlockingQueue<Runnable> workQueue);
                e.execute(r);
            }
        }
    }
}
