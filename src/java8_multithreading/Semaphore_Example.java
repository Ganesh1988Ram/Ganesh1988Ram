package java8_multithreading;

import java.util.concurrent.Semaphore;

public class Semaphore_Example { 
    public static void main(String args[]) throws InterruptedException    { 
        //create Semaphore=&amp;amp;gt; #permits = 1
        Semaphore sem = new Semaphore(1); 
         // Create thread instances T1 &amp;amp;amp; T2
        //T1=&amp;amp;gt; Increments the count; T2=&amp;amp;gt; Decrements the count
        ThreadClass thread1 = new ThreadClass(sem, "T1"); 
        ThreadClass thread2 = new ThreadClass(sem, "T2"); 
           
        // start T1 &amp;amp;amp; T2 
        thread1.start(); 
        thread2.start(); 
        // Wait T1 &amp;amp;amp; T2  
        thread1.join(); 
        thread2.join(); 
        System.out.println("count: " + SharedRes.count);    // display final count.
    } 
}

class SharedRes { 
    static int count = 0; 
} 
class ThreadClass extends Thread { 
    Semaphore sem; 
    String threadName; 
    public ThreadClass(Semaphore sem, String threadName)   { 
        super(threadName); 
        this.sem = sem; 
        this.threadName = threadName; 
    } 
   
    @Override
    public void run() { 
         // Thread T1 processing 
        if(this.getName().equals("T1"))  { 
            System.out.println("Start: " + threadName); 
            try  { 
                System.out.println(threadName + " :waiting for a permit."); 
               // acquire the permit 
                sem.acquire(); 
               System.out.println(threadName + ":Acquired permit"); 
              // access shared resource
                for(int i=0; i<5; i++)   { 
                    SharedRes.count++; 
                    System.out.println(threadName + ": " + SharedRes.count); 
                   Thread.sleep(10); 
                } 
           
  } catch (InterruptedException exc) { 
                    System.out.println(exc); 
                } 
                // Release the permit. 
                System.out.println(threadName + ":Released the permit"); 
                sem.release(); 
        }
        // Thread T2 processing 
        else  { 
            System.out.println("Start: " + threadName); 
            try  { 
                System.out.println(threadName + ":waiting for a permit."); 
                // acquire the lock 
                sem.acquire(); 
                System.out.println(threadName + ":Acquired permit"); 
               // process the shared resource
                for(int i=0; i<5; i++)  { 
                    SharedRes.count--; 
                    System.out.println(threadName + ": " + SharedRes.count); 
                   Thread.sleep(10); 
                } 
            } catch (InterruptedException exc) { 
                    System.out.println(exc); 
                } 
                // Release the permit. 
                System.out.println(threadName + ":Released the permit."); 
                sem.release(); 
        } 
    } 
}
