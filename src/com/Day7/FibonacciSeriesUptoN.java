package com.Day7;
import java.util.Scanner;

public class FibonacciSeriesUptoN {
	
	public static void fibonacci(int n) {
		int first=0;
		int second=1;
		for(int i=2;i<n;i++) {
			int next=first+second;
			first=second;
			second=next;
		}
		System.out.print(second);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fibonacci(n);

	}

}
