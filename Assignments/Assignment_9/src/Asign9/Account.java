package Asign9;

import java.util.Scanner;

class MyException extends Exception{
	String message;
	
	public MyException(String message) {
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}
public class Account {
	
	double balance;
	
	public Account(){
		balance=0;
	}

	public Account(double bal) {
		this.balance=bal;
	}
	
	public void deposite(double amount) {
		balance=balance+amount;	
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws MyException {
		if(amount>15000)
			throw new MyException("Overlimit");
		else if(balance<amount)
			throw new MyException("InsufficientBalance");
		else
			balance=balance-amount;
	}
	
}



