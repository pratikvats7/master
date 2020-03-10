package test;

import java.util.ArrayList;
import java.util.List;

public class Rotate {

	public static void main(String[] args) {
		String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" ,"11"};
		ArrayList<String> ar1 = new ArrayList<String>();
		for (String integer : ar) {
			ar1.add(integer);
		}
		rotate(ar1);
	}

	private static void rotate(List<String> ar1) {
		System.out.println("inside rotate");
		int c = 0;
		int ind = 0;
		while (ar1.size() > 2) {

			for (int i = 2; i < ar1.size(); i++) {
				ar1.remove(i);
				ind = i;
			}
			int len = ar1.size();
			for (int i = ind - 1, d = 0; i < len; i++) {
				String n = ar1.get(i);
				ar1.remove(i);
				ar1.add(d, n);
				d++;
			}

			System.out.println(ar1);

		}

	}
}