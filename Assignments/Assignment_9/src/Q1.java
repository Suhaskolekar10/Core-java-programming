import Asign9.Account;


import java.util.Scanner;
public class Q1 {
	
	public static void main(String[] args)  {
		double amount;
		Account ac1=new Account();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Deposite amount");
			System.out.println("2. Withdraw amount");
			System.out.println("3. Display amount balance");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter the amount to be deposited:");
				amount=sc.nextDouble();
				ac1.deposite(amount);
				break;
			case 2:
				System.out.println("Enter the amount to be withdrawn");
				amount=sc.nextDouble();
				try
				{
					ac1.withdraw(amount);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;			
			case 3:
				System.out.println(ac1.getBalance());		
			}
		}

		
	}
}