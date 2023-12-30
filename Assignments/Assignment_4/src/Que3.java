import Q3.*;

public class Que3 {

	public static void main(String[] args) {
		Employee e1=new Employee(16,"madan",1000000);
		Manager m1=new Manager(1,"suhas",1250000);
		MarketingExecutive me1=new MarketingExecutive(2,"Vishal",1350000,10);
	
		e1.show();
		System.out.println();
		m1.show();
		System.out.println();
		me1.show();
	}
}
