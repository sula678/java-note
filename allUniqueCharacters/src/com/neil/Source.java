package com.neil;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print(isUniqueChars(in.nextLine()));
		in.close();
	}

	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}

		return true;
	}
}
