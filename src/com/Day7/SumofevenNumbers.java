package com.Day7;
import java.util.Scanner;

public class SumofevenNumbers {
	
	public static void sumOfEven(int n,int m) {
		int sum=0;
		for(int i=n;i<=m;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		sumOfEven(n,m);
		

	}

}
