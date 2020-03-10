package test;

import java.util.ArrayList;

public class FirstMissingPositive {
	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5, 6};
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		for (Integer integer : ar) {
			ar1.add(integer);
		}
		int i = -1;
		String st = i + "";
		System.out.println(st);
		System.out.println(firstMissingPositive(ar1));
	}

	  public static int firstMissingPositive(ArrayList<Integer> A) {
	        ArrayList<Integer> ar3 = new ArrayList<>();
	        ArrayList<Integer> ar4 = new ArrayList<>();
	        int max = 0;
	        for (Integer integer : A) {
	            if (integer > 0) {
	                ar3.add(integer);
	                if (integer > max)
	                    max = integer;
	            }
	        }
	        if(max<1) {
	            return 1;
	        }
	        if(max==1) {
	            return 2;
	        }
	        ar4.add(-1);
	        for (int i = 0; i < max+1; i++) {
	            ar4.add(0);
	            
	        }
	        for (Integer integer : ar3) {
	            ar4.set(integer, integer);
	        }
	        System.out.println(ar4);
	        return ar4.indexOf(0);
	    }
}
