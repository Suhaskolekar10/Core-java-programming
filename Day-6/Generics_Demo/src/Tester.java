class Algo<G>
{
	public void swap(G a,G b) {
		G temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a: "+a+"   b:"+b);
		
	}
}
public class Tester {

	public static void main(String[] args) {
		Algo<Integer> a=new Algo<>();
		a.swap(10,20);
		
		Algo<String> b=new Algo<>();
		b.swap("Suhas","Vishal");

	}

}
