package Test1;

import java.util.ArrayList;

public class Generate {
	public static void main(String[] args) {
		int x = 5;
		generate(x);
	}

	private static void generate(int x) {
		ArrayList<Integer> ar = new ArrayList<>();
		generateUtil(x, ar, 0);

	}

	private static void generateUtil(int x, ArrayList<Integer> ar, int sum) {

		if (sum == x) {
			System.out.println(ar);

			return;

		}
		for (int i = 1; i <= x; i++) {
			ArrayList<Integer> ar1 = new ArrayList<>();
			ar1.addAll(ar);
			ar1.add(i);
			int sum2 = sum + i;
			generateUtil(x, ar1, sum2);
			ar = new ArrayList<Integer>();
			if (sum > 0) {
				sum--;
				return;

			}

		}
	}
}
