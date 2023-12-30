//write a program to find maximum and minimum numbers from a 1D array without sorting the array

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements-");
		int [] a=new int [sc.nextInt()];
		
		System.out.println("Enter array elements-");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
        int min,max;   
		min=a[0];
		max=a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (max<=a[i])
			{
				max=a[i];
			}
			if (min>=a[i])
			{
				min=a[i];
			}								
		}
		System.out.println("min:"+min+"  "+"max:"+max);
	}
}
