package toSort_PiJ_Exercises.Day_17.Q1;

/**
 * Created by mnoora02 on 17/06/2017.
 */
public class TextLoopMain {
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
                Runnable r = new TextLoop("Thread " + i);
                Thread t = new Thread(r);
                t.start();
            }
        }
    }
}
