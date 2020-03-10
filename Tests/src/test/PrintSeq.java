package test;

import java.util.ArrayList;

public class PrintSeq {

	static public void main(String[] args) {
		int k = 3, n = 5;
		printSeq(n, k);
	}

	static void printArr(ArrayList<Integer> arr, int k) {
		for (int i = 0; i < k; i++)
			System.out.print(arr.get(i) + " ");
		System.out.print("\n");
	}

	static void printSeq(int n, int k) {

		ArrayList<Integer> arr = new ArrayList<>();
		int len = 0;
		int t=1;
		printSeqUtil(n, k, len, arr,t);
	}

	private static void printSeqUtil(int n, int k, int len, ArrayList<Integer> arr,int t) {

		if(k==0)
		{
			System.out.println(arr);
			//System.out.print(t);
			return;
			
		}
		
		for (int i = t; i <= n; i++) {
			ArrayList<Integer> arr1 = new ArrayList<>();
			arr1.addAll(arr);
			arr1.add(i);
			printSeqUtil(n,k-1,len,arr1,i+1);
		}
	}

}
