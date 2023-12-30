interface Polygon{
	public double calcArea();
	public double calcPeri();
	
}
 
class Circle implements Polygon{
	private int radius;
	
	//Default constructor
	public Circle(){
		this.radius=1;
	}
	
	//Parameterized class
	public Circle(int radius){
		this.radius=radius;
	}

	public double calcArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	public double calcPeri() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}
}

class Rectangle implements Polygon{
	private int length;
	private int bredth;
	
	
	//Default constructor
	public Rectangle() {
		super();
	}

	//Parameterized constructor
	public Rectangle(int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	public double calcArea() {
		// TODO Auto-generated method stub
		return length*bredth;
	}

	public double calcPeri() {
		// TODO Auto-generated method stub
		return 2*(length+bredth);
	}
}

class Square extends Rectangle{
	
	//default constructor
	public Square(){
		super();
		
	}
	
	//parameterized constructor
	public Square(int s) {
    	super(s,s);
    	
    }
	
	//method to calculate area of Square
    public double calcArea() {
		return super.calcArea();
	}
    
    //method to calculate Perimeter of Square
	public double calcPeri() {
		return super.calcPeri();
	}	
}

//Triangle and RTriangle for practise
class Triangle implements Polygon{
	
	private int breadth;
	private int height;
	private int a;
	private int b;
	private int c;
	
	public Triangle() {
		breadth=10;
		height=20;
		a=1;
		b=2;
		c=3;
	}
	
	public Triangle(int bb,int h,int a,int b,int c) {
		this.breadth=bb;
		this.height=h;	
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double calcArea() {
		return 0.5*breadth*height;
	}
	
	public double calcPeri() {
		return (a+b+c);
	}
}

class RTriangle extends Triangle{
	public RTriangle(){
		super();
	}
	public RTriangle(int a) {
		super(a,a,a,a,a);
	}
	public double calcArea() {
		return super.calcArea();
	}
	
	public double calcPeri() {
		return super.calcPeri();
	}
}

public class Tester {

	public static void main(String [] args) {
		Polygon p=new Square(10);
		System.out.println(p.calcArea());
		System.out.println(p.calcPeri());
		Polygon t=new Triangle(10,12,4,5,6);
		System.out.println(t.calcArea());
		System.out.println(t.calcPeri());
		RTriangle r=new RTriangle(5);
		System.out.println(r.calcArea());
		System.out.println(r.calcPeri());
	} 
} 





