package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Java code for thread creation by extending 
//the Thread class 

//Main Class 
public class Multithread4 {
	static int count = 0;

	static synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ExecutorService executor = Executors.newCachedThreadPool();
		Integer[] ar = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.addAll(Arrays.asList(ar));
		 List<Future<Object>> resultList = null;
		ExecutorService exec = Executors.newCachedThreadPool();
		SumCallable sm= new SumCallable(5);
		SumCallable sm2= new SumCallable(6);
		List<SumCallable> ls= new ArrayList<SumCallable>();
		ls.add(sm);
		ls.add(sm2);
		resultList=exec.invokeAll(ls);

		for (Future<Object> future : resultList) {
			System.out.println(future.get());
			System.out.println(future.get().getClass());
		}
	    List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
	    int count=0;
	    
	  for(int i=1,fromIndex=-4,toIndex=0;i<=4;i++) {
		  count++;
		  fromIndex+=4;
		  toIndex+=4;
		  List<Integer> ar2=ar1.subList(fromIndex, toIndex);
		  futures.add(exec.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum1=0;
					System.out.println("Starting  ...");
					Random random = new Random();
					int duration = random.nextInt(4000);
					try {
						
						sum1=sum(ar2);
					} catch (Exception e) {
						e.printStackTrace();

					}
					System.out.println(Thread.currentThread().getName());
					System.out.println("finished ;");
					//System.out.println(sum1);
					return sum1;
				}
			}));
	    }
	  int totsum=0;
	    for (Future<?> f : futures) {
	    	//totsum+=f.get()
	        System.out.println(f.get()); // wait for a processor to complete
	        System.out.println(f.get());
	    }
	    exec.shutdown();
	    System.out.println("all items processed");
	}
	public static int sum(List<Integer> ar1) {
		
		int sum1=0;
		for (Integer integer : ar1) {
			sum1+=integer;
		}
		return sum1;
	}
}
