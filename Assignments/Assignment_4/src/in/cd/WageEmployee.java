package in.cd;

public class WageEmployee extends Employee {
	private int hours;
	private int rate;
	
	public WageEmployee()
	{
		hours=0;
		rate=0;
	}
	
	public WageEmployee(int id, String n, int d, int m, int y, int h, int r)
	{
		super(id,n,d,m,y);
		hours=h;
		rate=r;
	}
		
	public int getHours() {
		return hours;
	}

	public int getRate() {
		return rate;
	}

	public void show()
	{
		super.show();
		System.out.println("hours: "+hours);
		System.out.println("rate: "+rate);  	
	}
	
	public void calcSalary()
	{
		double sal = hours*rate;
		System.out.println("WageEmployee Salary:"+sal);
	}
}
