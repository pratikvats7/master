package Test1;

import java.util.concurrent.Callable;

public class SumCallable implements Callable<Object> {
	
	private int s;
	private Dummy d = new Dummy();
	
	public SumCallable(int s) {
		super();
		this.s = s;
	}

	public Object call() {
		
		d.test(s);
		
		System.out.println("inside");
		return s;
	}

}
