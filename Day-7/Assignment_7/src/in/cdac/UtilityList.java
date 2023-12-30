package in.cdac;

import java.util.*;

public class UtilityList implements Comparable<UtilityList>{
	private List<Student> list; 
	
	Set<String> skillset=new HashSet<>();
	
	Scanner sc=new Scanner(System.in);
	String name;
	int rollno;
	double percentage;
	
	public UtilityList() {
		list=new ArrayList<>();
	}

	//To string method for Utility class
	public void printList() {
		for(Student val:list)
			val.display();
	}
	
	public void createList() {
		System.out.println("Add student data:(rol_no,name,percentage,skillset(3 Nos))");
		rollno=sc.nextInt();
		name=sc.next();
		percentage=sc.nextDouble();
		skillset.add(sc.next());
		skillset.add(sc.next());
		skillset.add(sc.next());
		list.add(new Student(rollno,name,percentage,skillset));
	}
	

	@Override
	public int compareTo(UtilityList o) {
		if(this.rollno > o.rollno)
			return 1;
		else if (this.rollno < o.rollno) {
			return -1;
		}
		else
			return 0;
		
	}

	public List<Student> getList() {
		return list;
	}

	
	
}

