package test;

public class printAllKLengthRec {
	public static void main(String[] args) {
		System.out.println("First Test");
		char[] set1 = { 'a', 'b' };
		int k = 3;
		printAllKLength(set1, k);

		System.out.println("\nSecond Test");
		char[] set2 = { 'a', 'b', 'c', 'd' };
		k = 1;
		printAllKLength(set2, k);
	}

	static void printAllKLength(char[] set, int k) {
		int n = set.length;
		printAllKLengthRec(set, "", n, k);
	}

	private static void printAllKLengthRec(char[] set, String string, int n, int k) {
		
		if(k==0) {
			System.out.println(string);
			return;
		}
		
		for (int i = 0; i < n; i++) {
			String str =string+set[i];
			
			printAllKLengthRec(set,str,n,k-1);
		}

	}

}
