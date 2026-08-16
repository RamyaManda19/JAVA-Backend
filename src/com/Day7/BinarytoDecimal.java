package com.Day7;
import java.util.Scanner;

public class BinarytoDecimal {
	
	public static void binarytodecimal(int n) {
		int res=0;
		while(n!=0) {
			int power=1;
			int rem=n%10;
			res=res*2+rem;
			power=power*2;
			n/=10;
			
		}
		System.out.print(res);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		binarytodecimal(n);

	}

}
