package com.neil;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// StringBuilder has reverse class
		// System.out.println(new StringBuilder(in.nextLine()).reverse().toString());

		// StringBuilder uses the following method to imploment reverse class.
		String input = in.nextLine();
		char value[] = input.toCharArray();
		int n = input.length() - 1;
		for (int j = (n - 1) >> 1; j >= 0; j--) {
			int k = n - j;
			char cj = value[j];
			char ck = value[k];
			value[j] = ck;
			value[k] = cj;

		}

		in.close();
		System.out.print(String.valueOf(value));
	}
}
