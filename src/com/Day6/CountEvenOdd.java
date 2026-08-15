package com.Day6;
import java.util.Scanner;

public class CountEvenOdd {
	
	public static void CountEvenDigits(int n) {
		int evencount=0;
		int oddcount=0;
		while(n!=0) {
			int rem=n%10;
			if(rem%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			n/=10;
			
		}
		System.out.println("Even:"+evencount);
		System.out.println("Odd:"+oddcount);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		CountEvenDigits(n);
	}

}
