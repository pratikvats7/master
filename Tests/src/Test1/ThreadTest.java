package Test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ThreadTest {
	public static void test() throws IOException{
		RandomAccessFile reader = 
				new RandomAccessFile(new File("/home/pratik/Documents/Notes/new2.txt"), "rw");
         
         
		for (int i = 0; i < 10; i++) {
			reader.writeBytes("Welcome to javaTpoint.");  
		}
		
	}
}
