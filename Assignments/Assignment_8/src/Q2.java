//package Q2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Q2.*;
public class Q2 {
	public static void addRecord(int vno,String vname, double cost, Set<vehicle> s)
	{
		vehicle v = new vehicle(vno,vname,cost);
		s.add(v);
	}
	
	public static void displayAll(Set<vehicle> s)
	{
		for(vehicle v:s)
		{
			v.display();
		}
	}
	
	
	public static void minMaxCost(Set<vehicle> s) {
		double minCost = Integer.MAX_VALUE;
		double maxCost = Integer.MIN_VALUE;
		for(vehicle v:s)
		{
			if(minCost>v.getCost())
				minCost=v.getCost();
			if(maxCost<v.getCost())
				maxCost=v.getCost();
		}
		System.out.println("Maximum cost of vehicle"+maxCost);
		System.out.println("Minimum cost of vehicle"+minCost);
	}
	
	public static void main(String[] args) {
		Set<vehicle> s=new HashSet<>();
		s.add(new vehicle(101,"RE",160000));
		s.add(new vehicle(102,"YAMAHA",130000));
		s.add(new vehicle(103,"HERO",100000));
		Scanner sc = new Scanner(System.in);
		char ch='e';
		while(true)
		{
			System.out.println("a. Add record into hashset");
			System.out.println("b. Display details of vehicles from hashset");
			System.out.println("c.Display details of max and min cost of vehicle");
			ch=sc.next().charAt(0);
			switch(ch)
			{
			case 'a':
				System.out.println("Enter vehicle number ");
				int vno = sc.nextInt();
				System.out.println("Enter vehicle name");
				String vname = sc.next();
				System.out.println("Enter cost of vehicle");
				double vcost = sc.nextDouble();
				addRecord(vno,vname,vcost,s);
				break;
			case 'b':
				displayAll(s);
				break;
			case 'c':
				minMaxCost(s);
				break;
			case 'd':
				System.out.println("Thank you for visiting");
				System.exit(0);
				
			
			}
		}
	}

}

