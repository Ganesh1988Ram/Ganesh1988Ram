package java8_multithreading;

public class ShemaforeDenifition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/**
Using this construct called semaphore, access to a shared resource is controlled through a counter. Signals are sent between the threads so that we can guard the critical section and also avoid missed signals.

A semaphore can be defined as a variable that is used to manage concurrent processes by synchronizing these processes. Semaphores are also used to synchronize access to the shared resource and thereby avoid a race condition.
The permission given to a thread for accessing the shared resource by semaphore is also called a permit.

Depending on what functions they perform, semaphores can be divided into two types:

#1) Binary Semaphore: A binary semaphore is used to synchronize concurrent processes and implement mutual exclusion. A binary semaphore assumes only two values i.e. 0 and 1.

#2) Counting Semaphore: The counting semaphore has a value that indicates the number of processes that can enter the critical section. At any point,
 the value indicates the maximum number of processes that enter the critical section.

So how does a Semaphore work?

The working of a Semaphore can be summarized in the following steps:

If semaphore count > 0, it means that the thread has a permit to access critical section, and then the count is decremented.
Otherwise, the thread is blocked until the permit is acquired.
When the thread is done with accessing the shared resource, the permit is released and semaphore count is incremented so that another thread can repeat the above steps and acquire the permit.


**/