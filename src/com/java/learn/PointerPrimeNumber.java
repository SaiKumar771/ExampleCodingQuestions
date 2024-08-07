package com.java.learn;

import java.util.Scanner;

public class PointerPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to check whether it is Pointer Prime or Not:");
		int pointerPrime = sc.nextInt();
		sc.close();
		int temp = pointerPrime;
		int prod = 1;
		while (temp != 0) {
			int div = temp % 10;
			prod *= div;
			temp = temp / 10;
		}
		int finalPointerPrime = pointerPrime + prod;
		int count = 0;
		for (int i = pointerPrime; i <= finalPointerPrime; i++) {
			if (primeOrNot(i)) {
				count++;
			}
		}
		System.out.println("count:"+count);
		if(count==2)
		{
			System.out.println("Given number is pointer prime: "+finalPointerPrime);
		}
		else
		{
			System.out.println("Not a pointer prime: "+finalPointerPrime);
		}

	}

	private static boolean primeOrNot(int number) {
		// Check if number is less than 2
		if (number < 2) {
			return false;
		}

		// Check if number is 2 or 3
		if (number == 2 || number == 3) {
			return true;
		}

		// Eliminate even numbers and multiples of 3
		if (number % 2 == 0 || number % 3 == 0) {
			return false;
		}

		// Check from 5 to sqrt(number) with a step of 6
		for (int i = 5; i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

}
