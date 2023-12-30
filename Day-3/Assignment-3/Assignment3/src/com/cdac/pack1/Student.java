/*Write a class Student in package com.cdac.pack1 members - RollNo and Name.  */

package com.cdac.pack1;

public class Student {
	private int RollNo;
	private String Name;

	public Student()
	{
		RollNo=101;
		Name="Dhoni";		
	}
	
	public Student(int Rno, String Nme) 
	{
		this.RollNo=Rno;
		this.Name=Nme;
	}
	
	public void display()
	
	{
		System.out.println("Roll No: "+RollNo+" Name: "+Name);
	}

}
