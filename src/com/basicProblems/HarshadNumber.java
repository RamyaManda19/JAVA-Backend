package com.basicProblems;
import java.util.*;

public class HarshadNumber {
	public int getSum(int num) {
		int sum=0;
		while(num!=0) {
		int rem =num%10;
		sum+=rem;
		num/=10;
		
	}
	return sum;
	}
	
	public boolean isHarshad(int num) {
		return num%getSum(num)==0;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=s.nextInt();
		HarshadNumber obj=new HarshadNumber();
		if(obj.isHarshad(num)){
			System.out.print(num+" "+"is a Harshad Number");
		}else {
			System.out.print(num+" "+"is not a Harshad Number");
		}
		s.close();
	}
}

