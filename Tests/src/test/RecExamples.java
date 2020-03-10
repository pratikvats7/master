package test;

import java.util.ArrayList;

public class RecExamples {
	public static void main(String[] args) {
		// rec(16);
		ArrayList<Integer> ar = new ArrayList<>();
		// generateUtil(4, ar, 0, 1);
		//int n = 3;
		//findStrictlyIncreasingNum(0, " ", n);
		
//		int x = 100, n = 2; 
//        System.out.println(countWays(x, n)); 
		

	    System.out.println("First Test"); 
	    char[] set1 = {'a', 'b'}; 
	    int k = 3; 
	    printAllKLength(set1, k); 
	      
	    System.out.println("\nSecond Test"); 
	    char[] set2 = {'a', 'b', 'c', 'd'}; 
	    k = 1; 
	    printAllKLength(set2, k);  
	}

	private static void rec(int n) {
		System.out.print(n + " ");
		if (n <= 0)
			return;
		rec(n - 5);
		System.out.print(n + " ");
	}

	static void findStrictlyIncreasingNum(int start, String out, int n) {
		// If number becomes N-digit, print it
		if (n == 0) {
			System.out.print(out + " ");
			return;
		}

		// start from (prev digit + 1) till 9
		for (int i = start; i <= 9; i++) {
			// append current digit to number
			String str = out + i;

			// recurse for next digit
			findStrictlyIncreasingNum(i + 1, str, n - 1);
		}
	}
	static int countWaysUtil(int x, int n, int num) 
    { 
        // Base cases 
        int val = (int) (x - Math.pow(num, n)); 
        if (val == 0) 
            return 1; 
        if (val < 0) 
            return 0; 
       
        // Consider two possibilities, num is 
        // included and num is not included. 
        return countWaysUtil(val, n, num + 1) + 
               countWaysUtil(x, n, num + 1); 
    } 
	static void printAllKLength(char[] set, int k) 
	{ 
	    int n = set.length;  
	    printAllKLengthRec(set, "", n, k); 
	} 
	  
	// The main recursive method 
	// to print all possible  
	// strings of length k 
	static void printAllKLengthRec(char[] set,  
	                               String prefix,  
	                               int n, int k) 
	{ 
	      
	    // Base case: k is 0, 
	    // print prefix 
	    if (k == 0)  
	    { 
	        System.out.println(prefix); 
	        return; 
	    } 
	  
	    // One by one add all characters  
	    // from set and recursively  
	    // call for k equals to k-1 
	    for (int i = 0; i < n; ++i) 
	    { 
	  
	        // Next character of input added 
	        String newPrefix = prefix + set[i];  
	          
	        // k is decreased, because  
	        // we have added a new character 
	        printAllKLengthRec(set, newPrefix,  
	                                n, k - 1);  
	    } 
	} 
	  
	// Driver Code 
	
       
    // Returns number of ways to express 
    // x as sum of n-th power of two. 
    static int countWays(int x, int n) 
    { 
        return countWaysUtil(x, n, 1); 
    } 
       
} 
