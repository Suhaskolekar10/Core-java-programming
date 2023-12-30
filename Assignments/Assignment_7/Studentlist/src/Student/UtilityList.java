package Student;
import Student.*;

import java.util.*;

public class UtilityList {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the roll Number of First Student");
		int r=sc.nextInt();
		System.out.println("Please enter the name of the First Student");
		String na=sc.next();
		System.out.println("Please enter the percentage of first student");
		double per=sc.nextDouble();
		System.out.println("Please enter thenumber of skillset you want to addin first Student");
		int n=sc.nextInt();
		Set<String> s=new HashSet<>();
		for(int i=0;i<n;i++) {
			String a=sc.next();
		s.add(a);
		}
		list.add(new Student(r,na,per,s));
		
		System.out.println("Please enter the roll Number of Second Student");
		int r1=sc.nextInt();
		System.out.println("Please enter the name of the Second Student");
		String na1=sc.next();
		System.out.println("Please enter the percentage of Second student");
		double per1=sc.nextDouble();
		System.out.println("Please enter thenumber of skillset you want to addin Second Student");
		int n1=sc.nextInt();
		Set<String> s1=new HashSet<>();
		for(int i1=0;i1<n1;i1++) {
			String a=sc.next();
		s1.add(a);
		}
		list.add(new Student(r1,na1,per1,s1));
		
		System.out.println("Please enter the roll Number of Third Student");
		int r2=sc.nextInt();
		System.out.println("Please enter the name of the Third Student");
		String na2=sc.next();
		System.out.println("Please enter the percentage of Third student");
		double per2=sc.nextDouble();
		System.out.println("Please enter the number of skillset you want to addin Third Student");
		int n2=sc.nextInt();
		Set<String> s2=new HashSet<>();
		for(int i2=0;i2<n2;i2++) {
			String a=sc.next();
		s2.add(a);
		}
		list.add(new Student(r2,na2,per2,s2));
		System.out.println("Original datagiven by User");
		for(Student l:list) {
			l.display();
		}
		System.out.println("Sorting by Percentage");
			Collections.sort(list);
			for(Student l:list) {
				l.display();
		}
	 System.out.println("Sorting by Roll Number");
	 Collections.sort(list,new CompareStudent());
		for(Student l:list) {
			l.display();
	}
}
}