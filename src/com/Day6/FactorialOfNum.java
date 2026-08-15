package com.Day6;
import java.util.Scanner;

public class FactorialOfNum {
	
	public static void fact(int n) {
		int fact=1;
		for(int i=1;i<n;i++){
			fact=fact+fact*i;
		}
		System.out.print(fact);
				
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fact(n);
	}

}
