/*
Accept five integers in an array -
a) Find maximum and minimum of the integers. Do not sort the array.
b) Multiply each element of the array by 5 and store it in another array and display it.
 */

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) 
	{   int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers to array");
		int [] a=new int [5];
		int [] b=new int [5];
		
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		min=a[0];
		max=a[0];
	
		for(int i=0;i<a.length;i++)
		{
			if (max<=a[i])
			{
				max=a[i];
			}                                       //minimum and maximum
			if (min>=a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println("Max:"+max+"  "+"Min:"+min);
		
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]*5;                     //multiplying number by 5
		}
		System.out.println("array b-");
		for (int val:b)
		{
			System.out.print(val+" ");
		}
	}
}

