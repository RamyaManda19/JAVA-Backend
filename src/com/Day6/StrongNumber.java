package com.Day6;
import java.util.Scanner;

public class StrongNumber {
    public static void strongNum(int n) {
        int original = n;
        int sum = 0;
        while(n != 0) {
            int rem = n % 10;
            int fact = 1;
            for(int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if(sum == original) {
            System.out.print("Strong Number");
        } else {
            System.out.print("Not Strong Number");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        strongNum(n);
    }
}