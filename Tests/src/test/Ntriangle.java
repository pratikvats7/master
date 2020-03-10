package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ntriangle {
	public static void main(String[] args) {
		Integer[] ar = { 6, 7, 8, 10, 12, 14, 50 };
		ArrayList<Integer> A = new ArrayList<>();
		A.addAll(Arrays.asList(ar));

		System.out.println(nTriang(A));
	}

	public static int nTriang(ArrayList<Integer> A) {
		if (A.size() < 3)
            return 0;
        Collections.sort(A);
        A.add(1000000007);
        int sum = 0;
        for (int i = 0; i < A.size() - 2; i++) {
            int left2 = i + 1;
            for (int j = left2 + 1; j < A.size() && left2 <= j; j++) {
                if (A.get(i) + A.get(left2) > A.get(j))
                    continue;
                    sum += j - left2 - 1;
                    left2++;
                    j--;

            }
            sum=(int) sum%1000000007 ;
        }
        return (int) (sum % (1000000007));
    }

}

