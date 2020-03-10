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
public class Multithread5 {
	static int count = 0;

	static synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		 List<Future<Object>> resultList = null;
		 
		ExecutorService exec = Executors.newCachedThreadPool();
		List<CallableClass> ls= new ArrayList<CallableClass>();
		for (int i = 0; i < 20; i++) {
			CallableClass sm= new CallableClass(i);
			ls.add(sm);
			
		}
		Long t1=System.currentTimeMillis();
		resultList=exec.invokeAll(ls);
		System.out.println();
		exec.shutdown();
		Long t2=System.currentTimeMillis();
		
		
	    System.out.println("all items processed");
	    System.out.println(t2-t1);
	}
}
