package in.cdac;

import java.util.Scanner;

public class Tester {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		UtilityList ul =new UtilityList();
		while(true) {
			System.out.println("1. Add new student data");
			System.out.println("2. Show student percentage");
			System.out.println("3. Add new student data");
			switch (sc.nextInt()) {
			case 1:
				
				ul.createList();
				break;
			case 2:
				utilityReort u1=new utilityReort();
				u1.creatReport(ul.getList());
				u1.showReport();
				break;
			}
		}
	}
}
