package in.cdac;

import java.util.HashSet;
import java.util.Set;

class Student implements Comparable<Student>
{
	private int roll_no;
	private String name;
	private double percentage;
	private Set<String> skillset=new HashSet<>();
	
	
	//Parameterized constructor
	public Student(int roll_no, String name, double percentage, Set<String> skillset) {
		
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;
		this.skillset = skillset;
	}


    //default constructor
	public Student() 
	{
		this.roll_no = 101;
		this.name = "Vishal";
		this.percentage = 97;
		skillset.add("c");
		skillset.add("java");
		skillset.add("Python");

	}

	
	//Getter Setter method
	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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


	public Set<String> getSkillset() {
		return skillset;
	}


	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}	
	
	public void display() {
		System.out.println("roll_no=" + roll_no + ", name=" + name + ", percentage=" + percentage + ", skillset="
				+ skillset);
	}
	
	public int compareTo(Student o) {
		if(this.roll_no > o.roll_no)
			return 1;
		else if (this.roll_no < o.roll_no) {
			return -1;
		}
		else
			return 0;
	}
}
