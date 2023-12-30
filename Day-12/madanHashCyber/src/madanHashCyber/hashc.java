package madanHashCyber;

public class hashc {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cost=1.0;
		
		int result=1;
		
		
		
		long temp, xor;
		temp=Double.doubleToLongBits(cost);
		
		System.out.println(temp);
		
		System.out.println("\n\n1.  "+(temp>>>32));
		
		result=(int)(temp^(temp>>>32));
		
		xor=(temp^(temp>>>32));
		
		System.out.println("\n\n2.  "+result);
		
		System.out.println("\n\n3.  "+xor);
		
		System.out.println("\n\n4.  "+Integer.toBinaryString(result));
		
		System.out.println("\n\n5.  "+Long.toBinaryString(xor));
		
		System.out.println("   \n\n6.  "+Long.toBinaryString(temp));

		System.out.println("XOR\n7.  00000000000000000000000000000000"+Long.toBinaryString(temp>>>32));		
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("5.  "+Long.toBinaryString(xor));
		
	}

}
