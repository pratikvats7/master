package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		TestObject t1 = new TestObject();
		t1.setA(9);
		t1.setC("A");
		TestObject t2 = new TestObject();
		t2.setA(12);
		t2.setC("A");
		TestObject t3 = new TestObject();
		t3.setA(8);
		t3.setC("A");
		ArrayList<TestObject> A = new ArrayList<TestObject>();
		A.add(t1);
		A.add(t2);
		A.add(t3);
		ArrayList<TestObject> ar2 = new ArrayList<>();
		ar2 = largestNumber(A);
		for (TestObject testObject : ar2) {
			System.out.println(testObject.getA());
		}
	}

	public static ArrayList<TestObject> largestNumber(ArrayList<TestObject> A) {

		A.sort(new Comparator<TestObject>() {
			public int compare(TestObject t1, TestObject t2) {
				return (t1.getC() + (t1.getA() + "").length()*0.1 + t1.getA())
						.compareTo(t2.getC() + (t2.getA() + "").length()*0.1 + t2.getA());
			}
		});

		return A;

	}
}
