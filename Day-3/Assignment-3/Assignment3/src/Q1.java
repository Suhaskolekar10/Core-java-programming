/*
 Create a class AccountHolder with -
		Instance variables - account number, account holder name, account balance
		Class methods - constructors, getter/setter methods, deposite, withdraw
	Create an array of AccountHolder objects in main. 
	Write a menu driven program to perform -
			1. Add record for account holder
			2. Display details of all account holders.
			3. Deposite an amount into perticular account
			4. Withdraw an amount from perticular account
*/

import java.util.Scanner;

class AccountHolder
{
	private int account_number;
	private String account_holder_name;
	private double account_balance;
	
	
	public AccountHolder() {

	}

	public AccountHolder(int account_number, String account_holder_name, double account_balance) 
	{
		this.account_number = account_number;
		this.account_holder_name = account_holder_name;
		this.account_balance = account_balance;
	}
	
	public void deposite(int amount)
	{
		account_balance=account_balance+amount;
		
	}
	
	public void withdraw(int amount)
	{
		account_balance=account_balance-amount;
	}
	//@Override
	public String toString() {
		return "AccountHolder [account_number=" + account_number + ", account_holder_name=" + account_holder_name
				+ ", account_balance=" + account_balance + "]";
	}
	
	public int getAccount_number() {
		return account_number;
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		AccountHolder []a=new AccountHolder[10];
		while(true)
		{
			System.out.println("1.Add a record");
			System.out.println("2.Display all data");
			System.out.println("3.Deposite");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter info:");
				a[cnt++]=new AccountHolder(sc.nextInt(),sc.next(),sc.nextDouble());
				break;
			case 2:
				for(int i=0;i<cnt;i++)
				{
					System.out.println(a[i]);
				}
				break;
			
			case 3:
				System.out.println("Enter acc no to deposite:");
				int acno=sc.nextInt();
				System.out.println("Enter amount to be deposited:");
				int amt=sc.nextInt();
				for(int i=0;i<cnt;i++)
				{
					if(acno==a[i].getAccount_number())
						{
						a[i].deposite(amt);
						}
				}
				break;
				
			case 4:
				System.out.println("Enter acc no to withdraw:");
				    acno=sc.nextInt();
				System.out.println("Enter amount to be withdraw:");
					 amt=sc.nextInt();
				for(int i=0;i<cnt;i++)
				{
					if(acno==a[i].getAccount_number())
						{
							a[i].withdraw(amt);							
						}
				}
				break;
			case 5:
				System.exit(0);
			}
		}
	}
}

