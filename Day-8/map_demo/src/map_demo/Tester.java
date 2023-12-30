package map_demo;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		
		map.put(101,"maths");
		map.put(102,"Science");
		map.put(101,"English");
		map.put(null, null);            //HashMap accepts null values  while HashTable throws exception
		System.out.println(map);
		
		Set<Integer> s=map.keySet();
		
		for(Integer key:s)
		{
			System.out.println(key+" "+map.get(key));
		}
	}

}
