package com.Day7;
import java.util.Scanner;
public class SumofPrimeNum {
	public static void sumofPrimeNum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=n;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum+=i;
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		sumofPrimeNum(n);
	}

}
