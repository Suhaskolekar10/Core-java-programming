class Laptop
{
	private int srno;
	private String make;
	private double cost;
	
	public Laptop()
	{
		srno=101;
		make="hp";
		cost=30000;
		 //System.out.println("no argument constructor..");
	}
	
	public Laptop(int sno, String m, double c)
	{
		srno=sno;
		make=m;
		cost=c;
		//System.out.println("parameterized constructor..");
	}
	
	
	public String toString()
	{
		return srno+"  "+make+"  "+cost;
	}
}

public class Tester {

	public static void main(String[] args) {
		Laptop l1=new Laptop();   //creation of object	
		Laptop l2=new Laptop(102,"dell",43000);		
		Laptop l3=new Laptop();
		
		System.out.println(l1);		
		System.out.println(l2);		
		System.out.println(l3);
			
		/*laptop.init();
		laptop.display();*/
	}
}


/*
public void init()
{
	srno=101;
	make="dell";
	cost=45000;
}
public void display() 
{
	System.out.println(srno+" "+make+"  "+cost);
}

}
*/
