package incomplete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersLessThanIncomplete {
	public static void main(String[] args) {
		Integer[] arr = {  0,1, 2, 5 };
		List<Integer> ar = new ArrayList<>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ar = Arrays.asList(arr);
		for (Integer integer : ar) {
			A.add(integer);
		}

		System.out.println(solve(A, 2, 21) + "result");
	}

	public static int solve(ArrayList<Integer> A, int B, int C) {
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		int flag = 0;
		if (B > A.size())
			return 0;
		for (Integer integer : A) {
			if(integer.equals(0))
			{
				flag=1;
				break;
			}
		}
		if (B == 1) {
			int count = 0;
			for (Integer integer : A) {
				if (integer < C)
					count++;
			}
			System.out.println("in 1        "+count);
			if(flag==1)
				return count-1;
			return count;
		}

		ArrayList<Integer> ar2 = new ArrayList<>();
		int t = (int) (C / (Math.pow(10, B - 1)));
		System.out.println("t hai" + t);
		int c1 = 0;
		int sum1 = (int) Math.pow(A.size(), B-1);
		System.out.println(sum1+ "www");
		for (Integer integer : A) {
			c1++;
			if (integer > t) {
				System.out.println("integer hai" + integer + " t hai" + t);
				break;
			}else if (integer == t) {
				int x = (int) ((int) C % Math.pow(10, B - 1));
				System.out.println("in else");
				System.out.println(x);
				System.out.println(c1);
				System.out.println((c1 - 1) * (Math.pow(A.size(), B - 1)) - sum1 * flag);
				System.out.println(B);
				return ((int) ((int) (solve(A, B - 1, x)) + ((c1 - 1) * (Math.pow(A.size(), B - 1) - sum1 * flag))));
			}
		}
			System.out.println("in main else");
			System.out.println(c1);
			return (int) ((c1 - 1) * (Math.pow(A.size(), B - 1)) - sum1*flag);
		}
		// return 9;
	}

