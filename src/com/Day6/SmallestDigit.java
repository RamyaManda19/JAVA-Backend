package com.Day6;

import java.util.Scanner;

public class SmallestDigit {
	
	public static void smallestDigit(int n) {
		int smallest=Integer.MAX_VALUE;
		while(n!=0) {
			int rem=n%10;
			if(rem<smallest) {
				smallest=rem;
			}
			n/=10;
		}
		System.out.print(smallest);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		smallestDigit(n);
	}

}

