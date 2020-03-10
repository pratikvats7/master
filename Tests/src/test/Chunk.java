package test;

import java.util.ArrayList;
import java.util.Collections;

public class Chunk {

	public static void main(String[] args) {
		String st = "aabbbbbbaaaabbbbaaaaabbb";
		System.out.println("max is " + find(st, 3));
		System.out.println("max2 is " + find2(st, 3));
	}

	private static int find2(String st, int B) {

		int len = st.length();

		if (!(st.contains("b")))
			return len;
		if (len <= B)
			return len;
		int max = 0;
		char ch[] = st.toCharArray();
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int d = 0;
		for (char c : ch) {

			if (c == 'b')
				ar.add(d);
			d++;
		}

		// if (st.charAt(len - 1) == 'a')
		ar.add(len);
		if (st.charAt(0) == 'a') {
			ar.add(0, -1);
			ar1.add(ar.get(1 + B) + ar.get(0) + 1);
		}
		System.out.println(ar + "ar");
		ar1.add(ar.get(1 + B) - ar.get(0) + 1);
		for (int i = 1; i < ar.size() - B; i++) {
			int sum = 0;
			// if (ar.get(i) == -1 && ar.size() > (i + 1 + B))
			// ar1.add(ar.get(i + 1 + B) + ar.get(i) + 1);
			// if (i >= 1)
			sum = (ar.get(i) - ar.get(i - 1) - 1);
			ar1.add(ar.get(i + B) - ar.get(i) + sum);
		}
		System.out.println(ar1);
		if (ar1.size() == 0)
			return len;

		max = Collections.max(ar1);

		return max;
	}

	private static int find(String A, int B) {

		if (!(A.contains("b")))
			return A.length();
		int max = 0;
		String str = A;
		while (A.contains("b")) {

			// System.out.println(A);
			int index1 = A.indexOf("b");
			// System.out.println("dd" + index1);
			for (int i = 0; i < B; i++) {
				A = A.replaceFirst("b", "a");
			}
			// System.out.println(A);

			int index = A.indexOf("b");
			// System.out.println(index);

			if (index > -1) {
				// System.out.println(str.length());
				str = str.substring(index1 + 1);
				A = str;
				// System.out.println(A.length());
				if (index > max) {
					max = index;
				}
				// System.out.println("inside");
			}
		}
		if (A.length() > max)
			max = A.length();
		return max;
	}

}
