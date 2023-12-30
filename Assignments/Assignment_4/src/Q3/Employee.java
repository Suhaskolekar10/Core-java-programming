package Q3;

import in.cd.Date;
public class Employee {
	private int empid;
	private String name;
	private double basicSal;

	public Employee() {
		empid=101;
		name="dhoni";
		basicSal=10000;	
	}
	
	public double getBasicSal() {
		return basicSal;
	}
	
	public Employee(int eid, String nme, double sal)
	{
		this.empid=eid;
		this.name=nme;
		this.basicSal=sal;	
	}
	
	public void show()
	{
		System.out.println("employee id:"+empid);
		System.out.println("name:"+name);
		System.out.println("Basic Salary:"+basicSal);
	}
}
