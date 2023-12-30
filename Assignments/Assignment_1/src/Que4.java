/*Q.4:-Write a program to calculate Net Salary of an employee. Accept Basic Salary (BS) from the user.                                   	
 * HRA is 15% of BS										
 * DA is 30% of BS										
 * PF is 12.5% of GS										
 * Gross Salary is BS + HRA + DA									
 * Net Salary = Gross Salary – PF
*/

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		float Basic_salary,HRA,DA,Gross_salary,PF,Net_salary;
		System.out.println("Enter basic salary:");
		Scanner sc=new Scanner(System.in);
		Basic_salary=sc.nextFloat();
		
		HRA=0.15f*Basic_salary;
		DA=0.3f*Basic_salary;
		Gross_salary=Basic_salary+HRA+DA;
		PF=0.125f*Gross_salary;
		
		Net_salary=Gross_salary-PF;
		
		System.out.println("Net_salary:"+Net_salary);
		

	}

}
