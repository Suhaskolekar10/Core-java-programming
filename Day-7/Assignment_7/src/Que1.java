import java.util.*;
import java.util.HashSet;
import java.util.Set;
import in.cdac.*;



public class Que1 {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		List<Student> l1 = new ArrayList<>();
		UtilityList u1=new UtilityList();	
		Map<String, Double> m = new HashMap<>();
		utilityReort ur = new utilityReort(m);
		int choice;
		while(true)
		{
			System.out.println("1. Enter new employee:");
			System.out.println("2. all details:");
			System.out.println("3. Sort according to roll_no:");
			System.out.println("4. Sort according to percentage:");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				u1.createList();
				break;
			case 2:
				u1.printList();
				break;
			case 3:
				Collections.sort(u1.getList());
				break;
			case 4:
				Collections.sort(u1.getList(),new CompareStudent());
			case 5:
				ur.show_report(list);
				break;

				
			}
		}
	}
}
