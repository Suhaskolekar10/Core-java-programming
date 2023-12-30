package in.c;

import java.util.Scanner;

public class Student {
	private int roll_no;
	private String name;
	private Date dob;
	
    public Student()
    {
    	roll_no=101;
    	name="abc";
    	dob=new Date();
    }

	public Student(int id, String n,int d,int m,int y) {
		roll_no = id;
		name = n;
		dob = new Date(d,m,y);
	}
    
	Scanner  sc=new Scanner(System.in);	
	public void accept()
	{
		System.out.println("Enter info");
		System.out.println("Roll No:");
		roll_no=sc.nextInt();
		System.out.println("Name:");
		name=sc.next();
		System.out.println("Enter Date, month and year one by one:");
		dob=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());		
	}
	
	public void show()
	{
		System.out.println("Student Details:-");
		System.out.println("RollNo: "+roll_no);
		System.out.println("Name: "+name);
		dob.show();
	} 
	
}
