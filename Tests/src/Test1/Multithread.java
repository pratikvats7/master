package Test1;

//Java code for thread creation by extending 
//the Thread class 

//Main Class 
public class Multithread {
	static int count=0;
	static synchronized void increment() {
		count++;
	}
	public static void main(String[] args) throws InterruptedException {

		Runnable object = ()->  {
				for (int i = 0; i < 1000; i++) {
					//System.out.println("hi");
					increment();
				}

		};
		Runnable object1 = ()-> {

			
				for (int i = 0; i < 1000; i++) {
					//System.out.println("hello");
					increment();
				}
		};

		Thread t1 = new Thread(object);
		Thread t2 = new Thread(object1);

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println("hi vfe"+count);
	}
}
