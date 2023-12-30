package in.dac;   //Package

public class Employee {                     //Main Class

	private int empid;
	private String name;
	private Date dob;
	
    public Employee() //Constructor -same name as classs name -Special Method
    {
    	empid=101;
    	name="abc";
    	dob=new Date();
    }

	public Employee(int id, String n,int d,int m,int y) {   //Parameterized cosntructor
		empid = id;
		name = n;
		dob = new Date(d,m,y);
	}
    
	public void show()   //Method
	{
		System.out.println("Employee:-");
		System.out.println("Eid: "+empid);
		System.out.println("name: "+name);
		dob.show();
	}   
}



