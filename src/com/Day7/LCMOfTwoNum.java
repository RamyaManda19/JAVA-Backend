package com.Day7;
import java.util.Scanner;

public class LCMOfTwoNum {
	public static void lcm(int n, int m) {
		        int lcm;
		        if (n > m) {
		            lcm = n;
		        } else {
		            lcm = m;
		        }
		        while (true) {
		            if (lcm % n == 0 && lcm % m == 0) {
		                break;
		            }
		            lcm++;
		        }
		        System.out.print(lcm);
		    }
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        int n = s.nextInt();
		        int m = s.nextInt();
		        lcm(n, m);
		    }
		}
	

