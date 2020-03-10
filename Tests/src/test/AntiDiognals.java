package test;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiognals {

	public static void main(String[] args) {
		Integer[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		for (int i = 0; i < ar.length; i++) {
			ArrayList<Integer> B = new ArrayList<>();
			B.addAll(Arrays.asList(ar[i]));
			A.add(B);
		}

		System.out.println(diagonal(A));
	}

	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
		int len = A.size();
		int n = len * 2;
		ArrayList<Integer> arr3 = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			ArrayList<Integer> arr4 = new ArrayList<>();
			arr1.add(arr4);
			arr3.add(i - 1);
		}
		//System.out.println(arr3);
		for (int i = 0; i < A.size(); i++) {

			for (int j = 0; j < A.get(i).size(); j++) {
				arr1.get(arr3.get(i+j)).add(A.get(i).get(j));

			}
		}

		return arr1;

	}

}
