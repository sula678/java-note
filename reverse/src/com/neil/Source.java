package com.neil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source {
	public static void main(String[] args) {

		// StringBuilder also uses the following method to imploment reverse class.
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input = stdReader.readLine();

			char value[] = input.toCharArray();
			int n = input.length() - 1;
			for (int j = 0; j <= (n - 1) >> 1; j++) {
				int k = n - j;
				char cj = value[j];
				char ck = value[k];
				value[j] = ck;
				value[k] = cj;

			}

			stdReader.close();
			System.out.println(String.valueOf(value));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
