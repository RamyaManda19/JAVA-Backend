package com.basicProblems;
import java.util.Scanner;
public class PerfectNumber {
    static Scanner scanner = new Scanner(System.in);

    public boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum+=i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        PerfectNumber obj = new PerfectNumber();
        System.out.print("Enter a Number:");
        int num = scanner.nextInt();
        System.out.println(obj.isPerfect(num) ? "Perfect Number" : "Not a Perfect Number");
    }
}