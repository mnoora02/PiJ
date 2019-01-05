package toSort_PiJ_Exercises.Day_17.Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by mnoora02 on 17/06/2017.
 */
public class AliveMain {

    private List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) {

        AliveMain am = new AliveMain();
        am.launch();
    }

    private void launch(){

        for(int i = 0; i < 10; i++){
            System.out.print("Enter the duration (in ms) of task " + i + ": ");
            Scanner sc = new Scanner(System.in);
            int duration = sc.nextInt();

            Runnable r = new FiveTask(duration);

            Thread t = new Thread(r);
            t.setName(i + "");
            threads.add(t);
            t.start();
            checkDeadThreads();
        }

        while(!threads.isEmpty()){
            checkDeadThreads();
        }

    }

    private void checkDeadThreads() {

        List<String> deadThreads = threads.stream()
                .filter(t -> !t.isAlive())
                .map(Thread::getName)
                .collect(Collectors.toList());

        if(!deadThreads.isEmpty()){
            System.out.println("Finished tasks: " + deadThreads);
            threads.removeIf(t -> deadThreads.contains(t.getName()));
        }
    }
}