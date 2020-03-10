package test;

public class SquaresInARectangle {

	public static void main(String[] args) {
		System.out.println(test(35, 4, 0));
	}

	private static int test(int a, int b, int c) {
		// TODO Auto-generated method stub
		if (a == b)
			return c + 1;
		if (c == 0) {
			if (a > b) {

				c = a / b;
				a = a % b;
			} else {

				c = b / a;
				b = b % a;

			}
		}
		if(a==0 || b==0)
			return c;
		System.out.println(c);
		if (a > b)
			a = a - b;
		else
			b = b - a;
		c++;
		System.out.println(a + "a" + "   b " + b + "cccc" + c);
		return test(a, b, c);

	}
}
