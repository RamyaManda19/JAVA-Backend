package com.bank;

public class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;
	double amount;
	 BankAccount(int accountNumber,String accountHolder,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}	
	 
	 //getters
		public int getAccountNumber() {
			 return accountNumber;
		}
		public String getAccountHolder() {
			 return accountHolder;
		}
		public double getBalance() {
			 return balance;
		}
		
		
		//setters

		public void setBalance(double balance){
			this.balance=balance;
		}
		
		public void deposit(double amount) {
				balance+=amount;
				
		} 
			public void withdraw(double amount) {
		        if (balance >= amount) {
		            balance -= amount;
		        } else {
		            System.out.println("Insufficient Balance");
		        }
		    }
		}	



