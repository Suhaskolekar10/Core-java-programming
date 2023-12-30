/*
 
Write a method “add” to add n number of integers. Use VarArgs
 */

import java.util.Scanner;

public class Problem4 {
    public static int add(int ...a)
    {
    	int sum=0;
    	for(int i=0;i<a.length;i++)
    	{
    		sum+=a[i];
    	}
		return sum;
    }
	
	
	public static void main(String[] args) {
		System.out.println(add(1,2,3,4,5,9)); 
		System.out.println(add(1,2,3,4,5,7,5,9)); 

	}                                        //You can give any number of value inside add()

}
