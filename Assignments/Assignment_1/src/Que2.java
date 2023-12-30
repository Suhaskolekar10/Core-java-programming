//Q.2:-Write a program to add two numbers and store the result in a third variable. Print the result.

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		sum=num1+num2;
		System.out.println("Addition of given numbers:-"+sum);

	}

}
