import java.util.Scanner;

//Write a program to calculate avergae of five user entered integers
class Average
{
        public static void main(String [] args)          
        {
        	int a, b,c,d,e;                                                     // Single line comment
        	Scanner sc=new Scanner(System.in);                           //scanner class object  /* Multi line comments  */ 
         	System.out.println("Enter Five numbers:");    
         	
         	a=sc.nextInt();
         	b=sc.nextInt();
         	c=sc.nextInt();
         	d=sc.nextInt();
         	e=sc.nextInt();    
         	   	
         	int f=(a+b+c+d+e)/5;   
         		
         	System.out.println("Avg="+f);
        }
 }	
      
