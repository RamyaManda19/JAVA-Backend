package com.Day10;
class BankAccount{
	public int accNo;
	public int balance;
	BankAccount(int accNo,int balance){
		this.accNo=accNo;
		this.balance=balance;
	}
}
class SavingsAccount extends BankAccount{
	public int interest;
	SavingsAccount(int accNo,int balance,int interest){
		super(accNo,balance);
		interest=(balance*interest/100);
		this.interest=interest;
	}
	public void displayDetails() {
		System.out.println("Account No:"+accNo);
		System.out.println("Balance:"+balance);
		System.out.println("Intrest :"+interest);
		}
}
public class Example6 {

	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount(101,10000,5);
		sa.displayDetails();
	}

}
