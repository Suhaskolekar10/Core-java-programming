/*Q.5:-Write a program to accept the basic salary and total sales amount for a salesperson and calculate commission according to 
 sales amount. Display the net salary and commission earned. 
 (Net Salary = Basic Salary + Commission) The range is as follows.

Sales Amount in Rupees           Commission on Sales 
5000 to 7500                         3%
7501 to 10500                        8%
10501 to 15000                       11%
15000 and above                      15%
*/

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		float Basic_salary,Total_sales,Commission,Net_salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic_salary and Total_sales:");
		Basic_salary=sc.nextFloat();
		Total_sales=sc.nextFloat();
		
		if (Total_sales>=5000 && Total_sales<=7500)
		{
			Commission=0.03f*Total_sales;
			Net_salary=Basic_salary+Commission;
			System.out.println("Commission:"+Commission);
			System.out.println("Net salary:"+Net_salary);
		}
		else if (Total_sales>=7501 && Total_sales<=10500)
		{
			Commission=0.08f*Total_sales;
			Net_salary=Basic_salary+Commission;
			System.out.println("Commission:"+Commission);
			System.out.println("Net salary:"+Net_salary);
		}
		else if (Total_sales>=10501&& Total_sales<=15000)
		{
			Commission=0.11f*Total_sales;
			Net_salary=Basic_salary+Commission;
			System.out.println("Commission:"+Commission);
			System.out.println("Net salary:"+Net_salary);
		}
		if (Total_sales>15000)
		{
			Commission=0.15f*Total_sales;
			Net_salary=Basic_salary+Commission;
			System.out.println("Commission:"+Commission);
			System.out.println("Net salary:"+Net_salary);
		}
		
	}

}
