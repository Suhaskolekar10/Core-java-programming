//Write a class Batch in package com.cdac.pack2 members - CourseName and BatchStrength. 
package com.cdac.pack2;

public class Batch {
	private String Course;
	private int BatchStrength;

	public Batch() 
	{
		Course="DAI";
		BatchStrength=39;
	}
	
	public Batch(int BatchStr,String Crse) 
	{
		this.BatchStrength=BatchStr;
		this.Course=Crse;
	}
	
	public void display() 
	{
		System.out.print("Course: "+Course+"BatchStrength: "+BatchStrength);
	}
}
