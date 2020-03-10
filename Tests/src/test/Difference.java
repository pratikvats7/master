package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Difference {
	public static void main(String[] args) {
		Integer[] ar = { 1,2,3};

		ArrayList<Integer> A = new ArrayList<>();

		A.addAll(Arrays.asList(ar));

		System.out.println(difference(A, 0));

	}

	public static int difference(ArrayList<Integer> A, int B) {
		int left = 0;
		int left2 =1;
		while (left<A.size() && left2<A.size() && left!=left2) {
			int diff = A.get(left2) - A.get(left);
			if (diff > B)
				left++;
			else if(diff< B)
				left2++;
			if(diff==B)
				return 1;

		}
		return 0;
	}
}
