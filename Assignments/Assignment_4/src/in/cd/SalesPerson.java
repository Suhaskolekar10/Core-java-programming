package in.cd;

public class SalesPerson extends WageEmployee {
	private int items;
	private double commission;
	
	public SalesPerson()
	{
		this.items=0;
		this.commission=0;
	}
	
	public SalesPerson(int id, String n, int d, int m, int y, int h, int r,int it,double cm)
	{
		super(id,n,d,m,y,h,r);
		this.items=it;
		this.commission=cm;		
	}
	
	public void calcSalary()
	{
		double sal=this.getHours()*this.getRate()+ items*commission;
		System.out.println("SalesPerson Salary:"+sal);
	}
	
	//
	/*public void show()
	{
		super.show();
		System.out.println("items: "+items);
		System.out.println("commission: "+commission);  
	}*/
}
