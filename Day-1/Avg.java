import java.util.Scanner;

//Write a program to calculate avergae of five user entered integers
class Avg
{
        public static void main(String [] args)          
        {
        	float a, b,c,d,e;                                                     // Single line comment
        	Scanner sc=new Scanner(System.in);                           //scanner class object  /* Multi line comments  */ 
         	System.out.println("Enter Five numbers:");    
         	
         	a=sc.nextFloat();
         	b=sc.nextFloat();
         	c=sc.nextFloat();
         	d=sc.nextFloat();
         	e=sc.nextFloat();    
         	   	
         	float f=(a+b+c+d+e)/5;   
         		
         	System.out.println("Avg="+f);
        }
 }	
      
