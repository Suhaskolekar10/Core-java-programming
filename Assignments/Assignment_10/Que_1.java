package assignment_10;

import java.awt.*;


class FillOval extends Frame implements Runnable{
	Thread t1;
	int x1,x2,radius;
	
	//Default constructor
	public FillOval() {
		t1=new Thread(this,"abc");
		this.x1 = 20;
		t1.start();
		
	}

	//Using fillOval method to create Oval
	//To color fill the oval
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
        g.fillOval(x1, 300, 120, 120);
    }

	public void run() {
		boolean flag=false;
		while(true) {
			if(x1==this.getWidth()-120)
				flag=true;
			else if(x1==0)
				flag=false;
			
			if(Thread.currentThread()==t1)
			{
				if(flag==false)
				{
					x1++;
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else if(flag==true)
				{
					x1--;
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			repaint();
		}
		
	}
}

public class Que_1 {
	public static void main(String []args) {
		FillOval fo=new FillOval();
		fo.setSize(600,600);
		fo.setVisible(true);
	}
}
