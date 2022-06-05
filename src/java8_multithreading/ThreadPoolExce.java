package java8_multithreading;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExce {
    public static void main(String[] args) 
    {
        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);
         
        TaskB task = new TaskB("Repeat Task");
        System.out.println("Created : " + task.getName());
         
        executor.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
        executor.shutdown();
    }
}
 
class TaskB implements Runnable {
    private String name;
 
    public TaskB(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    @SuppressWarnings("deprecation")
	public void run() {
        System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());
    }
}