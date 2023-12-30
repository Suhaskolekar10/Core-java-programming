
class Vehicle implements Cloneable{
	private int number;
	private String name;
	private float price;
	public Vehicle(int number, String name, float price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}
	public Vehicle() {
		super();
		this.number = 1234;
		this.name = "Raj";
		this.price = 10;
	}
	public void Print_Details() {
		System.out.println("Vehicle Number: "+number);
		System.out.println("Vehicle Name: "+name);
		System.out.println("Vehical Price: "+price);
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class Clone {
	public static void main(String []args) throws CloneNotSupportedException{
		Vehicle c1= new Vehicle(101,"Maruti",550000);
		 Vehicle c2=(Vehicle)c1.clone();
		 c2.Print_Details();
	}


}
