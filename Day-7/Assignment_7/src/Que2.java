import java.util.*;

class Vehicle{
	private String Veh_no;
	private String name;
	private double cost;
	
	//Parameterize constructor
	public Vehicle(String veh_no, String name, double cost) {
		Veh_no = veh_no;
		this.name = name;
		this.cost = cost;
	}

	public void display() {
		System.out.println("Veh_no=" + Veh_no + ", name=" + name + ", cost=" + cost + "]");
		
	}
	
	//Getter method for vehicle cost
	public double getCost() {
		return cost;
	}
	
}
public class Que2 {

	public static void main(String[] args) {
		Set<Vehicle> s=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("1. Add new vehicle record");
			System.out.println("2. Display details of all vehicle");
			System.out.println("3. Display detail of maximum and minimum cost vehicles");
			System.out.println("choice : ");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter vehicle detail: (vehicle No, Vehicle name, Vehicle cost)");
				Vehicle v=new Vehicle(sc.next(),sc.next(),sc.nextDouble());
				s.add(v);
				break;
			case 2:
				for(Vehicle val:s)
					val.display();
				break;
			case 3:
				Vehicle vmax=null;
				Vehicle vmin=null;
				double max=0;
				double min=10000000;
				for(Vehicle val:s) {
					if(val.getCost()>max) {
						max=val.getCost();
						vmax=val;
					}
					else if(val.getCost()<min) {
						min=val.getCost();
						vmin=val;
					}
				}
				System.out.println("Vehicle with max cost");
				vmax.display();
				System.out.println("Vehicle with min cost");
				vmin.display();
				break;
			}
		}

	}

}
