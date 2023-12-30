import in.cd.Employee;
import in.cd.WageEmployee;
import in.cd.SalesPerson;

public class Que2 

{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(16,"madan",16,11,1995);
		WageEmployee we1=new WageEmployee(102,"jay",3,10,1990,10,900);
		SalesPerson sp1=new SalesPerson(203,"Raj",3,10,1995,10,900,5,50);
		e1.show();
		System.out.println();
		System.out.println("Wage");
		we1.show();
		System.out.println();
		System.out.println("SalesPerson");
		sp1.show();
		we1.calcSalary();
		we1.show();
		sp1.calcSalary();
		sp1.show();
	}
}
