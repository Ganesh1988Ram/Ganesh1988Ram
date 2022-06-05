package java8_multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch c= new CountDownLatch(3);  // need to decrements the count (3) to zero by calling countDown() method so that main thread will wake up after calling await() method 
        Task t1 = new Task(c);
        Task t2 = new Task(c);
        Task t3 = new Task(c);
        t1.start();
        t2.start();
        t3.start();
        c.await(); // when count becomes zero main thread will wake up 
        System.out.println("This will print after count down latch count become zero");
    }
}

class Task extends Thread{
    CountDownLatch c;

    public Task(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            c.countDown();   // each thread decrement the count by one 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



/**
As mentioned in JavaDoc (https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/CountDownLatch.html), CountDownLatch is a synchronization aid, introduced in Java 5. Here the synchronization does not mean restricting access to a critical section. But rather sequencing actions of different threads.
The type of synchronization achieved through CountDownLatch is similar to that of Join. Assume that there is a thread "M" which needs to wait for other worker threads "T1", "T2", "T3" to complete its tasks Prior to Java 1.5, the way this can be done is, M running the following code

    T1.join();
    T2.join();
    T3.join();
The above code makes sure that thread M resumes its work after T1, T2, T3 completes its work. T1, T2, T3 can complete their work in any order. The same can be achieved through CountDownLatch, where T1,T2, T3 and thread M share same CountDownLatch object.
"M" requests :  countDownLatch.await();
where as "T1","T2","T3" does  countDownLatch.countdown();

One disadvantage with the join method is that M has to know about T1, T2, T3. If there is a new worker thread T4 added later, then M has to be aware of it too. This can be avoided with CountDownLatch. After implementation the sequence of action would be [T1,T2,T3](the order of T1,T2,T3 could be anyway) -> [M]


*/