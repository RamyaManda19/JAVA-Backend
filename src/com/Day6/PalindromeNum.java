package com.Day6;

	import java.util.Scanner;

	public class PalindromeNum {
		
		public static void isPalindromeNum(int n) {
			int temp=n;
			int res=0;
			while(n!=0) {
				int rem=n%10;
				 res=res*10+rem;
				n/=10;
			}
			if(temp==res) {
				System.out.print("Palindrome");
			}
			
		}

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			isPalindromeNum(n);

		}

	}


