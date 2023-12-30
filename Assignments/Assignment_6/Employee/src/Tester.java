import java.util.*;
import java.lang.*;
class Employee{
	int employee_id;
	String employee_name;
	double salary;
	public Employee() {
		super();
		this.employee_id = 100;
		this.employee_name ="Madan";
		this.salary = 35000;
	}
	public Employee(int employee_id, String employee_name, double salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.salary = salary;
	} 
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void Display() {
	 System.out.println(employee_id+" "+employee_name+" "+salary);
	}
	
}
public class Tester {
	public static void main(String[] args) {
		Vector<Employee> v=new Vector<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Input the record"+"\n"+"2. Update Informationof specific employee when you are given emp_id"+"\n"+"3.Display all Records"+"\n"+"4.Exit");

		switch (sc.nextInt()) {
		case 1: {
			System.out.println("Please enter the employee_id");
			int id=sc.nextInt();
			System.out.println("Please enter the employee name");
			String name=sc.next();
			System.out.println("Please enter the employee salary");
			int salary=sc.nextInt();
			Employee a=new Employee(id,name,salary);
			v.add(a);
			break ;
			}
		case 2: {
			System.out.println("Please enter the employee id which you want to update");
			int sid=sc.nextInt();
			for(Employee e:v) {
				if(sid==e.getEmployee_id()) {
					System.out.println("Enter updated name and salary");
					e.setEmployee_name(sc.next());
					e.setSalary(sc.nextDouble());
				}
				
			}
			break;
		}
		case 3:{ 
			for(Employee e:v)
			{
				e.Display();
			}
			break;
		}
		case 4: {
			System.out.println("Thanks for visiting. Now you have exit");
			System.exit(0);
		}
       default: {
    	   System.out.println("you have entered wrong choices");
       }
		
		
	}
		}
	}
}
