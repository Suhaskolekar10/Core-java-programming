import java.util.Scanner;

class MyThread implements Runnable
{
	private int num1,num2;
	
	Thread t1,t2;
	public MyThread(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		t1=new Thread(this,"t1");
		t2=new Thread(this,"t2");
		t1.start();
		t2.start();	
	}
	public void run() {
		int a_num1=num1;
		int b_num2=num2;
		if(Thread.currentThread()==t1)
		{
			for(int i=a_num1;i<12;i++)
			{
				a_num1+=1;
				System.out.println("10 incremented values are:"+a_num1+" ");
			}
			System.out.println();
		}	
		if(Thread.currentThread()==t2)
		{
			for(int i=1;i<12;i++)
			{
				b_num2=num2*i;
				System.out.println("10 incremented values are:"+b_num2+" ");
			}
			System.out.println();
		}	
	}
}
public class Q2 {

	public static void main(String[] args) {
		
		int num1,num2;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		MyThread t=new MyThread(num1,num2);
	}
}
