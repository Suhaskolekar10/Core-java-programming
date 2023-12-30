package assignment8;
import java.util.*;

public class Utilitylist {
	
	private List<student> lst;
	Scanner sc = new Scanner(System.in);
	
	
	public LinkedList createList()
	{
		lst=new LinkedList<>();
		System.out.println("How many Students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student info: rollno: , name: , percentage: ,skillset: in order");
			int rollno =sc.nextInt();
			String name=sc.next();
			double percentage = sc.nextDouble();
			Set<String> s = new HashSet<>();
			s.add(sc.next());
			s.add(sc.next());
			s.add(sc.next());
			student s1=new student(rollno,name,percentage,s);
			lst.add(s1);
			
		}
		return(LinkedList) lst;		
	}
	
	public void printList() {
		for(student s1:lst)
		{
			s1.display();					
		}
	}
	public Utilitylist() {
		this.lst=new LinkedList<>();
	}
	
	public List<student>getList(){
		return lst;
	}
		
}
