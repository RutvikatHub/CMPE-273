package multithreadingimplementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultithreadTest {

	@Test
	public void threadTest() {
		Multithreading object = new Multithreading();
		   Thread t1 = new Thread(new Multithreading());
		   Thread t2 = new Thread(new Multithreading());
		   Thread t3 = new Thread(new Multithreading());
		   
		   t1.setPriority(Thread.MAX_PRIORITY);
		   t2.setPriority(Thread.MIN_PRIORITY);
		   t3.setPriority(Thread.NORM_PRIORITY);
		   try {
			   t1.start();
			   t2.start();
			   t3.start();
		   } finally {
			   try {
				   Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			   System.out.println(object.outputString());
		   }
		   
		   assertEquals("2017-09-12 04:20 - Runnable Thread: Thread-0 --> 2017-09-12 04:20 - Runnable Thread: Thread-2 --> 2017-09-12 04:20 - Runnable Thread: Thread-1 --> ", object.outputString());
		   }
	}
