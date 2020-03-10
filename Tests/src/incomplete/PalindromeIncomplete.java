package incomplete;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PalindromeIncomplete {
	public static void main(String[] args) {
		pailndrome("bbab");
	}
	
	 private static void pailndrome(String string) {
		 System.out.println(string);
		 String[] A = string.split("");
		List<String> ar = Arrays.asList(A);
		int c=0;
		int index=0;
		for (String string2 : ar) {
			
			if(Collections.frequency(ar, string2)==1)
			{
				System.out.println(string2);
				index=ar.indexOf(string2);
				break;
			}
		}
		System.out.println(c);
		System.out.println(index);
		int left=index-1;
		int right=index+1;
		int flag=0;
		while(left+right<string.length() && left>=0 && right<string.length()) {
			System.out.println(right);
			System.out.println(left);
			if(string.charAt(left)!=string.charAt(right)) {
				System.out.println(string.charAt(left));
				System.out.println(string.charAt(right));
				flag=1;
				break;
			}
			left--;
			right++;
		}
		if(flag==0 ) {
			System.out.println(string.length());
			System.out.println(index);
			System.out.println(string.length()-((index*2)+1)+"Answer1");
		}
		else {
			System.out.println(left+" left index");
			System.out.println(string.length()-left+"Answer");
		}
	}

	public static int solve(String A) {
		 int sum=0;
		 int l= A.length();
	        for (int i = 0; i < A.length(); i++) {
				if("aeiouAEIOU".contains((A.charAt(i)+""))){
					sum+=(l-i);
				}
			}
			return sum%10003;
	    }

	private static String zigZag(String A, int B) {
		if (B >= A.length() || B == 1)
			return A;
		String str3 = "";
		String str2 = "";
		 System.out.println(A.length());
		// System.out.println(A.length()%B);
		int q = 0;
		int l = A.length();
		int t = 0;
		for (int i = 1, c = 0; c < A.length(); i++) {
			if (i % (B + 1) == 0) {
				int d = c + B - 2;
				if (d >= A.length()) {
					// A += (int) Math.pow(10, d - A.length());
					for (int j = 0; j < d-l; j++) {
						A += "$";
					}
					t = d - l;
					;
				}
				System.out.println(A);
				System.out.println(d+"d");
				System.out.println(c+"c");
				System.out.println(A.length());
				StringBuilder output = new StringBuilder(A.substring(c, d)).reverse();
				System.out.println("done");
				str3 += output;
				c += (B - 2);

			} else {
				str3 += A.charAt(c);
				c++;
			}
		}
		str3 = str3.substring(0, l + t);
		// System.out.println(str3);
		int count = 1;
		int ind = 0;
		int i = 0;
		int fir = 0;
		//System.out.println(str3.length());
		while (count <= str3.length()) {
			if (fir == 0) {
				str2 += (str3.charAt(i));
				count++;
				fir = 1;
			}
			if (ind == 0 || ind == B - 1) {
				i += B + B - 2;
			} else {
				i = i + B - 1;
			}
			if (i >= str3.length()) {
				ind++;
				i = ind;
				fir = 0;
				continue;
			}
			str2 += (str3.charAt(i));
			count++;
		}
		str2 = str2.replaceAll("\\$", "");
		return str2;
	}

}
