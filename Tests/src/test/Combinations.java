package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Combinations {

	public static void main(String[] args) {

		String[] ar1 = { "a", "b", "c", "d" ,"e"};
		ArrayList<String> ar = new ArrayList<String>();

		for (String string : ar1) {
			ar.add(string);
		}
		TreeSet<String> hs = combinations(ar, 0, ar.size() - 1);
		System.out.println(hs);
		System.out.println(hs.size());

	}

	public static TreeSet<String> combinations(ArrayList<String> ar, int i, int k) {

		if (i == k) {
			TreeSet<String> abc = new TreeSet<String>();
			abc.addAll(ar);
			return abc;
		}
		String str = ar.get(i);
		String str3 = "";
		int len = ar.size();
		for (int j = i; j < len; j++) {
			if (!(ar.get(j + 1).contains(str))) {
				str3 = str + ar.get(j + 1);
				ar.add(sortString(str3));
			}
		}
		i++;

		return combinations(ar, i, k);

	}

	private static String sortString(String str) {
		char[] car = str.toCharArray();
		Arrays.sort(car);
		return String.valueOf(car);

	}

}
