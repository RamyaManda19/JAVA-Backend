package com.Day6;
import java.util.Scanner;

public class PerfectNum {
	
	public static void isperfectNumber(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum == n) {
		    System.out.print("Perfect Number");
		} else {
		    System.out.print("Not Perfect Number");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		isperfectNumber(n);
	}

}
