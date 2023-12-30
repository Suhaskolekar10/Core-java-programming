//import in.cdac.Laptop;           //Ordinary import   /1.
import static in.cdac.Laptop.showCnt;
import static java.lang.System.*;   //we can use System.out
public class Tester                               //Main class Tester and method main
{
	public static void main(String[] args) 
	{
		/*Laptop l1=new Laptop(); /1.
		Laptop l2=new Laptop(102,"apple",70000);
		Laptop l3=new Laptop(103,"apple",60000);
		l1.show();
		l2.show();
		l3.show();1.*/
		showCnt();
		out.println("this is static import..");
	}
}

//Counting number of objects of a class
