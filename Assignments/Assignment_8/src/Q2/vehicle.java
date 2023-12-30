package Q2;

import java.util.Set;


public class vehicle {
	
	private int vno;
	private String vname;
	private double cost;

	public vehicle(int vno, String vname, double cost) {
		this.vno=vno;
		this.vname=vname;
		this.cost=cost;
	}
	
	

	public double getCost() {
		return cost;
	}
	
	public vehicle() {
		this.vno=1;
		this.vname="audi";
		this.cost=100000;	
	}
	
	public void display()
	{
		System.out.println(vno+" "+vname+" "+cost);
	}

}
