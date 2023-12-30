//Q.9:-Write a program to display whether a user entered number is prime or not.

import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		int number,prime=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		
		for (int i=2;i<number;i++)
		{
			if (number%i==0)
			{
				prime=0;
				break;
			}
		}
		if (prime==0)
		{
			System.out.println(number+" is a not prime number");
		}
		else
		{
			System.out.println(number+" is a prime number");
		}
		

	}

}
