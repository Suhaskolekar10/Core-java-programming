package Q3;

public class Manager extends Employee {
	private double petrolAlwnce;
	private double foodAlwnce;
	private double otherAlwnce;
	private double GrossSal,NetSal,PF;
	
	public Manager() {
		super();
		this.petrolAlwnce = 0.08*this.getBasicSal();
		this.foodAlwnce = 0.12*this.getBasicSal();
		this.otherAlwnce = 0.04*this.getBasicSal();	
	}

	public Manager(int empid, String name, double sal)
	{
		super(empid,name,sal);
		this.petrolAlwnce=0.08*sal;
		this.foodAlwnce=0.12*sal;
		this.otherAlwnce=0.04*sal;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Petrol Allownace:" +petrolAlwnce);
		System.out.println("Food Allowance:"+foodAlwnce);
		System.out.println("Other Allownace:"+otherAlwnce);
	}
	
	public void calcGrossS()
	{
		GrossSal=this.getBasicSal()+this.petrolAlwnce+this.foodAlwnce+this.otherAlwnce;
		System.out.println("Gross Salary:"+GrossSal);
	}
	
	public void calcNetS()
	{
		PF=0.125*this.getBasicSal();
		NetSal=GrossSal-PF;
		System.out.println("Net Salary:"+NetSal);
	}
}
