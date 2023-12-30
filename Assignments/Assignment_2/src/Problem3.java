/*
 Write a program which will calculate multiplication of two 3 by 3 matrices.

 */

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int [][] a=new int [3][3];
		int [][] b=new int [3][3];
		Scanner sc=new Scanner(System.in);
//first matrix:	
		System.out.println("Enter element to first matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix A=");
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");                    //1st print
			}
			System.out.println();
		}
//second matrix:
		System.out.println("Enter element to the second matrix:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix B=");
		for (int []temp:b)
		{
			for(int val:temp)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		 
//Multiplication of two matrices:
		int [][] c=new int [3][3];
		for (int i=0;i<(a.length);i++)
		{
			for(int j=0;j<(b.length);j++)
			{
				for(int k=0;k<(a.length);k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("multiplication of two matrices");
		
		for (int []temp:c)
		{
			for(int val:temp)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

}
