//import static in.stud;
import in.stud.Student;
public class Q3 
{	
	public static void main(String[] args) 
	{
		Student s1=new Student("apple",70);
		System.out.println(s1);
	    Student s2=new Student();
	    System.out.println(s2);
		Student.showCnt();
		
		System.out.println("this is static import..");
			
		System.out.println(s1.getRollno());
		s1.setRollno(103);
		System.out.println(s1.getRollno());
		System.out.println(s1);
	}	
}

