package Test1;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Java code for thread creation by extending 
//the Thread class 

//Main Class 
public class Multithread3 {
	static int count = 0;

	static synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();

		Future<Integer> future= executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				System.out.println("Starting  ...");
				Random random = new Random();
				int duration = random.nextInt(4000);
				try {
					Thread.sleep(duration);
				} catch (Exception e) {
					e.printStackTrace();

				}
				System.out.println("finishrd ;;");
				return duration;
			}
		});

		executor.shutdown();
		

		try {
			System.out.println("hi vfe" + future.get());
			System.out.println(future.isDone());
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
