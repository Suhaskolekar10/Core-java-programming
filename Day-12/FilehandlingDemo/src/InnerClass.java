interface A{
	public void show();
}
public class InnerClass {
	public static void main(String []args) {
		A a=new A(){
			public void show() {
				System.out.println("This is anonymous inner class demo.., Would be implemente in Lambda expression");
			}
		};
		a.show();
	}
}
