package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxSpecialProduct {
	public static void main(String[] args) {

		Integer[] arr1 = { 90,1,3,66,1,22,4,9,8,1,22,20,21,88,89,99};

		List<Integer> ar1 = Arrays.asList(arr1);

		System.out.println(maxSpecialProduct(ar1));
	}
	    public static int maxSpecialProduct(List<Integer> ar1) {
		if (ar1.size() <= 1)
			return 0;
		int j = 0;
		int k = 0;
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		ArrayList<Integer> ar4 = new ArrayList<Integer>();
		
		for (int i = 1; i < ar1.size(); i++) {
			if(ar1.get(i)<ar1.get(i-1))
			{
			ar3.add(ar1.get(i-1));
			
			ar4.add(i-1);
			}
		}
		ar3.add(ar1.get(ar1.size()-1));
		ar4.add(ar1.size()-1);
		
		System.out.println(ar3+"ar3");
		System.out.println(ar4+"ar4");
		for (int i = 1; i < ar3.size(); i++) {
			j = i - 1;
			k = i + 1;
			int c=0;
			int d=0;
			int prod=1;

			// System.out.print(ar1.get(i) + " ");
			while (j >= 0) {
				if (ar3.get(j) > ar3.get(i)) {
					c=ar4.get(j);
					break;
				}
				j--;
			}
			while (k < ar3.size()) {
				if (k < ar3.size() && ar3.get(k) > ar3.get(i)) {
					
					d=ar4.get(k);

					break;
				}
				k++;
			}
			System.out.println(c+"  c   "+d+" k  ");
			ar2.add(c*d);
		}
		return Collections.max(ar2);
	}
	// System.out.println(ar2);
	// System.out.println(Collections.max(ar2)+"maxxxxx");

}
