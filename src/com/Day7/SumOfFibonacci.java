package com.Day7;
import java.util.Scanner;

public class SumOfFibonacci {
	
    public static void sumOfFibonacci(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + first;
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.print(sum);
    }

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		sumOfFibonacci(n);

	}

}
