package Test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class CallableClass implements Callable<Object>{
	
	private int s;
	private Dummy d = new Dummy();
	private static Integer[] a= {1,2,3,4,5};
	
	private static List<Integer> ar =  Arrays.asList(a);
	
    
	public CallableClass(int s) {
		super();
		this.s = s;
	}
	

	public Object call() throws InterruptedException, IOException {
		
		//System.out.println(Thread.activeCount());
		//System.out.println(Thread.currentThread()+"name");
		Thread.sleep(1000);
		//System.out.println(ar.get(2));
		//System.out.println("inside");
		ThreadTest.test();
		return s;
	}
	

}
