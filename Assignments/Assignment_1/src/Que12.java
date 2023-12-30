/*Write a program to check if user entered number is perfect number. 
 (A perfect number is a number for which sum of its factors equals that number e.g. 6=1+2+3,  28=1+2+4+7+14)
*/

import java.util.Scanner;

public class Que12 {

	public static void main(String[] args) {
		int number,sum=0,i;
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		
		for (i=1;i<number;i++)
		{
			if (number%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum == number)
		{
			System.out.println(number+" is a perfect number");
		}
		else
		{
			System.out.println(number+" is not a perfect number");
		}

	}

}
