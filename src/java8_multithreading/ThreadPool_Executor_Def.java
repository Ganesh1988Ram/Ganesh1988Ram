package java8_multithreading;

public class ThreadPool_Executor_Def {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



/**

 How to create ThreadPoolExecutor
We can create following 5 types of thread pool executors with pre-built methods in java.util.concurrent.Executors interface.
Fixed thread pool executor – Creates a thread pool that reuses a fixed number of threads to execute any number of tasks. 


If additional tasks are submitted when all threads are active, they will wait in the queue until a thread is available. It is the best fit for most off the real-life use-cases.
ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

Cached thread pool executor – Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. DO NOT use this thread pool if tasks are long-running. It can bring down the system if the number of threads goes beyond what the system can handle.
ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();


Scheduled thread pool executor – Creates a thread pool that can schedule commands to run after a given delay, or to execute periodically.
ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newScheduledThreadPool(10);


Single thread pool executor – Creates single thread to execute all tasks. Use it when you have only one task to execute.
ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newSingleThreadExecutor();


Work stealing thread pool executor – Creates a thread pool that maintains enough threads to support the given parallelism level. Here parallelism level means the maximum number of threads which will be used to execute a given task, at a single point of time, in multi-processor machines.
ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newWorkStealingPool(4);





**/