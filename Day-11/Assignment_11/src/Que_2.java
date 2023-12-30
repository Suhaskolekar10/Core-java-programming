import java.io.*; 

class ReadFile implements Runnable{
	
	private Thread t1,t2;
	char [] s1=new char [100];
	//Default constructor
	public ReadFile() {
		t1=new Thread(this, "abc");
		t2=new Thread(this, "acd");
		t1.start();
		t2.start();
	}
	
	public void run() {
			
			if(Thread.currentThread()==t1) {
				try {
					synchronized(this){
					FileReader fr=new FileReader("/home/dai/Desktop/Java_Basics/src.txt");
					fr.read(s1);
					System.out.println(s1);
					Thread.sleep(20);
					}
				} catch (Exception e) {}
			}else if(Thread.currentThread()==t2){
				try{
					synchronized(this) {
					FileWriter fw=new FileWriter("/home/dai/Desktop/Java_Basics/dest2.txt");
					fw.write(s1);
					fw.close();
					System.out.println("Written sucessfully");
					Thread.sleep(20);
					}
				}catch (Exception e) {}
			
		}		
	}	
}

public class Que_2 {
	public static void main(String[]args) {
		ReadFile rd=new ReadFile();
		
	}
}
