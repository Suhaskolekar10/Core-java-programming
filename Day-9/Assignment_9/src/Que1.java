import java.util.Scanner;

class MyException extends Exception{
	String message;

	public MyException(String message) {
		this.message = message;
	}

	public String toString() {
		return message;
	}
	
}
class Account
{
	private double balance;
	
	//Parameterized constructor
	public Account(double balance) {
		this.balance = balance;
	}
	
	//Default constructor
	public Account() {
		this.balance=0.00;
	}
	
	
	public void withdraw(double amount) throws MyException
	{
		if(amount>15000)
			throw new MyException("Exceeds withdrawl limit");
		else if(balance<amount)
			throw new MyException("Insufficient account balance");
		else
			balance=balance-amount;
	}
	
	public void deposite(double amount)
	{
		balance=balance+amount;
	}

	public double getBalance() {
		return balance;
	}
	
	
}



public class Que1 {

	public static void main(String[] args) {
		double amount;
		Account a1=new Account();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Deposite amount");
			System.out.println("2.withdraw amount");
			System.out.println("3.display amount balance");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter amount to deposite:");
				amount=sc.nextDouble();
				a1.deposite(amount);
				break;
			case 2:
				System.out.println("Enter amount to withdraw:");
				amount=sc.nextDouble();
				try
				{
				    a1.withdraw(amount);	
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
			case 3:
				
				System.out.println(a1.getBalance());
				
			}
			
		}
		
	}

}
