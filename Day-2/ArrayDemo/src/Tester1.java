// 1 D array
import java.util.Scanner;

public class Tester1 {

	public static void main(String[] args) {
		
		int [] a= {10,20,30,40,50};       //initialization of 1D array
		int [] b=new int[] {5,4,3,2,1};    //initialization of 1D array
		int [] c=new int[7];                //Uninitialized array
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int i=0; i<c.length; i++)
			c[i]=sc.nextInt();                
		
		System.out.println("Array-");
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]+" ");
		
		System.out.println();
		
		for(int val:c)
		{			                             //for each array:-used to print only
			System.out.print(val+" ");          //to take input we have to use ordinary for loop
		}

	}

}
