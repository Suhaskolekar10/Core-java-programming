import java.awt.*;

class MovingCircle2 extends Frame implements Runnable{
	private Thread t1;
	private int x,y;
	
	public MovingCircle2() {
		this.x=50;
		this.y=50;
		t1=new Thread(this, "a");
		t1.start();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, x/3, y/3);
	}

	public void run() {
		boolean flag=false;
		boolean flag2=false;
		while(true) {
			if(x==this.getWidth()-x/3)
				flag=true;
			else if(x==0)
				flag=false;
			else if(y==this.getHeight()-y/3)
				flag2=true;
			else if(y==0)
				flag2=false;
			
			if(flag==false) {
				x++;
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(flag==true) {
//				x--;
//				try {
//					Thread.sleep(30);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				y++;
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(flag2==false) {
				y--;
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(flag2==true) {
//				y--;
//				try {
//					Thread.sleep(30);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				x++;
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			repaint();
		}
	}
}
public class Tester2 {

	public static void main(String[] args) {
		MovingCircle2 mc2=new MovingCircle2();
		mc2.setSize(600,600);
		mc2.setVisible(true);

	}

}
