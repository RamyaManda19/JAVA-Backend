package com.bankapp;
import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Name:");
		String name=sc.nextLine();
		System.out.print("Enter your Address:");
		String Address=sc.nextLine();
		System.out.print("Enter your Phone Number:");
		Long phoneNumber=sc.nextLong();
		System.out.print("Enter your initial deposit balance:");
		double amount=sc.nextDouble();
		BankApplication b=new BankApplication(name,Address,phoneNumber,amount);
		while(true) {
			System.out.println();
			 System.out.println("*******Select an Option from below****");
			 System.out.println("1.Withdraw");
			 System.out.println("2.Deposit");
			 System.out.println("3.Show Balance");
			 System.out.println("4.Exit");
			 System.out.print("Enter Your option[1-4]:");
			 int choice=sc.nextInt();	
			
		switch(choice) {
		case 1:
			System.out.print("Enter your Withdrawl Amount:");
			 amount=sc.nextDouble();
			 b.withdraw(amount);
			 break;
			
			 
		case 2:
			System.out.print("Enter your Deposit Amount:");
			 amount=sc.nextDouble();
			 b.deposit(amount);
			 break;
			 
		case 3:
			
			b.showBalance();
			break;
			
		case 4:
			System.out.println("Thank You!");
			break;
			
		default:
			System.out.print("Invalid Choice");
			
		}
	}
		
}
}
