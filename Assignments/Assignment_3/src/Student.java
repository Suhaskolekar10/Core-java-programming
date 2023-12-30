/*
Write a class Student with members for rollno, name and percentage. 
Implement necessary methods inside class. 
Generate roll number automatically for objects created. 
Use static and take starting value as 101.
*/
public class Student 
{
	private String name;
	private double percentage;
	private int rollno;
	private static int cnt=101;
	
	public Student() 
	{
		rollno=cnt;
		name="Dhoni";
		percentage=80;
		cnt++;				
	}

	public Student(String name, double percent)  //Parameterized Method to call private class to public
	{
		this.rollno=cnt;
		this.name=name;
		this.percentage=percent;
		cnt++;	
	}
	
	public void show()
	{
		System.out.println(rollno+" "+name+" "+percentage);
	}
	
	public static void showCnt()                   //method
	{
		System.out.println("Number of Objects-"+cnt);
	}	
	public static void main(String[] args) {
		
		Student s1=new Student("apple",70);
		s1.show();
		Student s2=new Student();
		s2.show();
}
}


