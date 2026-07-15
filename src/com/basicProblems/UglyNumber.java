package com.basicProblems;

public class UglyNumber {
	
	public boolean isUgly(int num) {
		while (num%2==0) {
			num/=2;
			
		}
		while (num%3==0) {
			num/=3;
		}
		while(num%5==0) {
			num/=5;
		}
		return num==1;
	}
	
	
	

	public static void main(String[] args) {
		UglyNumber obj=new UglyNumber();
		System.out.print(obj.isUgly(10) ?"Ugly Number":"Not a Ugly Number");

	}

}
