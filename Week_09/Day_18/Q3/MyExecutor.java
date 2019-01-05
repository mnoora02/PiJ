package toSort_PiJ_Exercises.Day_18.Q3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by mnoora02 on 02/07/2017.
 *        3 Responsive UI (that degrades gracefully)
 3.1 Implement Executor
 Create your own implementation of Executor. Look at the documentation of the API of Executor for ideas.
 Your implementation must be able to execute one Runnable at a time (but you can make it run several tasks in paralel,
 see also Exercise 6)

 and must have a queue of pending tasks.

 Try your implementation by exchanging the class that you used in your solution for the former exercise by your
 new implementation of Executor.

 */
public class MyExecutor implements Executor {

    //private int threadPoolSize;
    private Queue<Runnable> pendingTasks;
    private Queue<Runnable> executingTasks;

    public MyExecutor(int threadPoolSize) {
        //this.threadPoolSize = threadPoolSize;
        this.pendingTasks = new LinkedList<>();
        this.executingTasks = new LinkedBlockingQueue<>(threadPoolSize);
    }

    @Override
    public void execute(Runnable command) {
        boolean added = executingTasks.offer(command);
        if (added){
            Thread t = new Thread(command);
            t.start();
        } else {
            pendingTasks.add(command);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void tellProgramIsFree(Thread t){
        while(t.isAlive()) {
        }
        notifyAll();
    }

    public void removeTask() {
        executingTasks.
    }

}
