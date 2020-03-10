package test;

import java.util.Scanner;

public class StringConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strTable = scanner("Table NAme");
		String mystr = scanner("Create Table");

		System.out.println("my out " + mystr);
		inserq(mystr, strTable);
	}

	private static void inserq(String mystr, String tableName) {
		// TODO Auto-generated method stub
		String[] ar = mystr.split(":");
		String insert = "insert into " + tableName + "(?,?,?,?,?,?,?,?)";
		for (int i = 1; i < ar.length; i++) {
			// System.out.println(ar[i]);
			if (ar[i].equals("int,") || ar[i].equals("varchar,")) {
				System.out.println(ar[i - 1]);
				insert = insert.replaceFirst("\\?", ar[i - 1]);
			}
		}

		String str2 = "values(?,?,?,?)";
		String str3 = scanner("values");
		System.out.println(insert);
		System.out.println(str3);
		String[] ar2 = str3.split(",");
		for (String string : ar2) {
			str2 = str2.replaceFirst("\\?", string);
		}
		insert = insert + " " + str2 + ";";
		insert = insert.replaceAll("\\,\\?", "");
		System.out.println(insert);
	}

	private static String scanner(String str) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter " + str);
		String mystr = keyboard.next();
		while (!(mystr.endsWith(";"))) {
			mystr += ":" + keyboard.next();

		}
		return mystr.substring(0, mystr.length() - 1);
	}

}
