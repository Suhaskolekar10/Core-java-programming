//Q.10:-Write a program to generate all possible combinations of 1, 2, 3 using for loop.
public class Que10 {

	public static void main(String[] args) {
		int i,j,k;
		for (i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				for(k=1;k<=3;k++)
				{
					if (i!=j && i!=k && j!=k)
					{
						System.out.println(i+""+j+""+k);	
					}
				}
			}
		}
	}

}
