package Test1;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Java code for thread creation by extending 
//the Thread class 

//Main Class 
public class Multithread2 {
	static int count = 0;

	static synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();

		executor.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println("Starting  ...");
				Random random = new Random();
				int duration = random.nextInt(4000);
				try {
					Thread.sleep(duration);
				} catch (Exception e) {
					e.printStackTrace();

				}
				System.out.println("finishrd ;;");
			}
			
		});
		executor.shutdown();

		System.out.println("hi vfe" + count);
	}
}
