//Multithreading:- using thread class
class FirstThread extends Thread
{
	public void run()
	{
		for (int i=0;i<1000;i++)
		{
			System.out.println("First thread running");
		}
	}
}

class SecondThread extends Thread
{
	public void run()
	{
		for (int i=0;i<1000;i++)
		{
			System.out.println("Secod thread running");
		}
	}
}





public class Tester1 {

	public static void main(String[] args) {
		FirstThread ft=new FirstThread();
		SecondThread st=new SecondThread();
		ft.start();
		st.start();

	}

}
