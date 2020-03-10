package Test1;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSums {
	public static void main(String[] args) {
		Integer[] arr = { 5,4,3,2,};
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar.addAll(Arrays.asList(arr));
		int n = arr.length;

		subsetSums(ar, 0, n - 1, 0,ar1);
	}

	private static void subsetSums(ArrayList<Integer> ar, 
			int l, int r, int sum,ArrayList<Integer> ar1) {
		
		if (l > r) 
        { 
            System.out.print(sum + " "); 
            return; 
        }
		
  		subsetSums(ar, l+1, r, sum+ar.get(l),ar1);
		System.out.println("hi"+sum);
		subsetSums(ar, l+1,r,sum,ar1);
		System.out.println("hi2"+sum);
	}

}
