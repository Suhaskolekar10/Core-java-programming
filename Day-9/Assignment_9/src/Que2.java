import java.util.Scanner;

class MyThread implements Runnable
		{
			private int num;
			
			Thread t1,t2;
			public MyThread(int num)
			{
				this.num=num;
				t1=new Thread(this,"t1");
				t2=new Thread(this,"t2");
				t1.start();
				t2.start();
			}
			
			public void run()
			{
				int a_num=num;
				int b_num=num;
				if(Thread.currentThread()==t1)
				{
					for(int i=0;i<10;i++)
					{
						a_num+=1;
						System.out.print("incr: "+a_num+"  ");						
					}
					System.out.println();
				}
				else if (Thread.currentThread()==t2)
				{
					for(int i=1;i<11;i++)
					{
						b_num=num*i;
						System.out.print("table: "+b_num+"  ");
					}
				}
			}
}
		
public class Que2 {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		MyThread t=new MyThread(num);
	}

}
