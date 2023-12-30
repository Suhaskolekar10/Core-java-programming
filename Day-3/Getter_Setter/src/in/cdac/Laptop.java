package in.cdac;

public class Laptop
{
	private int srno;
	private String make;
	private double cost;
	private static int cnt;
	
	public Laptop()
	{
		srno=101;
		make="hp";
		cost=25000;
		cnt++;				
	}
	
	public Laptop(int srno,String make, double cost)             //Parameterized Method to call private class to public
	{
		this.srno=srno;
		this.make=make;
		this.cost=cost;
		cnt++;
	}
	
	public void show()
	{
		System.out.println(srno+" "+make+" "+cost);
	}
	public static void showCnt()                   //method while calling static variable into a method, we need to give static
	{
		System.out.println("Number of Objects-"+cnt);
	}
}


