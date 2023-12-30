package assignment8;
import java.util.*;

public class UtilityReport {
	private Map<String,Double> map;
	Utilitylist list;
	public UtilityReport(Map<String,Double> map, Utilitylist list) {
		this.map=map;
		this.list=list;	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(list,map);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() !=obj.getClass())
			return false;
		UtilityReport other = (UtilityReport) obj;
		return Objects.equals(list, other.list)&& Objects.equals(map, other.map);
	}

	public UtilityReport() {
		map=new LinkedHashMap<>();
		list=new Utilitylist();	
	}
	public void createReport()
	{
		LinkedList<student> l1=list.createList();
		for(student s:l1)
		{
			map.put(s.getName(), s.getPercentage());
		}
	}
	
	public void showReport()
	{
		Set<String> s=map.keySet();
		for(String key:s)
		{
			System.out.println(key+" "+map.get(key));
		}
	}
}
