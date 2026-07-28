package com.bankapp;

public class BankApplication {
String customerName;
String customerAddress;
long phoneNumber;
double balance;
public BankApplication(String customerName,String customerAddress,long phoneNumber,double balance) {
	this.customerName=customerName;
	this.customerAddress=customerAddress;
	this.phoneNumber=phoneNumber;
	this.balance=balance;
	System.out.print("Account Created Successfully");

}

public void deposit(double amount) {
	if(amount<0) {
		System.out.println("Invalid Amount");
	}else {
		balance+=amount;
	}
	System.out.println("Deposit Success"+","+"available balance:"+balance);
}
public void withdraw(double amount) {
	if(amount<0) {
		System.out.println("Invalid withdrawl Amount");
	}else if(balance<amount) {
		System.out.println("Insufficient Funds");
	}else {
		balance-=amount;
	}
	System.out.println("Withdraw Successful"+","+"remaining balance:"+balance);
	}
public void showBalance() {
	System.out.print("Updated Balance:"+balance);
}
}

