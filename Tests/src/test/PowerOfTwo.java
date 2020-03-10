package test;

public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println(powerOfTwo("2048")+"result");
	}

	private static int powerOfTwo(String A) {
		int c=0;
		
		for (int i = 0; A.length()>1; i++) {
			int rem=0;
			//System.out.println(str);
			String str2="";
			for (int j = 0; j < A.length(); j++) {
				int d1= Integer.parseInt((A.charAt(j)+""));
				int d= d1+rem*10;
				str2+=d/2;
				rem= d%2;
			}
//			
			if(Integer.parseInt((A.charAt(str2.length()-1)+""))%2==1){
				return 0;
			}
			else if(str2.charAt(0)=='0')
			{
				str2=str2.substring(1);
			}
			
			A=str2;
			c++;
		}
			if(Integer.parseInt((A.charAt(0)+""))%2==1)
				return 0;
			return 1;
		
	}

}
