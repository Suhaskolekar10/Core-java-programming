/*Write a program to print whether user entered number is an Armstrong number.  
  Armstrong number is one for which the sum of the cube of all its digits is same as the number.  
  For example, 153 = (1*1*1) + (5*5*5) + (3*3*3)
*/

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		int number,sum=0,a,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		num=number;
		
		while (number>0)
		{
			a=number%10;
			number=number/10;
			sum=sum+(a*a*a);
		}
		if (sum == num)
		{
			System.out.println(num+" is an Armstrong number");
		}
		else
		{
			System.out.println(num+" is Not an Armstrong number");
		}

	}

}
