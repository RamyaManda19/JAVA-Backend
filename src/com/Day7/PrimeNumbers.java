package com.Day7;

import java.util.Scanner;

public class PrimeNumbers {

    public static void primeNumUptoN(int n, int m) {

        for (int i = n; i <= m; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        primeNumUptoN(n, m);
    }
}