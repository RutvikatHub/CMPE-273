package multithreadingimplementation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Multithreading implements Runnable{
	   
	   static String output = "";
	   
	   @Override
	   public void run() {
		   //System.out.println("1");
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    	   String formattedDateTime = LocalDateTime.now().format(formatter);
    	   output += formattedDateTime + " - Runnable Thread: "+ Thread.currentThread().getName() + " --> ";
	   }
	
	   public String outputString() {
		   return output;
	   }
	   
	   public static void main(String[] args) {
		   Multithreading object = new Multithreading();
		   Thread t1 = new Thread(new Multithreading());
		   Thread t2 = new Thread(new Multithreading());
		   Thread t3 = new Thread(new Multithreading());
		   
		   t1.setPriority(5);
		   t2.setPriority(1);
		   t3.setPriority(9);
		   try {
			   t1.start();
			   t2.start();
			   t3.start();
			   Thread.sleep(5000);
		   } catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		   finally {
			   System.out.println(object.outputString());
		}
	}
}