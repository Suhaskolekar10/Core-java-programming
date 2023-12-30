/*Using switch-case construct, write a menu driven program to perform basic calculations 
 (addition, subtraction, multiplication and division) on two user entered numbers.
 */

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		int num1,num2,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 & num2:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your choice");
		choice=sc.nextInt();
		
	    switch(choice){    
	    case 1:    
	        int Addition=num1+num2;
	        System.out.println("Addition:"+Addition);
	        break;  
	    case 2:
	    	int Subtraction=num1-num2;
	        System.out.println("Subtraction:"+Subtraction);
	        break;
	    case 3:    
	        int Multiplication=num1*num2;
	        System.out.println("Multiplication:"+Multiplication);
	        break;  
	    case 4:
	    	int Division=num1/num2;
	        System.out.println("Division:"+Division);
	        break;
	        
	    default:   
	    	System.out.println("you Entered wrong choice");
	       
	    }    
		

	}

}
