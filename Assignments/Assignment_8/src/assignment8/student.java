package assignment8;
import java.util.*;
public class student implements Comparable<student>{
	private int rollno;
	private String name;
	private double percentage;
	private Set<String> skillset;
	
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
	
	
	public Set<String> getSkillset() {
		return skillset;
	}

	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}

	public student() {
		
		this.rollno=101;
		this.name="Dhoni";
		this.percentage=78;
		this.skillset.add("Java");
		this.skillset.add("Python");
		this.skillset.add("C++");
	}
	
	
	public student(int rno,String nme,double pcntge,Set<String> sset) {
		this.rollno=rno;
		this.name=nme;
		this.percentage=78;
		this.skillset=sset;
	}
	
	public void display()
	{
		System.out.println(rollno+" "+name+" "+percentage+" "+skillset);
	}
	
	public int compareTo(student o)
	{
		if(this.rollno>o.rollno)
			return 1;
		else if (this.rollno<o.rollno)
			return -1;
		else
			return 0;
	}
}

