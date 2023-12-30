package Q3;

public class MarketingExecutive extends Employee{
	private int kmstrv;
	private int tourAllwnce;
	private static int teleAlwnce = 2000;
	private double GrossSal,NetSal,PF;

	public MarketingExecutive() {
		super();
		this.kmstrv=5;
		this.tourAllwnce=5000;	
	}
	
	public MarketingExecutive(int empid,String name,double basicSal,int kmt) {
		super(empid,name,basicSal);
		this.kmstrv=kmt;
		this.tourAllwnce= 5*kmt;		
	}
	
	public void show()
	{
		super.show();
		System.out.println("kilometeres Travelled:"+kmstrv);
		System.out.println("Tour Allowance:"+tourAllwnce);
		System.out.println("Telephone Allowance:"+teleAlwnce);
	}
	
	public void calcGrossS()
	{
		GrossSal=this.getBasicSal()+this.tourAllwnce+this.teleAlwnce;
		System.out.println("Gross Salary:"+GrossSal);
	}
	
	public void calcNetS()
	{
		PF=0.125*this.getBasicSal();
		NetSal=GrossSal-PF;
		System.out.println("Net Salary:"+NetSal);	
	}
}
