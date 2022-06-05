package java8_multithreading;

public class CountDownLatchVsCyclicBarrier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/**


CountDownLatch can be used to implement multiple threads waiting for each other. If you look at CyclicBarrier it also does the same thing 
but it is different you can not reuse CountDownLatch once the count reaches zero while you can reuse CyclicBarrier by calling the reset() method which resets Barrier to its initial State. 

What it implies that CountDownLatch is good for one-time events like application start-up time and CyclicBarrier can be used in case of the recurrent event like 
concurrently calculating a solution of the big problem

Read more: https://javarevisited.blogspot.com/2012/07/cyclicbarrier-example-java-5-concurrency-tutorial.html#ixzz7PMcg18vS



*/