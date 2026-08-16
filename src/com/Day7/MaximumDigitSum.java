package com.Day7;
import java.util.Scanner;

public class MaximumDigitSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int maxSum = 0;
		int maxNumber = 0;

		for (int i = 1; i <= n; i++) {

			int num = s.nextInt();

			int temp = num;
			int sum = 0;

			while (temp > 0) {

				int digit = temp % 10;

				sum += digit;

				temp = temp / 10;
			}

			if (sum > maxSum) {
				maxSum = sum;
				maxNumber = num;
			}
		}

		System.out.print(maxNumber);
	}
}