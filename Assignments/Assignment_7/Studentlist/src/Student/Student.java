package Student;
import java.util.*;
public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private double percentage;
	private Set<String> skillset;
	
	
	public Student(int rollno, String name, double percentage, Set<String> skillset) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.skillset = skillset;
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
	
	public Set<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+percentage+" "+skillset);
	}
	
	
	@Override
	public int compareTo(Student o) {
		if(this.percentage>o.percentage) {
			return 1;
		}
		else if(this.percentage<o.percentage){
			return -1;
		}
		else
			return 0;
	}

	
	class CompareStudent implements Comparator<Student>
	{

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getRollno()>o2.getRollno())
				return 1;
			else if(o1.getRollno()<o2.getRollno())
				return -1;
			else
				return 0;
			}
		
}
}
