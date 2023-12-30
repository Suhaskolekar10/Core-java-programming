//Q.3:-Write a program to swap two variables using a third variable and without using third variable.
import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		//Using third variable
		int a,b,temp;
		Scanner  sc =new Scanner(System.in);
		System.out.println("Enter a & b:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println();
		//without using third variable
		int x,y;
		System.out.println("Enter x & y:");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		

	}

}
