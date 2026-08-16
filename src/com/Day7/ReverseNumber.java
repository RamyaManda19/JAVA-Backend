package com.Day7;
import java.util.Scanner;

public class ReverseNumber {
	public static void reverseNum(int n) {
		int res=0;
		while(n!=0) {
			int rem=n%10;
			res=res*10+rem;
			n/=10;
			
		}
		System.out.print(res);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		reverseNum(n);
	}

}
