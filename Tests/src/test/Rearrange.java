package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Rearrange {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		Integer ar1[] = { 4, 8, 1, 5, 10, 9, 3, 7, 2, 0, 6 };
		ar.addAll(Arrays.asList(ar1));
		rearrange(ar);
	}

	private static void rearrange(ArrayList<Integer> a) {
		int l = a.size();
		for (int i = 0; i < a.size(); i++) {
			a.set(i, (a.get(i) + (a.get(a.get(i))%l)*l));
		}
		for (int i = 0; i < a.size(); i++) {
			a.set(i, a.get(i)/l);
		}
		System.out.println(a);

	}
}
