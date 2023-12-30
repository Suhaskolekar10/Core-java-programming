//Q.7:-Write a program to find maximum of three numbers using conditional operators.

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		n1=sc.nextInt(); 
		n2=sc.nextInt(); 
		n3=sc.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println(+n1+" is gretest");
		}
		else if(n2>n3)
		{
			System.out.println(+n2+" is gretest");
		}
		else
		{
			System.out.println(+n3+" is gretest");
		}
	}
}
