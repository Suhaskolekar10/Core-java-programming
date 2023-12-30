package set_demo_Hash_Tree;

import java.util.*;

class Product{ //implements Comparable<Product>{
	private int pid;
	private String name;
	private double cost;
	
	//Parameterized constructor
	public Product(int pid, String name, double cost) {
		this.pid = pid;
		this.name = name;
		this.cost = cost;
	}
	
//	public int compareTo(Product o) {
//		if(this.cost > o.cost)
//			return 1;
//		else if(this.cost < o.cost)
//			return -1;
//		else
//			return 0;
//	}
//	
//	
	

	public void display() {
		System.out.println(pid+" "+name+" "+cost);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, name, pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && Objects.equals(name, other.name)
				&& pid == other.pid;
	}
	
	
	
	
}

public class Tester {

	public static void main(String[] args) {
		Set<Product> s=new HashSet<>();
		s.add(new Product(100, "HP", 35000));
		s.add(new Product(101, "apple", 4000));
		s.add(new Product(102, "Lenovo", 4000));
		s.add(new Product(102, "Lenovo", 4000));

		
		for(Product val:s)
			val.display();
		
		Product p1=new Product(104, "Dell", 50000);
		Product p2=new Product(104, "Dell", 50000);
		
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		
		
//		Set<Product> s1=new TreeSet<>();
//		s1.add(new Product(100, "HP", 35000));
//		s1.add(new Product(101, "apple", 75000));
//		s1.add(new Product(102, "Lenovo", 4000));
//		
//		for(Product val:s1)
//			val.display();
	}

}
