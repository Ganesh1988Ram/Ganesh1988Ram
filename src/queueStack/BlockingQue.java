package queueStack;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class  BlockingQue {
	
	static BlockingQueue bq = new LinkedBlockingQueue(5);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	

		Producer pd = new Producer();
		
		Thread th1 = new Thread(pd);
		th1.start();
		
		
		Consumer cm = new Consumer();
		Thread th2 = new Thread(cm);
		th2.start();
}
	
	
	static class Producer implements Runnable{
		 SecureRandom random = new SecureRandom();

		@Override
		public void run() {
			
			  while (true) {
			        int element = random.nextInt(5);
			        try {
			          bq.put(element);
			          if(element==1)
			          {
			        	  break;
			          }
			        } catch (InterruptedException e) {
			        }
			      }
			// TODO Auto-generated method stub
			
		}
		
	}
	
	static class Consumer implements Runnable{

		SecureRandom random = new SecureRandom();
		@Override
		public void run() {
			
			while(true)
			{
				
				try {
			          System.out.println("Consumed " +bq.take());
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
			// TODO Auto-generated method stub
			
		}
		
	}
}