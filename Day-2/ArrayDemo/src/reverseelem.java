/* Write a program to reverse the elements of an array entered by user (without using another array). Also 
 * Accept array size from the user*/
import java.util.Scanner;

//VarArgs - Variable Argument List

public class reverseelem {

	public static void main(String[] args) {
		System.out.println("Enter no of elements-");
		Scanner sc=new Scanner(System.in);
		int temp;
		int [] c=new int[sc.nextInt()];        
		

		System.out.println("Enter array elements-");
		for(int i=0; i<c.length; i++)
			c[i]=sc.nextInt(); 
		
		System.out.println("Array-");
		
		/*for(int val:c)
		{			                             //for each array:-used to print only
			System.out.print(val+" ");          //to take input we have to use ordinary for loop
		}
			
		System.out.println();
		for(int i=(c.length-1); i>-1; i--)        //reversing WORNG logic
			System.out.print(c[i]+" ");
        */
		
		for(int i=0;i<c.length/2;i++)
		{
			temp=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=temp;                                                                                                                                                                                                                                                              	
		}
			
		for(int val:c)
		{			                             //for each array:-used to print only
			System.out.print(val+" ");           //to take input we have to use ordinary for loop
		}
	}
}
