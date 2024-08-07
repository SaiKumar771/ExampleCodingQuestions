package com.java.learn;

public class ShiftOperator {

	public static void main(String[] args) {
		int a = -20; // binary: 1110 1100
		int result = a >> 2; // binary: 1111 1111 (in decimal: -5)// 1111 1011

		System.out.println(result);
		System.out.println((1 & (1 << 1)) );
	}

}
