
class Stack<G>{
	private int size;
	private G [] arr;
	private int top;
	
	
	//Default Constructor
	public Stack () {
		size = 5;
		arr=(G[])new Object[size];
		top=-1;
	}

	
	//Parameterized Constructor
	public Stack(int size) {
		this.size = size;
		this.arr =(G[])new Object[size];
		this.top = -1;
	}
	
	//Push method
	public void push(G val) {
		if(!isFull()) 
			arr[++top]=val;
		else
			System.out.println("Stack overflow!");
	}
	
	//Pop method
	public G pop() {
		if(!isEmpty())
			return arr[top--];
		else
			return (G)"Stack underflow"; //Type casting String to G, as return type is generic
	}
	
	//Isfull method
	public boolean isFull() {
		return top==size-1;
	}
	
	//isEmpty method
	public boolean isEmpty() {
		return top==-1;
	}
	
}
public class stack {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println();
		
		Stack<String> s1=new Stack<>(3);
		s1.push("Vishal");
		s1.push("Suhas");
		s1.push("Madan");
		s1.push("Agam");
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
	}

}
