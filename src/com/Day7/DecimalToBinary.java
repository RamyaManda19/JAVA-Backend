package com.Day7;

import java.util.Scanner;

public class DecimalToBinary {

	public static void decimaltobinary(int n) {

		int res = 0;
		int place = 1;

		while (n != 0) {

			int binary = n % 2;

			res = res + binary * place;

			place = place * 10;

			n = n / 2;
		}

		System.out.print(res);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		decimaltobinary(n);
	}
}