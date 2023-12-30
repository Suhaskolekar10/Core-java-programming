package set_Demo;
                               //collection:-Set
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		Set<Integer> s1=new LinkedHashSet<>();
		Set<Integer> s2=new TreeSet<>();
		s.add(10);
		s.add(12);
		s.add(16);
		s.add(125);
		s.add(33);
		
		s1.add(10);
		s1.add(12);
		s1.add(16);
		s1.add(125);
		s1.add(33);
		
		s2.add(10);
		s2.add(12);
		s2.add(16);
		s2.add(125);
		s2.add(33);
		
		System.out.println(s+" ");
		System.out.println(s1+" ");
		System.out.println(s2+" ");
	}

}
