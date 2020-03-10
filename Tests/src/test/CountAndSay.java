package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountAndSay {
	public static void main(String[] args) {
		Integer[] arr = { 873, 855, 693, 461, 634, 102, 207, 58, 60, 972, 50, 20, 406, 90, 494, 684, 572, 841, 253, 734,
				937, 803, 482, 147, 987, 914, 997, 807, 866, 262, 526, 229, 891, 985, 905, 824, 507 };
		/*
		 * 444 994 508 72 125 299 181 238 354 223 691 249 838 890 758 675 424 199 201
		 * 788 609 582 979 259 901 371 766 759 983 728 220 16 158 822 515 488 846 321
		 * 908 469 84 460 961 285 417 142 952 626 916 247 116 975 202 734 128 312 499
		 * 274 213 208 472 265 315 335 205 784 708 681 160 448 365 165 190 693 606 226
		 * 351 241 526 311 164 98 422 363 103 747 507 669 153 856 701 695 52 319
		 */
		// 59 422 854

		List<Integer> ar = new ArrayList<>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ar = Arrays.asList(arr);
		for (Integer integer : ar) {
			A.add(integer);
		}

		System.out.println(countAndSay(7));
		// System.out.println(isPower(536870912));
		// System.out.println(nextPermutation(A));
	}

	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {

		int t = A.get(A.size() - 1);
		for (int i = A.size() - 1; i > 0; i--) {
			// if
			// System.out.println(A.get(i) + " " + A.get(i - 1));
			// System.out.println((A.get(i))<=t);

			if ((A.get(i)) > A.get(i - 1)) {
				// System.out.println(A);
				int temp = A.get(i - 1);
				for (int j = A.size() - 1; j > 0; j--) {
					if (A.get(j) > temp) {
						int temp1 = A.get(j);
						A.set(j, temp);
						A.set(i - 1, temp1);
						A.subList(i, A.size()).sort(null);
						break;
					}

				}

				return A;
			}
		}

		Collections.reverse(A);
		return A;
	}

	public static int isPower(int A) {
		int sq = (int) Math.sqrt(A);
		for (int i = 2; i <= 29; i++) {

			double d = Math.log(A) / Math.log(i);
			System.out.println(d);
			System.out.println((int) d);
			if ((d - (int) d) < 0.000000000000009) {
				return (int) d;

			}

		}
		return -1;
	}

	public static int titleToNumber(String A) {
		int sum = A.charAt(0) - 'A' + 1;

		for (int i = 1; i < A.length(); i++) {
			sum = (int) (sum + Math.pow(26, i) + (A.charAt(i) - 'A'));
		}
		return sum;
	}

	public static String countAndSay(int A) {
		System.out.println("hi");
		String st = "1";
		System.out.println(st);
		for (int i = 1; i < A; i++) {
			int count = 1;
			String str2 = "";
			int c=0;
			//System.out.println(st+"here111");
			for (int j = 0; j < st.length()-1; j++) {
				String st3 = st.charAt(j) + "";
				System.out.println();
				System.out.println(st3+"st3");
				System.out.println();
				if (st.charAt(j) == st.charAt(j + 1)) {
					count++;
					st3 = st.charAt(j) + "";
					//System.out.println();
					//System.out.println("count"+ count);
					//System.out.println();
				} else {
					str2 += count + st3;
					//System.out.println(str2+"str2");
					count=1;
				}

			}
			str2=str2+count+st.charAt(st.length()-1);
			st = str2;
		}
		//System.out.println(st+"stttttttt");
		return st;

	}
}
