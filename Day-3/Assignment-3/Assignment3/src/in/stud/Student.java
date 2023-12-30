/*
Q3.Implement getter/setter methods and method “toString” in above class Student.
*/
package in.stud;
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

	public Student(String name, double percent)             //Parameterized Method to call private class to public
	{
		this.rollno=cnt;
		this.name=name;
		this.percentage=percent;
		cnt++;	
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String toString()
	{
		return rollno+" "+name+" "+percentage;
	}
	public static void showCnt()      //method
	{
		System.out.println("Number of Objects-"+cnt);
	}	
}


