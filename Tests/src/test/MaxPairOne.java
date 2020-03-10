package test;

import java.util.ArrayList;

public class MaxPairOne {

	public static void main(String[] args) {

		String[] ar1 = { "a" };
		ArrayList<String> ar = new ArrayList<String>();

		for (String string : ar1) {
			ar.add(string);
		}
		int i = (int) combinations(17);
		System.out.println(i);
		// System.out.println(hs.size());

	}

	public static int combinations(int A) {
		if (A == 1 || A == 0)
			return 1;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(1);
		for (int i = 2; i <= A; i++) {
			ar.add(ar.get(i-1)+(i-1)*ar.get(i-2));
		}
		return ar.get(A)%10003;

	}

}