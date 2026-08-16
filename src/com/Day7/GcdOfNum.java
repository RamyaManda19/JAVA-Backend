package com.Day7;
	import java.util.Scanner;
	public class GcdOfNum {
	    public static void findGCD(int n, int m) {
	        int gcd = 1;
	        for (int i = 1; i <= n && i <= m; i++) {
	            if (n % i == 0 && m % i == 0) {
	                gcd = i;
	            }
	        }

	        System.out.print(gcd);
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        int n = s.nextInt();
	        int m = s.nextInt();

	        findGCD(n, m);
	    }
	}


