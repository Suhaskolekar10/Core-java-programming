import java.io.*;
	/*
	Serialization:- it is a process of saving the state of the object into a binary file..
	
	 De-serialization:- it is a process of re-construction of an object from its saved state into a binary file
	 
	 transient:- it is a keyword used with attribute of a class to avoid serialization of that perticular attribute
	*/
class Laptop implements Serializable{
	private int lid;
	private String make;
	private double cost;
	
	
	public Laptop(int lid, String make, double cost) {
		super();
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}

	public String toString() {
		return "Laptop [lid=" + lid + ", make=" + make + ", cost=" + cost + "]";
	}
	
	
	
}
public class Tester {

	public static void main(String[] args) {
		File file=new File("/home/dai/Desktop/xyz.dat");
		try {
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(new Laptop(101,"hp",34000));
			oos.writeObject(new Laptop(102,"Lenovo",31000));
			oos.close();
			fos.close();
			System.out.println("Object is saved..");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		try {
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Laptop l1=(Laptop)ois.readObject();
			System.out.println(l1);
			Laptop l2=(Laptop)ois.readObject();
			System.out.println(l2);
			ois.close();
			fis.close();
		}catch (Exception e) {}
		}

 }

