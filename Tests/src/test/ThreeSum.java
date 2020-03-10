package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum {
	public static void main(String[] args) {
		Integer[] ar = { 1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3 };
		ArrayList<Integer> A = new ArrayList<>();
		A.addAll(Arrays.asList(ar));

		System.out.println(threeSum(A));
	}

	public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
     Set<ArrayList<Integer>> ar2= new HashSet<>();
     for (int i = 0; i < A.size(); i++) {
         int x = A.get(i);
         int left = i + 1;
         int right = A.size() - 1;
          //System.out.println(A.get(i)+""+A.get(left));

         while (left < right) {
         int sum=x + A.get(left) + A.get(right);
             if ( sum== 0) {
                 ArrayList<Integer> ar1 = new ArrayList<Integer>();
                 ar1.add(A.get(i));
                 ar1.add(A.get(left));
                 ar1.add(A.get(right));
                     ar2.add(ar1);
             }

             if (sum > 0)
                 right--;
             else
                 left++;

         }
        

     }
     return new ArrayList<ArrayList<Integer>>(ar2);
     
 }
}
