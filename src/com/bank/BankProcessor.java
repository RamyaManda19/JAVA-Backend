package com.bank;

public class BankProcessor {

	public static void main(String[] args) {
		BankAccount bank=new BankAccount(101, "Ramya", 1000.0);
		bank.getBalance();
		bank.deposit(500);
		System.out.println("Current Balance: "+bank.getBalance());
		bank.withdraw(300);
		System.out.println("Updated Balance: "+bank.getBalance());
		
	}

}
