package com.Day6;
import java.util.Scanner;

public class ArmstrongNum {
    public static void Armstrong(int n) {
    	int original=n;
        int temp = n;
        int count = 0;
        int res = 0;
        while(temp != 0) {
            count++;
            temp /= 10;
        }
        while(n != 0) {
            int rem = n % 10;
            res = res + (int)Math.pow(rem, count);
            n /= 10;
        }
        if(res == original) {
            System.out.print("Armstrong Number");
        } else {
            System.out.print("Not Armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Armstrong(n);
    }
}