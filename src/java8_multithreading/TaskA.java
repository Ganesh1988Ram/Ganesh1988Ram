package java8_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Tas implements Runnable {
    private String name;
 
    public Tas(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);
            System.out.println("Executing : " + name);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TaskA
{
    public static void main(String[] args) 
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
         
        for (int i = 1; i <= 5; i++) 
        {
            Tas tas = new Tas("Tas " + i);
            System.out.println("Created : " + tas.getName());
 
            executor.execute(tas);
        }
        executor.shutdown();
    }
}