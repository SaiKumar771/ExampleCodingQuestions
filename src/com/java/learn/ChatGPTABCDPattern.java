package com.java.learn;

public class ChatGPTABCDPattern {
	public static void main(String[] args) {
		int n = 5;
		printPattern(n);
	}

	public static void printPattern(int n) {
		// Upper part of the pattern
		for (int i = 1; i <= n; i++) {
			// Print the left side of the pattern
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (64 + j));
			}
			// Print the spaces in the middle
			for (int j = 0; j < 2 * (n - i); j++) {
				System.out.print(" ");
			}
			// Print the right side of the pattern
			for (int j = i; j > 0; j--) {
				System.out.print((char) (64 + j));
			}
			System.out.println();
		}

		// Lower part of the pattern
		for (int i = 1; i < n; i++) {
			// Print the left side of the pattern
			for (int j = 1; j <= n - i; j++) {
				System.out.print((char) (96 + j));
			}
			// Print the spaces in the middle
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			// Print the right side of the pattern
			for (int j = n - i; j > 0; j--) {
				System.out.print((char) (96 + j));
			}
			System.out.println();
		}
	}
}
