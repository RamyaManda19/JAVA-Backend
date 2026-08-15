package com.Day6;
import java.util.Scanner;

public class PrimeNumber {
	public static void primeNumber(int n) {
		int count=1;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print("Prime");
		}else {
			System.out.print("Not a Prime");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		primeNumber(n);
	}

}
