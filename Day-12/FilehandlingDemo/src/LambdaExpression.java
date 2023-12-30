import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

interface B{
	public void show();
}
public class LambdaExpression {

	public static void main(String[] args) {
		B a= () -> System.out.println("This is Lambda Expression..");
		a.show();
		
		List<Integer> list=Arrays.asList(23,52,58,569,65,600);
		list.forEach((x) -> System.out.print(x+ " ")); //printing using Lambda...
		System.out.println();
		
		Stream<Integer> stream=list.stream();
		long cnt =stream.count();                     //Counting number of values in ArrayList...
		System.out.println("Number of values:"+cnt);
		
		//Stream.forEach((x) ->System.out.print(x+" ");
		//Sysem.out.println();
		
		
		list.stream().map((t)->t*2).forEach((t)-> System.out.print(t+" ")); 
		System.out.println();                                       //Doubling each element of ArrayList
		
		list.stream().filter((t)->t%2==1).forEach((t)-> System.out.print(t+" "));
		                                                            //Printing only odd numbers 
		
		
	}

}
