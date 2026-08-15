package com.Day6;
import java.util.Scanner;

public class CountFactorsOfNum {

	public static void factorCount(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		factorCount(n);
	}


}
