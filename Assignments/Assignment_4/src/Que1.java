import in.c.Student;

public class Que1 {

	public static void main(String[] args) {	
		int cnt;
		cnt=3;
		Student []a=new Student[cnt];
		for(int i=0;i<cnt;i++)
		{
			a[i]=new Student();
			a[i].accept();
		}
		for(int i=0;i<cnt;i++)
		{
			a[i].show();
		}
	}
}