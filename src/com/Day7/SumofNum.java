package com.Day7;
import java.util.Scanner;
public class SumofNum {
	public static void sumofNumbersUptoRange(int n,int m){
		int sum=0;
		for(int i=n;i<=m;i++) {
			sum+=i;
			
		}
		System.out.print(sum);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		sumofNumbersUptoRange(n,m);
	}

}
