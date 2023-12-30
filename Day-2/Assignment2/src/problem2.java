/*
 Write a program to accept and display 3 by 3 matrix. Use enhanced for loop for display.
Find the transpose of a matrix and print the transpose. 
Accept another matrix of same dimensions.  Find the addition of two matrices and print the resultant matrix. 
 */

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		int temp1,temp2;
		Scanner sc=new Scanner(System.in);
		int [][] a=new int [3][3];
		
		
//first Problem
		System.out.println("Enter elements to array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");                    //1st print
			}
			System.out.println();
		}
		
//Transpose of matrix
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
			
				if (i==j)
				{
					continue;
				}
				else
					
				temp1=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp1;
       
			}
		}
		System.out.println("Transpose of matrix A:-");
		for (int []temp:a)
		{
			for(int val:temp)
			{
				System.out.print(val+" ");                 //2nd print
			}
			System.out.println();
		}

		
//Addition of two matrices
		int [][] b=new int [3][3];
		int [][] c=new int [3][3];
		System.out.println("Enter elements to array B:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}	
		for (int []temp:b)
		{
			for(int val:temp)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
//Addition operation:-
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition of two matrices");
		
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