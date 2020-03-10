package test;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		Integer[] ar = { 2,9,0,9, 9, 9 };
		ArrayList<Integer> A = new ArrayList<>();
		A.addAll(Arrays.asList(ar));

		System.out.println(plusOne(A));
	}

	private static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int sum;
		int rem = 0;
		sum = A.get(A.size() - 1) + 1;
		rem = sum / 10;
		A.set(A.size() - 1, sum % 10);
		for (int i = A.size() - 2; i >= 0; i--) {
			sum = A.get(i) + rem;
			A.set(i, sum % 10);
			rem = (sum) / 10;
		}
		if(rem==1)
			A.add(0,1);
		return A;
	}

}
