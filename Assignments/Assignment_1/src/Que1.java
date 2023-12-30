//Q.1:-Write a program to accept marks of five subjects from the user and calculate their average.

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		float maths,science,history,geography,economics;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of five subject:");
		maths=sc.nextFloat();
		science=sc.nextFloat();
		history=sc.nextFloat();
		geography=sc.nextFloat();
		economics=sc.nextFloat();
		
		float average=(maths+science+history+geography+economics)/5;
		System.out.println("Average:"+average);
				

	}

}
